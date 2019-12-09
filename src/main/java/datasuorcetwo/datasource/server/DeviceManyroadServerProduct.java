package datasuorcetwo.datasource.server;

import datasuorcetwo.datasource.baseInterface.BaseServerInte;
import datasuorcetwo.datasource.entity.DeviceManyroad;
import datasuorcetwo.datasource.repositoryProduct.DeviceManyroadRepositoryProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceManyroadServerProduct implements BaseServerInte<DeviceManyroad> {
    @Autowired
    DeviceManyroadRepositoryProduct deviceManyroadRepositoryProduct;

    @Override
    public int getMaxId() {
        return deviceManyroadRepositoryProduct.findMaxId();
    }

    @Override
    public List<DeviceManyroad> getThanMaxId(Integer maxId) {
        return deviceManyroadRepositoryProduct.findThanMaxId(maxId);
    }

    @Override
    public List<DeviceManyroad> getBetweenData(Integer beforeId, Integer afterId) {
        return deviceManyroadRepositoryProduct.getBetweenData(beforeId,afterId);
    }

    @Override
    public int insert(List<DeviceManyroad> deviceManyroads) {
        return 0;
    }

    @Override
    public int deleteByIterator(Iterable<DeviceManyroad> iterable) {
        return 0;
    }
}
