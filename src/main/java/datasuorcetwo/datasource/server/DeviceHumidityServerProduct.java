package datasuorcetwo.datasource.server;

import datasuorcetwo.datasource.baseInterface.BaseServerInte;
import datasuorcetwo.datasource.entity.DeviceHumidity;
import datasuorcetwo.datasource.repositoryProduct.DeviceHumidityRepositoryProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceHumidityServerProduct implements BaseServerInte<DeviceHumidity> {
    @Autowired
    DeviceHumidityRepositoryProduct deviceHumidityRepositoryProduct;

    @Override
    public int getMaxId() {
        return deviceHumidityRepositoryProduct.findMaxId();
    }

    @Override
    public List<DeviceHumidity> getThanMaxId(Integer maxId) {
        return deviceHumidityRepositoryProduct.findThanMaxId(maxId);
    }

    @Override
    public List<DeviceHumidity> getBetweenData(Integer beforeId, Integer afterId) {
        return deviceHumidityRepositoryProduct.getBetweenData(beforeId,afterId);
    }

    @Override
    public int insert(List<DeviceHumidity> deviceHumidities) {
        return 0;
    }

    @Override
    public int deleteByIterator(Iterable<DeviceHumidity> iterable) {
        return 0;
    }
}
