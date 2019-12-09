package datasuorcetwo.datasource.threadpool;

import datasuorcetwo.datasource.baseInterface.NbBaseServerInte;
import datasuorcetwo.datasource.timer.UpdateTableTimer;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class UpdateNbRunnable<T> implements Runnable {

    // 名称
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    // 起始时间
    private Date basisDate;

    public void setBasisDate(Date basisDate) {
        this.basisDate = basisDate;
    }

    // 源库最大的一个时间，用于监测数据是否获取完成
    private Date productMaxCreateTime;

    public void setProductMaxCreateTime(Date productMaxCreateTime) {
        this.productMaxCreateTime = productMaxCreateTime;
    }

    private NbBaseServerInte<T> dataNbProduct;
    private NbBaseServerInte<T> dataNbLocal;

    public void setDataNbProduct(NbBaseServerInte<T> dataNbProduct) {
        this.dataNbProduct = dataNbProduct;
    }

    public void setDataNbLocal(NbBaseServerInte<T> dataNbLocal) {
        this.dataNbLocal = dataNbLocal;
    }

    @Override
    public void run() {
        int count = 0;
        long l = System.currentTimeMillis();
        /*
         * 1、可以循环24次，即i=25，每次循环同步1个小时的数据，即Calendar.HOUR_OF_DAY，1，就是一天
         * 2、还可以循环48次，即i=49，每次循环同步半个小时的数据，即Calendar.MINUTE，30，就是一天
         */
        for(int i = 1; i < 13; i++){
            Date nextOnHourDate = UpdateTableTimer.nextOneHourOrDayDate(basisDate, Calendar.MINUTE, 5);
            if(nextOnHourDate != null){
                // 获取时间段内的数据
                long l1 = System.currentTimeMillis();
                List<T> productOneHourData = new ArrayList<>();
                // 判断 nextOnHourDate 是否大于 productMaxCreateTime
                if(nextOnHourDate.after(productMaxCreateTime)){
                    productOneHourData = dataNbProduct.getBetweenCreateTime(basisDate, productMaxCreateTime);
                }else {
                    productOneHourData = dataNbProduct.getBetweenCreateTime(basisDate, nextOnHourDate);
                }
                long l2 = System.currentTimeMillis();
                if(!productOneHourData.isEmpty()){
                    System.out.println("时间：" + UpdateTableTimer.dateFormat.format(new Date()) + " " + name +
                            "：第" + i + "次获取 " + UpdateTableTimer.dateFormat1.format(basisDate) + " 到 " + UpdateTableTimer.dateFormat1.format(nextOnHourDate) +
                            " 之间的数据 " + productOneHourData.size() + " 条，耗时：" + (l2 - l1) + " ms");
                    count = count + productOneHourData.size();
                    long l3 = System.currentTimeMillis();
                    // -----------------直接添加500条数据左右，需要14-18s-------------------
                    dataNbLocal.insert(productOneHourData);
                    long l4 = System.currentTimeMillis();
                    System.out.println("时间：" + UpdateTableTimer.dateFormat.format(new Date()) + " " + name +
                            "：第" + i + "次插入 " + UpdateTableTimer.dateFormat1.format(basisDate) + " 到 " + UpdateTableTimer.dateFormat1.format(nextOnHourDate) +
                            " 之间的数据 " + productOneHourData.size() + " 条，耗时：" + (l4 - l3) + " ms");
                }
            }
            basisDate = nextOnHourDate;
            if(basisDate.after(productMaxCreateTime)){
                break;
            }
        }
        long ll = System.currentTimeMillis();
        System.out.println(name + "：获取与插入 " + count + " 条数据*******************************************************************" +
                "*******************************************总耗时：" + (ll - l) + " ms");
    }
}
