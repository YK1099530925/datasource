package datasuorcetwo.datasource.timer;

import datasuorcetwo.datasource.baseInterface.BaseServerInte;
import datasuorcetwo.datasource.baseInterface.DataBaseServerInte;
import datasuorcetwo.datasource.baseInterface.NbBaseServerInte;
import datasuorcetwo.datasource.entity.NbCommand;
import datasuorcetwo.datasource.server.*;
import datasuorcetwo.datasource.threadpool.ThreadPoolComponent;
import datasuorcetwo.datasource.threadpool.UpdateDataRunnable;
import datasuorcetwo.datasource.threadpool.UpdateNbRunnable;
import datasuorcetwo.datasource.threadpool.UpdateRunnable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Component
public class UpdateTableTimer {

    @Autowired
    ThreadPoolComponent threadPoolComponent;

    @Autowired
    DeviceAirSoilLightServerProduct deviceAirSoilLightServerProduct;
    @Autowired
    DeviceAirSoilLightServerLocal deviceAirSoilLightServerLocal;

    @Autowired
    DeviceAlarmServerProduct deviceAlarmServerProduct;
    @Autowired
    DeviceAlarmServerLocal deviceAlarmServerLocal;

    @Autowired
    DeviceCo2ServerProduct deviceCo2ServerProduct;
    @Autowired
    DeviceCo2ServerLocal deviceCo2ServerLocal;

    @Autowired
    DeviceHumidityServerProduct deviceHumidityServerProduct;
    @Autowired
    DeviceHumidityServerLocal deviceHumidityServerLocal;

    @Autowired
    DeviceLightServerProduct deviceLightServerProduct;
    @Autowired
    DeviceLightServerLocal deviceLightServerLocal;

    @Autowired
    DeviceManyroadServerProduct deviceManyroadServerProduct;
    @Autowired
    DeviceManyroadServerLocal deviceManyroadServerLocal;

    @Autowired
    DeviceSixteenroadSoilServerProduct deviceSixteenroadSoilServerProduct;
    @Autowired
    DeviceSixteenroadSoilServerLocal deviceSixteenroadSoilServerLocal;

    @Autowired
    DeviceSoilMoistureNutrientServerProduct deviceSoilMoistureNutrientServerProduct;
    @Autowired
    DeviceSoilMoistureNutrientServerLocal deviceSoilMoistureNutrientServerLocal;

    @Autowired
    DeviceSwitchServerProduct deviceSwitchServerProduct;
    @Autowired
    DeviceSwitchServerLocal deviceSwitchServerLocal;

    @Autowired
    DeviceTemperatureServerProduct deviceTemperatureServerProduct;
    @Autowired
    DeviceTemperatureServerLocal deviceTemperatureServerLocal;

    @Autowired
    DeviceTypeServerProduct deviceTypeServerProduct;
    @Autowired
    DeviceTypeServerLocal deviceTypeServerLocal;

    @Autowired
    DeviceVideoServerProduct deviceVideoServerProduct;
    @Autowired
    DeviceVideoServerLocal deviceVideoServerLocal;

    @Autowired
    DeviceWaterPressureServerProduct deviceWaterPressureServerProduct;
    @Autowired
    DeviceWaterPressureServerLocal deviceWaterPressureServerLocal;

    @Autowired
    DeviceWindRainfallServerProduct deviceWindRainfallServerProduct;
    @Autowired
    DeviceWindRainfallServerLocal deviceWindRainfallServerLocal;

    @Autowired
    GatewayServerProduct gatewayServerProduct;
    @Autowired
    GatewayServerLocal gatewayServerLocal;

    @Autowired
    GroupDeviceServerProduct groupDeviceServerProduct;
    @Autowired
    GroupDeviceServerLocal groupDeviceServerLocal;

    @Autowired
    GroupServerProduct groupServerProduct;
    @Autowired
    GroupServerLocal groupServerLocal;

