package datasuorcetwo.datasource.server;

import datasuorcetwo.datasource.baseInterface.BaseServerInte;
import datasuorcetwo.datasource.entity.DeviceManyroad;
import datasuorcetwo.datasource.repositoryLocal.DeviceManyroadRepositoryLocal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceManyroadServerLocal implements BaseServerInte<DeviceManyroad> {
    @Autowired
    DeviceManyroadRepositoryLocal deviceManyroadRepositoryLocal;

    @Override
    public int getMaxId() {
        if(deviceManyroadRepositoryLocal.findMaxId() == null){
            return 0;
        }
        return deviceManyroadRepositoryLocal.findMaxId();
    }

    @Override
    public List<DeviceManyroad> getThanMaxId(Integer maxId) {
        return deviceManyroadRepositoryLocal.findThanMaxId(maxId);
    }

    @Override
    public List<DeviceManyroad> getBetweenData(Integer beforeId, Integer afterId) {
        return deviceManyroadRepositoryLocal.getBetweenData(beforeId,afterId);
    }

    @Override
    public int insert(List<DeviceManyroad> deviceManyroads) {
        if(!deviceManyroads.isEmpty()){
            deviceManyroadRepositoryLocal.saveAll(deviceManyroads);
        }
        return 0;
    }

    @Override
    public int deleteByIterator(Iterable<DeviceManyroad> iterable) {
        deviceManyroadRepositoryLocal.deleteAll(iterable);
        return 0;
    }
}
