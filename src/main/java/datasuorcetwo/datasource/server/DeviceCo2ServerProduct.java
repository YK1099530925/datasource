package datasuorcetwo.datasource.server;

import datasuorcetwo.datasource.baseInterface.BaseServerInte;
import datasuorcetwo.datasource.entity.DeviceCo2;
import datasuorcetwo.datasource.repositoryProduct.DeviceCo2RepositoryProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceCo2ServerProduct implements BaseServerInte<DeviceCo2> {
    @Autowired
    DeviceCo2RepositoryProduct deviceCo2RepositoryProduct;

    @Override
    public int getMaxId() {
        return deviceCo2RepositoryProduct.findMaxId();
    }

    @Override
    public List<DeviceCo2> getThanMaxId(Integer maxId) {
        return deviceCo2RepositoryProduct.findThanMaxId(maxId);
    }

    @Override
    public List<DeviceCo2> getBetweenData(Integer beforeId, Integer afterId) {
        return deviceCo2RepositoryProduct.getBetweenData(beforeId, afterId);
    }

    @Override
    public int insert(List<DeviceCo2> deviceCo2s) {
        return 0;
    }

    @Override
    public int deleteByIterator(Iterable<DeviceCo2> iterable) {
        return 0;
    }
}