    @Autowired
    HistoryBrowseServerProduct historyBrowseServerProduct;
    @Autowired
    HistoryBrowseServerLocal historyBrowseServerLocal;

    @Autowired
    LinkageDeviceServerProduct linkageDeviceServerProduct;
    @Autowired
    LinkageDeviceServerLocal linkageDeviceServerLocal;

    @Autowired
    OrgServerProduct orgServerProduct;
    @Autowired
    OrgServerLocal orgServerLocal;

    @Autowired
    OrgUserServerProduct orgUserServerProduct;
    @Autowired
    OrgUserServerLocal orgUserServerLocal;

    @Autowired
    UserServerProduct userServerProduct;
    @Autowired
    UserServerLocal userServerLocal;

    @Autowired
    VersionServerProduct versionServerProduct;
    @Autowired
    VersionServerLocal versionServerLocal;

    @Autowired
    DataCo2ServerLocal dataCo2ServerLocal;
    @Autowired
    DataCo2ServerProduct dataCo2ServerProduct;
    @Autowired
    DataAccelerationServerLocal dataAccelerationServerLocal;
    @Autowired
    DataAccelerationServerProduct dataAccelerationServerProduct;
    @Autowired
    DataAirSoilLightServerLocal dataAirSoilLightServerLocal;
    @Autowired
    DataAirSoilLightServerProduct dataAirSoilLightServerProduct;
    @Autowired
    DataHumidityServerLocal dataHumidityServerLocal;
    @Autowired
    DataHumidityServerProduct dataHumidityServerProduct;
    @Autowired
    DataLightServerLocal dataLightServerLocal;
    @Autowired
    DataLightServerProduct dataLightServerProduct;
    @Autowired
    DataSixteenroadSoilServerLocal dataSixteenroadSoilServerLocal;
    @Autowired
    DataSixteenroadSoilServerProduct dataSixteenroadSoilServerProduct;
    @Autowired
    DataSoilMoistureNutrientServiceLocal dataSoilMoistureNutrientServiceLocal;
    @Autowired
    DataSoilMoistureNutrientServiceProduct dataSoilMoistureNutrientServiceProduct;
    @Autowired
    DataTemperatureServerLocal dataTemperatureServerLocal;
    @Autowired
    DataTemperatureServerProduct dataTemperatureServerProduct;
    @Autowired
    DataWaterPressureServiceLocal dataWaterPressureServiceLocal;
    @Autowired
    DataWaterPressureServiceProduct dataWaterPressureServiceProduct;
    @Autowired
    DataWindRainfallServerLocal dataWindRainfallServerLocal;
    @Autowired
    DataWindRainfallServerProduct dataWindRainfallServerProduct;
    @Autowired
    NbCommandServerProduct nbCommandServerProduct;
    @Autowired
    NbCommandServerLocal nbCommandServerLocal;
    @Autowired
    NbCommandSensorServerProduct nbCommandSensorServerProduct;
    @Autowired
    NbCommandSensorServerLocal nbCommandSensorServerLocal;

    public static  SimpleDateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss,SSS");

//    @Scheduled(initialDelay = 1000, fixedRate = 300000)
    public void updateNbTableTimer() {
        System.out.println("+++++++++++++++++++++++++同步NB指令表：" + dateFormat.format(new Date()) + "+++++++++++++++++++++++++");
        nbUpdateTable(nbCommandServerProduct, nbCommandServerLocal, "nb_command");
        nbUpdateTable(nbCommandSensorServerProduct, nbCommandSensorServerLocal, "nb_command_sensor");
    }

