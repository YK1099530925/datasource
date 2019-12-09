package datasuorcetwo.datasource.server;

import datasuorcetwo.datasource.baseInterface.BaseServerInte;
import datasuorcetwo.datasource.entity.DeviceSixteenroadSoil;
import datasuorcetwo.datasource.repositoryProduct.DeviceSixteenroadSoilRepositoryProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceSixteenroadSoilServerProduct implements BaseServerInte<DeviceSixteenroadSoil> {
    @Autowired
    DeviceSixteenroadSoilRepositoryProduct deviceSixteenroadSoilRepositoryProduct;

    @Override
    public int getMaxId() {
        return deviceSixteenroadSoilRepositoryProduct.findMaxId();
    }

    @Override
    public List<DeviceSixteenroadSoil> getThanMaxId(Integer maxId) {
        return deviceSixteenroadSoilRepositoryProduct.findThanMaxId(maxId);
    }

    @Override
    public List<DeviceSixteenroadSoil> getBetweenData(Integer beforeId, Integer afterId) {
        return deviceSixteenroadSoilRepositoryProduct.getBetweenData(beforeId,afterId);
    }

    @Override
    public int insert(List<DeviceSixteenroadSoil> deviceSixteenroadSoils) {
        return 0;
    }

    @Override
    public int deleteByIterator(Iterable<DeviceSixteenroadSoil> iterable) {
        return 0;
    }
}
