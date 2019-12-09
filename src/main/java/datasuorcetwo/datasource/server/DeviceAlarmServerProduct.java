package datasuorcetwo.datasource.server;

import datasuorcetwo.datasource.baseInterface.BaseServerInte;
import datasuorcetwo.datasource.entity.DeviceAlarm;
import datasuorcetwo.datasource.repositoryProduct.DeviceAlarmRepositoryProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceAlarmServerProduct implements BaseServerInte<DeviceAlarm> {
    @Autowired
    DeviceAlarmRepositoryProduct deviceAlarmRepositoryProduct;

    @Override
    public int getMaxId() {
        return deviceAlarmRepositoryProduct.findMaxId();
    }

    @Override
    public List<DeviceAlarm> getThanMaxId(Integer maxId) {
        return deviceAlarmRepositoryProduct.findThanMaxId(maxId);
    }

    @Override
    public List<DeviceAlarm> getBetweenData(Integer beforeId, Integer afterId) {
        return deviceAlarmRepositoryProduct.getBetweenData(beforeId,afterId);
    }

    @Override
    public int insert(List<DeviceAlarm> deviceAlarms) {
        return 0;
    }

    @Override
    public int deleteByIterator(Iterable<DeviceAlarm> iterable) {
        return 0;
    }
}