    /**
     * 同步NB指令表
     * 按照时间来同步，每个线程同步1天的数据，一共10个线程同步十(自定义)天的数据，每个线程中分成24个小时(自定义)来同步，循环24次
     * nb_command 表每一天的数据量大概在1.15w
     * nb_command_sensor 表每一天的数据量大概在6.1w
     * @param product
     * @param local
     * @param name
     */
    public void nbUpdateTable(NbBaseServerInte product, NbBaseServerInte local, String name){
        /*
         * 源库 最后一条数据的时间（但不能同步到最大的时间，应向前推移5分钟左右，原因是：可能有些指令还未返回，所以还不能
         * 同步过来，否则如果同步过来之后，指令返回了，这样会导致其他属性不一样，即同步不完全）
         */
        Date productMaxCreateTime = product.getMaxCreateTime();
        System.out.println("时间：" + productMaxCreateTime + " 源库-" + name);
        // 将源库时间向前推移5分钟来同步（如果直接同步所有记录，注释掉这一行代码，即可同步到当前时间）
        productMaxCreateTime = nextOneHourOrDayDate(productMaxCreateTime, Calendar.MINUTE, -5);
        // 目标库 最后一条数据的时间
        Date localMaxCreateTime = local.getMaxCreateTime();
        System.out.println("时间：" + localMaxCreateTime + " 目标库-" + name);
        // 开启10个线程，同步10天的数据，每个线程同步一天的数据
        for(int i = 0; i < 10; i++){
            UpdateNbRunnable runnable = new UpdateNbRunnable();
            runnable.setName(name + i);
            runnable.setDataNbProduct(product);
            runnable.setDataNbLocal(local);
            // 传入当前时间
            runnable.setBasisDate(localMaxCreateTime);
            // 传入源库最大时间
            runnable.setProductMaxCreateTime(productMaxCreateTime);
            threadPoolComponent.getExecutor().execute(runnable);
            // 计算下个线程的时间起点
            localMaxCreateTime = nextOneHourOrDayDate(localMaxCreateTime, Calendar.HOUR_OF_DAY, 1);
            // 下一个线程的时间如果在源库最大时间之后，说明已经同步完成
            if(localMaxCreateTime.after(productMaxCreateTime)){
                break;
            }
        }
    }

