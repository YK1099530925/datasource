package datasuorcetwo.datasource.server;

import datasuorcetwo.datasource.baseInterface.BaseServerInte;
import datasuorcetwo.datasource.entity.DeviceWaterPressure;
import datasuorcetwo.datasource.repositoryProduct.DeviceWaterPressureRepositoryProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceWaterPressureServerProduct implements BaseServerInte<DeviceWaterPressure> {

    @Autowired
    DeviceWaterPressureRepositoryProduct deviceWaterPressureRepositoryProduct;

    @Override
    public int getMaxId() {
        return deviceWaterPressureRepositoryProduct.findMaxId();
    }

    @Override
    public List<DeviceWaterPressure> getThanMaxId(Integer id) {
        return deviceWaterPressureRepositoryProduct.findThanMaxId(id);
    }

    @Override
    public List<DeviceWaterPressure> getBetweenData(Integer beforeId, Integer afterId) {
        return deviceWaterPressureRepositoryProduct.getBetweenData(beforeId,afterId);
    }

    @Override
    public int insert(List<DeviceWaterPressure> deviceWaterPressures) {
        return 0;
    }

    @Override
    public int deleteByIterator(Iterable<DeviceWaterPressure> iterable) {
        return 0;
    }
}
