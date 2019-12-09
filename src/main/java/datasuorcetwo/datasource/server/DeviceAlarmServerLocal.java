package datasuorcetwo.datasource.server;

import datasuorcetwo.datasource.baseInterface.BaseServerInte;
import datasuorcetwo.datasource.entity.DeviceAlarm;
import datasuorcetwo.datasource.repositoryLocal.DeviceAlarmRepositoryLocal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceAlarmServerLocal implements BaseServerInte<DeviceAlarm> {
    @Autowired
    DeviceAlarmRepositoryLocal deviceAlarmRepositoryLocal;

    @Override
    public int getMaxId() {
        if(deviceAlarmRepositoryLocal.findMaxId() == null){
            return 0;
        }
        return deviceAlarmRepositoryLocal.findMaxId();
    }

    @Override
    public List<DeviceAlarm> getThanMaxId(Integer maxId) {
        return deviceAlarmRepositoryLocal.findThanMaxId(maxId);
    }

    @Override
    public List<DeviceAlarm> getBetweenData(Integer beforeId, Integer afterId) {
        return deviceAlarmRepositoryLocal.getBetweenData(beforeId,afterId);
    }

    @Override
    public int insert(List<DeviceAlarm> deviceAlarms) {
        if(!deviceAlarms.isEmpty()){
            deviceAlarmRepositoryLocal.saveAll(deviceAlarms);
        }
        return 0;
    }

    @Override
    public int deleteByIterator(Iterable<DeviceAlarm> iterable) {
        deviceAlarmRepositoryLocal.deleteAll(iterable);
        return 0;
    }
}