    /**
     * 获取count小时（分钟，天等）之前或者之后
     * @param time 起始时间
     * @param field 秒、小时、天等字段
     * @param count 向前或向后推移属性
     * @return
     */
    public static Date nextOneHourOrDayDate(Date time, int field, int count) {
        try {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(time);
            calendar.add(field, count);
            return calendar.getTime();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 该定时器是用来同步增加并且会改动的数据表（另外这些表的数据量不会很大，因此线程可以分配少一些）
     * 同步设备、分组、用户等信息
     * 做法：先判断是否需要新插入数据（以最后一条数据的id是否相同来判定），然后在比对每一条设备的tostring是否一样，
     *      如果不一样则更新（每次比对100条数据，来减轻每个线程的运行时间）
     */
    @Scheduled(initialDelay = 15000, fixedRate = 3600000)
    public void updateTableTimer() {
        System.out.println("-------------------------同步设备、用户等时间：" + dateFormat.format(new Date()) + "-------------------------");
        pubUpdateTable(deviceAirSoilLightServerProduct, deviceAirSoilLightServerLocal, "五合一设备");
        pubUpdateTable(deviceAlarmServerProduct, deviceAlarmServerLocal, "报警");
        pubUpdateTable(deviceCo2ServerProduct, deviceCo2ServerLocal, "二氧化碳设备");
        pubUpdateTable(deviceHumidityServerProduct, deviceHumidityServerLocal, "湿度设备");
        pubUpdateTable(deviceLightServerProduct, deviceLightServerLocal, "光照设备");
        pubUpdateTable(deviceManyroadServerProduct, deviceManyroadServerLocal, "多路");
        pubUpdateTable(deviceSixteenroadSoilServerProduct, deviceSixteenroadSoilServerLocal, "16路设备");
        pubUpdateTable(deviceSoilMoistureNutrientServerProduct, deviceSoilMoistureNutrientServerLocal, "三阶设备");
        pubUpdateTable(deviceSwitchServerProduct, deviceSwitchServerLocal, "开关设备");
        pubUpdateTable(deviceTemperatureServerProduct, deviceTemperatureServerLocal, "温度设备");
        pubUpdateTable(deviceTypeServerProduct, deviceTemperatureServerLocal, "设备类型");
        pubUpdateTable(deviceVideoServerProduct, deviceVideoServerLocal, "视屏设备");
        pubUpdateTable(deviceWaterPressureServerProduct, deviceWaterPressureServerLocal, "水压设备");
        pubUpdateTable(deviceWindRainfallServerProduct, deviceWindRainfallServerLocal, "气象站设备");
        pubUpdateTable(gatewayServerProduct, gatewayServerLocal, "网关设备");
        pubUpdateTable(groupDeviceServerProduct, groupDeviceServerLocal, "设备分组");
        pubUpdateTable(groupServerProduct, groupServerLocal, "大棚");
        pubUpdateTable(linkageDeviceServerProduct, linkageDeviceServerLocal, "多绑定");
        pubUpdateTable(orgServerProduct, orgServerLocal, "组织");
        pubUpdateTable(orgUserServerProduct, orgUserServerLocal, "组织-用户");
        pubUpdateTable(userServerProduct, userServerLocal, "用户");
        pubUpdateTable(versionServerProduct, versionServerLocal, "版本");
    }


    public void pubUpdateTable(BaseServerInte product, BaseServerInte local, String name){
        int productMaxId = product.getMaxId();
        int localMaxId = local.getMaxId();
        // 比对目标与源的最大id
        // 分情况之后，这样做是为了保证目标数据库的 localMaxId 始终与源数据库 productMaxId 相同
        if(productMaxId > localMaxId){
            // 添加
            long l1 = System.currentTimeMillis();
            List moreThanIds = product.getThanMaxId(localMaxId);
            long l2 = System.currentTimeMillis();
            System.out.println("时间：" + dateFormat.format(new Date()) + " " + name + "：添加 id > " + localMaxId + " 的数据，耗时：" + (l2 - l1) + "ms");
            local.insert(moreThanIds);
        }if(productMaxId < localMaxId){
            // 删除
            long l1 = System.currentTimeMillis();
            List moreThanIds = local.getThanMaxId(productMaxId);
            long l2 = System.currentTimeMillis();
            if(!moreThanIds.isEmpty()){
                local.deleteByIterator(moreThanIds);
                System.out.println("时间：" + dateFormat.format(new Date()) + " " + name + "：删除 id > " + productMaxId + " 的数据，耗时：" + (l2 - l1) + "ms");
            }
        }
        // 如果查询出来的 localMaxId == 0，说明要么目标数据库没有数据，所以就不需要后续了
        if(localMaxId != 0){
            // 判断tostring，并更新（每个线程比对1000个数据，10次循环，每次循环100个id进行比对，然后整个线程的所有数据更新）
            // 起点id初始值为1
            int basisBase = 1;
            // 增长基数
            int increaseBase = 100;
            // 循环次数
            int cycleCount = 10;
            // 需要的线程数
            int manyRunableCount = (productMaxId / (increaseBase * cycleCount)) + 1;
            System.out.println("时间：" + dateFormat.format(new Date()) + " " + name + "：同步需要 " + manyRunableCount + " 个线程");
            for(int i = 0; i < manyRunableCount; i++){
                UpdateRunnable runnable = new UpdateRunnable();
                runnable.setProductMaxId(productMaxId);
                runnable.setName(name + i);
                runnable.setBasisBase(basisBase);
                runnable.setIncreaseBase(increaseBase);
                runnable.setCycleCount(cycleCount);
                runnable.setProduct(product);
                runnable.setLocal(local);
                threadPoolComponent.getExecutor().execute(runnable);
                // 下一个线程的起点id
                basisBase = basisBase + increaseBase * cycleCount;
            }
        }
    }


    /**
     * 该定时器是用来同步只增不改动的数据表，因为data部分只会增加不会改变（包括history表也是一样）。
     * 同步data部分新增的数据
     *  几乎能做到实时同步（如果将 fixedRate 设置为30s，那么将可视为实时同步
     *      因为现在暂时每次新增数据都比较少，根据程序运行情况来看，插入1000条数据大概在3s内，而每30s内每个表不会超过
     *      上万条数据，那么可以将定时间隔稍微变短）
     * 做法：每个data表最多分配10个线程，每个线程插入100*20条数据
     * 启动容器后，延迟 initialDelay 毫秒后，执行定时器，然后每隔 fixedRate 毫秒执行一次
     */
    @Scheduled(initialDelay = 500, fixedRate = 180000)
    public void updateDataTableTimer() {
        System.out.println("-------------------------同步数据时间：" + dateFormat.format(new Date()) + "-------------------------");
        dataPubUpdateTable(dataCo2ServerProduct, dataCo2ServerLocal, "二氧化碳数据");
        dataPubUpdateTable(dataAccelerationServerProduct, dataAccelerationServerLocal, "加速度数据");
        dataPubUpdateTable(dataAirSoilLightServerProduct, dataAirSoilLightServerLocal, "五合一数据");
        dataPubUpdateTable(dataHumidityServerProduct, dataHumidityServerLocal, "湿度数据");
        dataPubUpdateTable(dataLightServerProduct, dataLightServerLocal, "光照数据");
        dataPubUpdateTable(dataSixteenroadSoilServerProduct, dataSixteenroadSoilServerLocal, "16路数据");
        dataPubUpdateTable(dataSoilMoistureNutrientServiceProduct, dataSoilMoistureNutrientServiceLocal, "三阶数据");
        dataPubUpdateTable(dataTemperatureServerProduct, dataTemperatureServerLocal, "温度数据");
        dataPubUpdateTable(dataWaterPressureServiceProduct, dataWaterPressureServiceLocal, "水压数据");
        dataPubUpdateTable(dataWindRainfallServerProduct, dataWindRainfallServerLocal, "气象站数据");
        dataPubUpdateTable(historyBrowseServerProduct, historyBrowseServerLocal, "历史记录数据");
    }

    public void dataPubUpdateTable(DataBaseServerInte dataProduct, DataBaseServerInte dataLocal, String name){
        int increaseBase = 100;
        int cycleCount = 20;
        // 目标数据库最大id（若没有，则赋值为源数据库最小id）
        Integer localMaxId = dataLocal.getMaxId();
        if(localMaxId == null){
            localMaxId = dataProduct.getMinId();
        }
        // 源数据库最大id
        Integer productMaxId = dataProduct.getMaxId();
        // 计算需要多少个线程
        int manyRunableCount = (productMaxId - localMaxId) / (increaseBase * cycleCount);
        // 创建manyRunable这么多个线程一起运行进行插入
        System.out.println("时间：" + dateFormat.format(new Date()) + " " + name + "：需要 " + (manyRunableCount + 1) + " 个线程");
        if(manyRunableCount > 9){
            manyRunableCount = 9;
        }
        for(int i = 0; i < (manyRunableCount + 1); i++){
            UpdateDataRunnable runnable = new UpdateDataRunnable();
            // 设置名称
            runnable.setName(name + i);
            // 设置插入起始点
            runnable.setBasisBase(localMaxId);
            // 设置每次插入的基数
            runnable.setIncreaseBase(increaseBase);
            // 设置循环次数
            runnable.setCycleCount(cycleCount);
            runnable.setDataProduct(dataProduct);
            runnable.setDataLocal(dataLocal);
            threadPoolComponent.getExecutor().execute(runnable);
            // 下一个线程则从 +1w 作为起点（每个线程的起点则是 IncreaseBase * CycleCount）
            localMaxId = localMaxId + (increaseBase * cycleCount);
        }
    }
}
