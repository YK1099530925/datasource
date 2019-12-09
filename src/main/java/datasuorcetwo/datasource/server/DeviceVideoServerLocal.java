package datasuorcetwo.datasource.server;

import datasuorcetwo.datasource.baseInterface.BaseServerInte;
import datasuorcetwo.datasource.entity.DeviceVideo;
import datasuorcetwo.datasource.repositoryLocal.DeviceVideoRepositoryLocal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceVideoServerLocal implements BaseServerInte<DeviceVideo> {
    @Autowired
    DeviceVideoRepositoryLocal deviceVideoRepositoryLocal;

    @Override
    public int getMaxId() {
        if(deviceVideoRepositoryLocal.findMaxId() == null){
            return 0;
        }
        return deviceVideoRepositoryLocal.findMaxId();
    }

    @Override
    public List<DeviceVideo> getThanMaxId(Integer maxId) {
        return deviceVideoRepositoryLocal.findThanMaxId(maxId);
    }

    @Override
    public List<DeviceVideo> getBetweenData(Integer beforeId, Integer afterId) {
        return deviceVideoRepositoryLocal.getBetweenData(beforeId,afterId);
    }

    @Override
    public int insert(List<DeviceVideo> deviceVideos) {
        if(!deviceVideos.isEmpty()){
            deviceVideoRepositoryLocal.saveAll(deviceVideos);
        }
        return 0;
    }

    @Override
    public int deleteByIterator(Iterable<DeviceVideo> iterable) {
        deviceVideoRepositoryLocal.deleteAll(iterable);
        return 0;
    }
}
