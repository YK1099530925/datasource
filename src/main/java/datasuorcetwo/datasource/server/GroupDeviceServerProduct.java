package datasuorcetwo.datasource.server;

import datasuorcetwo.datasource.baseInterface.BaseServerInte;
import datasuorcetwo.datasource.entity.GroupDevice;
import datasuorcetwo.datasource.repositoryProduct.GroupDeviceRepositoryProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupDeviceServerProduct implements BaseServerInte<GroupDevice> {
    @Autowired
    GroupDeviceRepositoryProduct groupDeviceRepositoryProduct;

    @Override
    public int getMaxId() {
        return groupDeviceRepositoryProduct.findMaxId();
    }

    @Override
    public List<GroupDevice> getThanMaxId(Integer maxId) {
        return groupDeviceRepositoryProduct.findThanMaxId(maxId);
    }

    @Override
    public List<GroupDevice> getBetweenData(Integer beforeId, Integer afterId) {
        return groupDeviceRepositoryProduct.getBetweenData(beforeId,afterId);
    }

    @Override
    public int insert(List<GroupDevice> groupDevices) {
        return 0;
    }

    @Override
    public int deleteByIterator(Iterable<GroupDevice> iterable) {
        return 0;
    }
}
