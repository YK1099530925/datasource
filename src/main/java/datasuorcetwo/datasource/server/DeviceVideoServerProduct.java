package datasuorcetwo.datasource.server;

import datasuorcetwo.datasource.baseInterface.BaseServerInte;
import datasuorcetwo.datasource.entity.DeviceVideo;
import datasuorcetwo.datasource.repositoryProduct.DeviceVideoRepositoryProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceVideoServerProduct implements BaseServerInte<DeviceVideo> {
    @Autowired
    DeviceVideoRepositoryProduct deviceVideoRepositoryProduct;

    @Override
    public int getMaxId() {
        return deviceVideoRepositoryProduct.findMaxId();
    }

    @Override
    public List<DeviceVideo> getThanMaxId(Integer maxId) {
        return deviceVideoRepositoryProduct.findThanMaxId(maxId);
    }

    @Override
    public List<DeviceVideo> getBetweenData(Integer beforeId, Integer afterId) {
        return deviceVideoRepositoryProduct.getBetweenData(beforeId,afterId);
    }

    @Override
    public int insert(List<DeviceVideo> deviceVideos) {
        return 0;
    }

    @Override
    public int deleteByIterator(Iterable<DeviceVideo> iterable) {
        return 0;
    }
}
