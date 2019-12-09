package datasuorcetwo.datasource.server;

import datasuorcetwo.datasource.baseInterface.BaseServerInte;
import datasuorcetwo.datasource.entity.DeviceTemperature;
import datasuorcetwo.datasource.repositoryProduct.DeviceTemperatureRepositoryProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceTemperatureServerProduct implements BaseServerInte<DeviceTemperature> {
    @Autowired
    DeviceTemperatureRepositoryProduct deviceTemperatureRepositoryProduct;

    @Override
    public int getMaxId() {
        return deviceTemperatureRepositoryProduct.findMaxId();
    }

    @Override
    public List<DeviceTemperature> getThanMaxId(Integer maxId) {
        return deviceTemperatureRepositoryProduct.findThanMaxId(maxId);
    }

    @Override
    public List<DeviceTemperature> getBetweenData(Integer beforeId, Integer afterId) {
        return deviceTemperatureRepositoryProduct.getBetweenData(beforeId,afterId);
    }

    @Override
    public int insert(List<DeviceTemperature> deviceTemperatures) {
        return 0;
    }

    @Override
    public int deleteByIterator(Iterable<DeviceTemperature> iterable) {
        return 0;
    }
}
