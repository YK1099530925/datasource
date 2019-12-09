package datasuorcetwo.datasource.server;

import datasuorcetwo.datasource.baseInterface.BaseServerInte;
import datasuorcetwo.datasource.entity.DeviceWindRainfall;
import datasuorcetwo.datasource.repositoryLocal.DeviceWindRainfallRepositoryLocal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceWindRainfallServerLocal implements BaseServerInte<DeviceWindRainfall> {
    @Autowired
    DeviceWindRainfallRepositoryLocal deviceWindRainfallRepositoryLocal;

    @Override
    public int getMaxId() {
        if(deviceWindRainfallRepositoryLocal.findMaxId() == null){
            return 0;
        }
        return deviceWindRainfallRepositoryLocal.findMaxId();
    }

    @Override
    public List<DeviceWindRainfall> getThanMaxId(Integer maxId) {
        return deviceWindRainfallRepositoryLocal.findThanMaxId(maxId);
    }

    @Override
    public List<DeviceWindRainfall> getBetweenData(Integer beforeId, Integer afterId) {
        return deviceWindRainfallRepositoryLocal.getBetweenData(beforeId,afterId);
    }

    @Override
    public int insert(List<DeviceWindRainfall> deviceWindRainfalls) {
        if(!deviceWindRainfalls.isEmpty()){
            deviceWindRainfallRepositoryLocal.saveAll(deviceWindRainfalls);
        }
        return 0;
    }

    @Override
    public int deleteByIterator(Iterable<DeviceWindRainfall> iterable) {
        deviceWindRainfallRepositoryLocal.deleteAll(iterable);
        return 0;
    }
}
