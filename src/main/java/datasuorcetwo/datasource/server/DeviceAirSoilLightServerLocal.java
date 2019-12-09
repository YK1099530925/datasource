package datasuorcetwo.datasource.server;

import datasuorcetwo.datasource.baseInterface.BaseServerInte;
import datasuorcetwo.datasource.entity.DeviceAirSoilLight;
import datasuorcetwo.datasource.repositoryLocal.DeviceAirSoilLightRepositoryLocal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceAirSoilLightServerLocal implements BaseServerInte<DeviceAirSoilLight> {
    @Autowired
    DeviceAirSoilLightRepositoryLocal deviceAirSoilLightRepositoryLocal;

    @Override
    public int getMaxId() {
        if(deviceAirSoilLightRepositoryLocal.findMaxId() == null){
            return 0;
        }
        return deviceAirSoilLightRepositoryLocal.findMaxId();
    }

    @Override
    public List<DeviceAirSoilLight> getThanMaxId(Integer maxId) {
        return deviceAirSoilLightRepositoryLocal.findThanMaxId(maxId);
    }

    @Override
    public List<DeviceAirSoilLight> getBetweenData(Integer beforeId, Integer afterId) {
        return deviceAirSoilLightRepositoryLocal.getBetweenData(beforeId,afterId);
    }

    @Override
    public int insert(List<DeviceAirSoilLight> deviceAirSoilLights) {
        if(!deviceAirSoilLights.isEmpty()){
            deviceAirSoilLightRepositoryLocal.saveAll(deviceAirSoilLights);
        }
        return 0;
    }

    @Override
    public int deleteByIterator(Iterable<DeviceAirSoilLight> iterable) {
        deviceAirSoilLightRepositoryLocal.deleteAll(iterable);
        return 0;
    }
}
