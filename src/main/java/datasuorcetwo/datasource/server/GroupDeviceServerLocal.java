package datasuorcetwo.datasource.server;

import datasuorcetwo.datasource.baseInterface.BaseServerInte;
import datasuorcetwo.datasource.entity.GroupDevice;
import datasuorcetwo.datasource.repositoryLocal.GroupDeviceRepositoryLocal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupDeviceServerLocal implements BaseServerInte<GroupDevice> {
    @Autowired
    GroupDeviceRepositoryLocal groupDeviceRepositoryLocal;

    @Override
    public int getMaxId() {
        if(groupDeviceRepositoryLocal.findMaxId() == null){
            return 0;
        }
        return groupDeviceRepositoryLocal.findMaxId();
    }

    @Override
    public List<GroupDevice> getThanMaxId(Integer maxId) {
        return groupDeviceRepositoryLocal.findThanMaxId(maxId);
    }

    @Override
    public List<GroupDevice> getBetweenData(Integer beforeId, Integer afterId) {
        return groupDeviceRepositoryLocal.getBetweenData(beforeId,afterId);
    }

    @Override
    public int insert(List<GroupDevice> groupDevices) {
        if(!groupDevices.isEmpty()){
            groupDeviceRepositoryLocal.saveAll(groupDevices);
        }
        return 0;
    }

    @Override
    public int deleteByIterator(Iterable<GroupDevice> iterable) {
        groupDeviceRepositoryLocal.deleteAll(iterable);
        return 0;
    }
}
