package datasuorcetwo.datasource.threadpool;

import datasuorcetwo.datasource.baseInterface.DataBaseServerInte;
import datasuorcetwo.datasource.entity.BaseEntity;
import datasuorcetwo.datasource.timer.UpdateTableTimer;

import java.util.Date;
import java.util.List;

/**
 * run方法是同步data部分
 * 使用泛型，注入泛型对象，该泛型需要实现了 BaseServerInte 这个接口，方便后面任务的通用
 * @param <T>
 */
public class UpdateDataRunnable<T> implements Runnable{

    // 名称
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    // 起始值
    private int basisBase;
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

    private DataBaseServerInte<T> dataProduct;
    private DataBaseServerInte<T> dataLocal;
    public void setDataProduct(DataBaseServerInte<T> dataProduct) {
        this.dataProduct = dataProduct;
    }
    public void setDataLocal(DataBaseServerInte<T> dataLocal) {
        this.dataLocal = dataLocal;
    }

    /**
     * 该方式是一个线程只插入 (increaseBase * cycleCount) 条数据，调用的时候通过循环控制10条线程进行插入
     */
    @Override
    public void run() {

        long l = System.currentTimeMillis();
        // 循环cycleCount次，则插入increaseBase * cycleCount条数据
        for(int i = 0; i < cycleCount; i++){
            // 获取源数据库的1w条记录
            long l2 = System.currentTimeMillis();
            List<T> inserts = dataProduct.get1wData(basisBase, basisBase + increaseBase);
            long l3 = System.currentTimeMillis();
            System.out.println("时间：" + UpdateTableTimer.dateFormat.format(new Date()) + " " + name + "：第" + i + "次获取 " + basisBase + " - " + (basisBase + increaseBase) + " 耗时：" + (l3 - l2) + "ms");
            // 插入目标数据库
            if(!inserts.isEmpty()){
                long l4 = System.currentTimeMillis();
                dataLocal.insert(inserts);
                long l5 = System.currentTimeMillis();
                // 记录插入的id，以免发生意外
                StringBuilder stringBuilder = new StringBuilder();
                for (T t : inserts){
                    stringBuilder.append(((BaseEntity) t).getId() + ",");
                }
                System.out.println("时间：" + UpdateTableTimer.dateFormat.format(new Date()) + " " + name + "：第" + i + "插入 " + basisBase + " - " + (basisBase + increaseBase) + " （最后一个数的id=" + ((BaseEntity) inserts.get(inserts.size() - 1)).getId() + "）耗时：" + (l5 - l4) + "ms");
            }else {
                break;
            }
            basisBase = basisBase + increaseBase;
        }
        long l1 = System.currentTimeMillis();
        System.out.println("时间：" + UpdateTableTimer.dateFormat.format(new Date()) + " " + name + "：**************************************************总耗时：" + (l1 - l) + "ms");
    }

    /**
     * 该方式是一个线程直接将一个表格的数据同步，如果表格数据量很大，则花费的时间很多
     */
//    @Override
//    public void run() {
//        /*
//         * 如果是设备的数据，那么之前已经同步了一部分数据，还剩下之后的一少部分数据（但是量还是比较多，比如几十万条），
//         * 那么做法如下：
//         * 从目标数据库查询最大的id，源数据库中该id之后的数据拿出来，然后添加到目标数据库中
//         * 但是每次拿出来的量不宜过多，最大定为1w条数据，因为需要不断循环
//         *
//         */
//        // 目标数据库获取最大id
//        long l = System.currentTimeMillis();
//        Integer localMaxId = dataLocal.getMaxId();
//        if(localMaxId == null){
//            // 获取源数据库的最小id
//            localMaxId = dataProduct.getMinId();
//        }
//        System.out.println(localMaxId);
//        for(;;){
//            // 获取源数据库的1w条记录
//            long l2 = System.currentTimeMillis();
//            List<T> inserts = dataProduct.get1wData(localMaxId, localMaxId + increaseBase);
//            long l3 = System.currentTimeMillis();
//            System.out.println("获取 " + localMaxId + " - " + (localMaxId + increaseBase) + " 耗时：" + (l3 - l2) + "ms");
//            // 插入目标数据库
//            if(!inserts.isEmpty()){
//                long l4 = System.currentTimeMillis();
//                dataLocal.insert(inserts);
//                long l5 = System.currentTimeMillis();
//                System.out.println("插入 " + localMaxId + " - " + (localMaxId + increaseBase) + " 耗时：" + (l5 - l4) + "ms");
//            }else {
//                break;
//            }
//            localMaxId = localMaxId + increaseBase;
//        }
//        long l1 = System.currentTimeMillis();
//        System.out.println("总耗时：" + (l1 - l));
//    }
}
