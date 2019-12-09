package datasuorcetwo.datasource.server;

import datasuorcetwo.datasource.baseInterface.BaseServerInte;
import datasuorcetwo.datasource.entity.DeviceHumidity;
import datasuorcetwo.datasource.repositoryLocal.DeviceHumidityRepositoryLocal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceHumidityServerLocal implements BaseServerInte<DeviceHumidity> {
    @Autowired
    DeviceHumidityRepositoryLocal deviceHumidityRepositoryLocal;

    @Override
    public int getMaxId() {
        if(deviceHumidityRepositoryLocal.findMaxId() == null){
            return 0;
        }
        return deviceHumidityRepositoryLocal.findMaxId();
    }

    @Override
    public List<DeviceHumidity> getThanMaxId(Integer maxId) {
        return deviceHumidityRepositoryLocal.findThanMaxId(maxId);
    }

    @Override
    public List<DeviceHumidity> getBetweenData(Integer beforeId, Integer afterId) {
        return deviceHumidityRepositoryLocal.getBetweenData(beforeId,afterId);
    }

    @Override
    public int insert(List<DeviceHumidity> deviceHumidities) {
        if(!deviceHumidities.isEmpty()){
            deviceHumidityRepositoryLocal.saveAll(deviceHumidities);
        }
        return 0;
    }

    @Override
    public int deleteByIterator(Iterable<DeviceHumidity> iterable) {
        deviceHumidityRepositoryLocal.deleteAll(iterable);
        return 0;
    }
}
