package datasuorcetwo.datasource.threadpool;

import datasuorcetwo.datasource.baseInterface.BaseServerInte;
import datasuorcetwo.datasource.entity.BaseEntity;
import datasuorcetwo.datasource.timer.UpdateTableTimer;

import java.util.*;

/**
 * run方法是同步出去data的部分
 * @param <T>
 */
public class UpdateRunnable<T> implements Runnable {

    private int productMaxId;

    public void setProductMaxId(int productMaxId) {
        this.productMaxId = productMaxId;
    }

    // 起点Id
    private int basisBase = 1;
    public void setBasisBase(int basisBase) {
        this.basisBase = basisBase;
    }

    // 增长基数
    private int increaseBase;
    public void setIncreaseBase(int increaseBase) {
        this.increaseBase = increaseBase;
    }

    // 循环次数
    private int cycleCount;
    public void setCycleCount(int cycleCount) {
        this.cycleCount = cycleCount;
    }

    private String name;
    public void setName(String name) {
        this.name = name;
    }

    private BaseServerInte<T> product;
    private BaseServerInte<T> local;
    public void setProduct(BaseServerInte product) {
        this.product = product;
    }
    public void setLocal(BaseServerInte local) {
        this.local = local;
    }

    @Override
    public void run() {
        long l = System.currentTimeMillis();
        for(int i = 0; i < cycleCount; i++){
            // 获取两个表中同一个区间的数据
            long l1 = System.currentTimeMillis();
            List<T> localBetweenData = local.getBetweenData(basisBase, (basisBase + increaseBase));
            List<T> productBetweenData = product.getBetweenData(basisBase, (basisBase + increaseBase));
            long l2 = System.currentTimeMillis();
            System.out.println("时间：" + UpdateTableTimer.dateFormat.format(new Date()) + " " + name + "：第 " + i + " 次获取 " + basisBase + " - " + (basisBase + increaseBase) + " 耗时：" + (l2 - l1) + "ms");
            // 如果 productBetweenData == null，分两种情况，一种是游标还未到达最后一位，则继续，如果游标大于最后一位，说明后面没有数据了，则退出
            if(productBetweenData.isEmpty()){
                if(basisBase > productMaxId){
                    break;
                }else {
                    basisBase = basisBase + increaseBase;
                }
                continue;
            }
            // 如果 localBetweenData == null，那么则将 productBetweenData 添加到目标数据库中
            if(localBetweenData.isEmpty()){
                long l3 = System.currentTimeMillis();
                local.insert(productBetweenData);
                long l4 = System.currentTimeMillis();
                System.out.println("时间：" + UpdateTableTimer.dateFormat.format(new Date()) + " " + name + "：" + basisBase + " - " + (basisBase + increaseBase) + " 为null，添加 " + productBetweenData.size() + " 个耗时：" + (l4 - l3) + "ms");
                basisBase = basisBase + increaseBase;
                continue;
            }
            /*
             * 1、将两个list转换为set集合，然后 目 减去 源 则是目标数据库需要删除与修改的数据
             * 2、源 减去 目 则是目标数据库需要添加与修改的数据
             * 总结：这样做虽然可能将目与源都有但属性值不一样的数据删除了（其实修改就行了），然后在进行添加，
             *  可能这比较多余，但是总的来说，比一个一个的去比对要方便得多，因为一个一个比对可能会涉及到双重循环。
             * 注：但是如果集合中是对象，那么除非是一个对象，否则进行运算都会当成不同的对象，因此上面所有list中的对象
             *  都是不一样的对象，虽然可能对象中的属性值一模一样，这是由于object中的hashcode造成的，因此如果需要使得
             *  两个属性一样的对象在set中当成一个，必须得重写object中的hashcode和equals方法，重写hashcode方法是保证
             *  两个对象属性值一样但地址值不一样的对象的hashcode的值一样；（因此在baseEntity中重写这两个方法即可）
             */
            // 这两个用来计算：目 - 源 = 目标数据库应该删除（与修改）的
            Set<T> pSet = new HashSet<>(productBetweenData);
            Set<T> lSet = new HashSet<>(localBetweenData);
            lSet.removeAll(pSet);
            /*
             * 需要先删除的作用在于：如果不要这一步，那么下面的insert就相当于update操作；但是如果没有这一步，假如源数据库中有一条
             * 记录被删除了，但是目标数据库还有记录，这样就会导致目标数据库那条记录永远存在。而加上这一步，虽然会把已存在的设备先
             * 删除掉，但是可以完全保证数据同步（即：每个数据都完全一样。）
             */
            if(!lSet.isEmpty()){
                long l5 = System.currentTimeMillis();
                local.deleteByIterator(lSet);
                long l6 = System.currentTimeMillis();
                // 记录删除的id
                StringBuilder ids = new StringBuilder();
                for(T t : lSet){
                    ids.append(((BaseEntity) t).getId() + ",");
                }
                System.out.println("时间：" + UpdateTableTimer.dateFormat.format(new Date()) + " " + name + "：删除" + basisBase + " - " + (basisBase + increaseBase) + " 之间 " + lSet.size() + " 个数据，id是("+
                        ids.toString()+")耗时：" + (l6 - l5) + "ms");
            }

            // 这两个用来计算：源 - 目 = 目标数据库应该添加（与修改）的
            Set<T> p1Set = new HashSet<>(productBetweenData);
            Set<T> l1Set = new HashSet<>(localBetweenData);
            p1Set.removeAll(l1Set);
            if(!p1Set.isEmpty()){
                long l7 = System.currentTimeMillis();
                local.insert(new ArrayList<>(p1Set));
                long l8 = System.currentTimeMillis();
                StringBuilder ids = new StringBuilder();
                for(T t : p1Set){
                    ids.append(((BaseEntity) t).getId() + ",");
                }
                System.out.println("时间：" + UpdateTableTimer.dateFormat.format(new Date()) + " " + name + "：添加" + basisBase + " - " + (basisBase + increaseBase) + " 之间 " + p1Set.size() + " 个数据，id是("+
                        ids.toString()+")耗时：" + (l8 - l7) + "ms");
            }
            basisBase = basisBase + increaseBase;
        }
        long ll = System.currentTimeMillis();
        System.out.println("时间：" + UpdateTableTimer.dateFormat.format(new Date()) + " " + name + "：总耗时：**************************************************：" + (ll - l) + "ms");
    }
}
