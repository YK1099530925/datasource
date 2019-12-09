package datasuorcetwo.datasource.server;

import datasuorcetwo.datasource.baseInterface.BaseServerInte;
import datasuorcetwo.datasource.entity.LinkageDevice;
import datasuorcetwo.datasource.repositoryProduct.LinkageDeviceRepositoryProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LinkageDeviceServerProduct implements BaseServerInte<LinkageDevice> {
    @Autowired
    LinkageDeviceRepositoryProduct linkageDeviceRepositoryProduct;

    @Override
    public int getMaxId() {
        return linkageDeviceRepositoryProduct.findMaxId();
    }

    @Override
    public List<LinkageDevice> getThanMaxId(Integer maxId) {
        return linkageDeviceRepositoryProduct.findThanMaxId(maxId);
    }

    @Override
    public List<LinkageDevice> getBetweenData(Integer beforeId, Integer afterId) {
        return linkageDeviceRepositoryProduct.getBetweenData(beforeId,afterId);
    }

    @Override
    public int insert(List<LinkageDevice> linkageDevices) {
        return 0;
    }

    @Override
    public int deleteByIterator(Iterable<LinkageDevice> iterable) {
        return 0;
    }
}
