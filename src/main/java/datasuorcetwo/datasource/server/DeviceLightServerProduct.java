package datasuorcetwo.datasource.server;

import datasuorcetwo.datasource.baseInterface.BaseServerInte;
import datasuorcetwo.datasource.entity.DeviceLight;
import datasuorcetwo.datasource.repositoryProduct.DeviceLightRepositoryProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceLightServerProduct implements BaseServerInte<DeviceLight> {
    @Autowired
    DeviceLightRepositoryProduct deviceLightRepositoryProduct;

    @Override
    public int getMaxId() {
        return deviceLightRepositoryProduct.findMaxId();
    }

    @Override
    public List<DeviceLight> getThanMaxId(Integer maxId) {
        return deviceLightRepositoryProduct.findThanMaxId(maxId);
    }

    @Override
    public List<DeviceLight> getBetweenData(Integer beforeId, Integer afterId) {
        return deviceLightRepositoryProduct.getBetweenData(beforeId,afterId);
    }

    @Override
    public int insert(List<DeviceLight> deviceLights) {
        return 0;
    }

    @Override
    public int deleteByIterator(Iterable<DeviceLight> iterable) {
        return 0;
    }
}
