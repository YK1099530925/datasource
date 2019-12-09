package datasuorcetwo.datasource.server;

import datasuorcetwo.datasource.baseInterface.BaseServerInte;
import datasuorcetwo.datasource.entity.DeviceWindRainfall;
import datasuorcetwo.datasource.repositoryProduct.DeviceWindRainfallRepositoryProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceWindRainfallServerProduct implements BaseServerInte<DeviceWindRainfall> {
    @Autowired
    DeviceWindRainfallRepositoryProduct deviceWindRainfallRepositoryProduct;

    @Override
    public int getMaxId() {
        return deviceWindRainfallRepositoryProduct.findMaxId();
    }

    @Override
    public List<DeviceWindRainfall> getThanMaxId(Integer maxId) {
        return deviceWindRainfallRepositoryProduct.findThanMaxId(maxId);
    }

    @Override
    public List<DeviceWindRainfall> getBetweenData(Integer beforeId, Integer afterId) {
        return deviceWindRainfallRepositoryProduct.getBetweenData(beforeId,afterId);
    }

    @Override
    public int insert(List<DeviceWindRainfall> deviceWindRainfalls) {
        return 0;
    }

    @Override
    public int deleteByIterator(Iterable<DeviceWindRainfall> iterable) {
        return 0;
    }
}
