package datasuorcetwo.datasource.server;

import datasuorcetwo.datasource.baseInterface.BaseServerInte;
import datasuorcetwo.datasource.entity.DeviceType;
import datasuorcetwo.datasource.repositoryLocal.DeviceTypeRepositoryLocal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceTypeServerLocal implements BaseServerInte<DeviceType> {
    @Autowired
    DeviceTypeRepositoryLocal deviceTypeRepositoryLocal;

    @Override
    public int getMaxId() {
        if(deviceTypeRepositoryLocal.findMaxId() == null){
            return 0;
        }
        return deviceTypeRepositoryLocal.findMaxId();
    }

    @Override
    public List<DeviceType> getThanMaxId(Integer maxId) {
        return deviceTypeRepositoryLocal.findThanMaxId(maxId);
    }

    @Override
    public List<DeviceType> getBetweenData(Integer beforeId, Integer afterId) {
        return deviceTypeRepositoryLocal.getBetweenData(beforeId,afterId);
    }

    @Override
    public int insert(List<DeviceType> deviceTypes) {
        if(!deviceTypes.isEmpty()){
            deviceTypeRepositoryLocal.saveAll(deviceTypes);
        }
        return 0;
    }

    @Override
    public int deleteByIterator(Iterable<DeviceType> iterable) {
        deviceTypeRepositoryLocal.deleteAll(iterable);
        return 0;
    }
}
