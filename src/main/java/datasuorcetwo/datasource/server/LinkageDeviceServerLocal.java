package datasuorcetwo.datasource.server;

import datasuorcetwo.datasource.baseInterface.BaseServerInte;
import datasuorcetwo.datasource.entity.LinkageDevice;
import datasuorcetwo.datasource.repositoryLocal.LinkageDeviceRepositoryLocal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LinkageDeviceServerLocal implements BaseServerInte<LinkageDevice> {
    @Autowired
    LinkageDeviceRepositoryLocal linkageDeviceRepositoryLocal;

    @Override
    public int getMaxId() {
        if(linkageDeviceRepositoryLocal.findMaxId() == null){
            return 0;
        }
        return linkageDeviceRepositoryLocal.findMaxId();
    }

    @Override
    public List<LinkageDevice> getThanMaxId(Integer maxId) {
        return linkageDeviceRepositoryLocal.findThanMaxId(maxId);
    }

    @Override
    public List<LinkageDevice> getBetweenData(Integer beforeId, Integer afterId) {
        return linkageDeviceRepositoryLocal.getBetweenData(beforeId,afterId);
    }

    @Override
    public int insert(List<LinkageDevice> linkageDevices) {
        if(!linkageDevices.isEmpty()){
            linkageDeviceRepositoryLocal.saveAll(linkageDevices);
        }
        return 0;
    }

    @Override
    public int deleteByIterator(Iterable<LinkageDevice> iterable) {
        linkageDeviceRepositoryLocal.deleteAll(iterable);
        return 0;
    }
}
