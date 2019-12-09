package datasuorcetwo.datasource.server;

import datasuorcetwo.datasource.baseInterface.BaseServerInte;
import datasuorcetwo.datasource.entity.DeviceWaterPressure;
import datasuorcetwo.datasource.repositoryLocal.DeviceWaterPressureRepositoryLocal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceWaterPressureServerLocal implements BaseServerInte<DeviceWaterPressure> {

    @Autowired
    DeviceWaterPressureRepositoryLocal deviceWaterPressureRepositoryLocal;

    @Override
    public int getMaxId() {
        if(deviceWaterPressureRepositoryLocal.findMaxId() == null){
            return 0;
        }
        return deviceWaterPressureRepositoryLocal.findMaxId();
    }

    @Override
    public List<DeviceWaterPressure> getThanMaxId(Integer id) {
        return deviceWaterPressureRepositoryLocal.findThanMaxId(id);
    }

    @Override
    public List<DeviceWaterPressure> getBetweenData(Integer beforeId, Integer afterId) {
        return deviceWaterPressureRepositoryLocal.getBetweenData(beforeId, afterId);
    }

    @Override
    public int insert(List<DeviceWaterPressure> deviceWaterPressures) {
        if(!deviceWaterPressures.isEmpty()){
            deviceWaterPressureRepositoryLocal.saveAll(deviceWaterPressures);
        }
        return 0;
    }

    @Override
    public int deleteByIterator(Iterable<DeviceWaterPressure> iterable) {
        deviceWaterPressureRepositoryLocal.deleteAll(iterable);
        return 0;
    }
}
