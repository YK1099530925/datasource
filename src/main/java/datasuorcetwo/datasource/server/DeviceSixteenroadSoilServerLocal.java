package datasuorcetwo.datasource.server;

import datasuorcetwo.datasource.baseInterface.BaseServerInte;
import datasuorcetwo.datasource.entity.DeviceSixteenroadSoil;
import datasuorcetwo.datasource.repositoryLocal.DeviceSixteenroadSoilRepositoryLocal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceSixteenroadSoilServerLocal implements BaseServerInte<DeviceSixteenroadSoil> {
    @Autowired
    DeviceSixteenroadSoilRepositoryLocal deviceSixteenroadSoilRepositoryLocal;

    @Override
    public int getMaxId() {
        if(deviceSixteenroadSoilRepositoryLocal.findMaxId() == null){
            return 0;
        }
        return deviceSixteenroadSoilRepositoryLocal.findMaxId();
    }

    @Override
    public List<DeviceSixteenroadSoil> getThanMaxId(Integer maxId) {
        return deviceSixteenroadSoilRepositoryLocal.findThanMaxId(maxId);
    }

    @Override
    public List<DeviceSixteenroadSoil> getBetweenData(Integer beforeId, Integer afterId) {
        return deviceSixteenroadSoilRepositoryLocal.getBetweenData(beforeId,afterId);
    }

    @Override
    public int insert(List<DeviceSixteenroadSoil> deviceSixteenroadSoils) {
        if(!deviceSixteenroadSoils.isEmpty()){
            deviceSixteenroadSoilRepositoryLocal.saveAll(deviceSixteenroadSoils);
        }
        return 0;
    }

    @Override
    public int deleteByIterator(Iterable<DeviceSixteenroadSoil> iterable) {
        deviceSixteenroadSoilRepositoryLocal.deleteAll(iterable);
        return 0;
    }
}
