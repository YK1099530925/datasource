package datasuorcetwo.datasource.server;

import datasuorcetwo.datasource.baseInterface.BaseServerInte;
import datasuorcetwo.datasource.entity.DeviceLight;
import datasuorcetwo.datasource.repositoryLocal.DeviceLightRepositoryLocal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceLightServerLocal implements BaseServerInte<DeviceLight> {
    @Autowired
    DeviceLightRepositoryLocal deviceLightRepositoryLocal;

    @Override
    public int getMaxId() {
        if(deviceLightRepositoryLocal.findMaxId() == null){
            return 0;
        }
        return deviceLightRepositoryLocal.findMaxId();
    }

    @Override
    public List<DeviceLight> getThanMaxId(Integer maxId) {
        return deviceLightRepositoryLocal.findThanMaxId(maxId);
    }

    @Override
    public List<DeviceLight> getBetweenData(Integer beforeId, Integer afterId) {
        return deviceLightRepositoryLocal.getBetweenData(beforeId,afterId);
    }

    @Override
    public int insert(List<DeviceLight> deviceLights) {
        if(!deviceLights.isEmpty()){
            deviceLightRepositoryLocal.saveAll(deviceLights);
        }
        return 0;
    }

    @Override
    public int deleteByIterator(Iterable<DeviceLight> iterable) {
        deviceLightRepositoryLocal.deleteAll(iterable);
        return 0;
    }
}
