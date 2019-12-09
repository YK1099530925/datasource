package datasuorcetwo.datasource.server;

import datasuorcetwo.datasource.baseInterface.BaseServerInte;
import datasuorcetwo.datasource.entity.DeviceCo2;
import datasuorcetwo.datasource.repositoryLocal.DeviceCo2RepositoryLocal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DeviceCo2ServerLocal implements BaseServerInte<DeviceCo2> {
    @Autowired
    DeviceCo2RepositoryLocal deviceCo2RepositoryLocal;

    @Override
    public int getMaxId() {
        if(deviceCo2RepositoryLocal.findMaxId() == null){
            return 0;
        }
        return deviceCo2RepositoryLocal.findMaxId();
    }

    @Override
    public List<DeviceCo2> getThanMaxId(Integer id) {
        return deviceCo2RepositoryLocal.findThanMaxId(id);
    }

    @Override
    public List<DeviceCo2> getBetweenData(Integer beforeId, Integer afterId) {
        return deviceCo2RepositoryLocal.getBetweenData(beforeId, afterId);
    }

    @Override
    public int insert(List<DeviceCo2> deviceCo2s) {
        if(!deviceCo2s.isEmpty()){
            deviceCo2RepositoryLocal.saveAll(deviceCo2s);
        }
        return 0;
    }

    @Override
    public int deleteByIterator(Iterable<DeviceCo2> iterable) {
        deviceCo2RepositoryLocal.deleteAll(iterable);
        return 0;
    }
}
