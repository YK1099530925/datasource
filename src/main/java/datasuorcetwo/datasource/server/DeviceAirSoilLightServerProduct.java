package datasuorcetwo.datasource.server;

import datasuorcetwo.datasource.baseInterface.BaseServerInte;
import datasuorcetwo.datasource.entity.DeviceAirSoilLight;
import datasuorcetwo.datasource.repositoryProduct.DeviceAirSoilLightRepositoryProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceAirSoilLightServerProduct implements BaseServerInte<DeviceAirSoilLight> {
    @Autowired
    DeviceAirSoilLightRepositoryProduct deviceAirSoilLightRepositoryProduct;

    @Override
    public int getMaxId() {
        if(deviceAirSoilLightRepositoryProduct.findMaxId() == null){
            return 0;
        }
        return deviceAirSoilLightRepositoryProduct.findMaxId();
    }

    @Override
    public List<DeviceAirSoilLight> getThanMaxId(Integer maxId) {
        return deviceAirSoilLightRepositoryProduct.findThanMaxId(maxId);
    }

    @Override
    public List<DeviceAirSoilLight> getBetweenData(Integer beforeId, Integer afterId) {
        return deviceAirSoilLightRepositoryProduct.getBetweenData(beforeId,afterId);
    }

    @Override
    public int insert(List<DeviceAirSoilLight> deviceAirSoilLights) {
        return 0;
    }

    @Override
    public int deleteByIterator(Iterable<DeviceAirSoilLight> iterable) {
        return 0;
    }
}
