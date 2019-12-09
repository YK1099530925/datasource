package datasuorcetwo.datasource.server;

import datasuorcetwo.datasource.baseInterface.BaseServerInte;
import datasuorcetwo.datasource.entity.DeviceTemperature;
import datasuorcetwo.datasource.repositoryLocal.DeviceTemperatureRepositoryLocal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceTemperatureServerLocal implements BaseServerInte<DeviceTemperature> {
    @Autowired
    DeviceTemperatureRepositoryLocal deviceTemperatureRepositoryLocal;

    @Override
    public int getMaxId() {
        if(deviceTemperatureRepositoryLocal.findMaxId() == null){
            return 0;
        }
        return deviceTemperatureRepositoryLocal.findMaxId();
    }

    @Override
    public List<DeviceTemperature> getThanMaxId(Integer maxId) {
        return deviceTemperatureRepositoryLocal.findThanMaxId(maxId);
    }

    @Override
    public List<DeviceTemperature> getBetweenData(Integer beforeId, Integer afterId) {
        return deviceTemperatureRepositoryLocal.getBetweenData(beforeId,afterId);
    }

    @Override
    public int insert(List<DeviceTemperature> deviceTemperatures) {
        if(!deviceTemperatures.isEmpty()){
            deviceTemperatureRepositoryLocal.saveAll(deviceTemperatures);
        }
        return 0;
    }

    @Override
    public int deleteByIterator(Iterable<DeviceTemperature> iterable) {
        deviceTemperatureRepositoryLocal.deleteAll(iterable);
        return 0;
    }
}
