package datasuorcetwo.datasource.server;

import datasuorcetwo.datasource.baseInterface.BaseServerInte;
import datasuorcetwo.datasource.entity.DeviceType;
import datasuorcetwo.datasource.repositoryProduct.DeviceTypeRepositoryProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceTypeServerProduct implements BaseServerInte<DeviceType> {
    @Autowired
    DeviceTypeRepositoryProduct deviceTypeRepositoryProduct;

    @Override
    public int getMaxId() {
        return deviceTypeRepositoryProduct.findMaxId();
    }

    @Override
    public List<DeviceType> getThanMaxId(Integer maxId) {
        return deviceTypeRepositoryProduct.findThanMaxId(maxId);
    }

    @Override
    public List<DeviceType> getBetweenData(Integer beforeId, Integer afterId) {
        return deviceTypeRepositoryProduct.getBetweenData(beforeId,afterId);
    }

    @Override
    public int insert(List<DeviceType> deviceTypes) {
        return 0;
    }

    @Override
    public int deleteByIterator(Iterable<DeviceType> iterable) {
        return 0;
    }
}
