package datasuorcetwo.datasource.server;

import datasuorcetwo.datasource.baseInterface.DataBaseServerInte;
import datasuorcetwo.datasource.entity.DataSixteenroadSoil;
import datasuorcetwo.datasource.repositoryLocal.DataSixteenroadSoilRepositoryLocal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataSixteenroadSoilServerLocal implements DataBaseServerInte<DataSixteenroadSoil> {

    @Autowired
    DataSixteenroadSoilRepositoryLocal dataSixteenroadSoilRepositoryLocal;

    @Override
    public Integer getMaxId() {
        return dataSixteenroadSoilRepositoryLocal.findMaxId();
    }

    @Override
    public Integer getMinId() {
        return null;
    }

    @Override
    public List<DataSixteenroadSoil> get1wData(Integer beforeId, Integer afterId) {
        return null;
    }

    @Override
    public int insert(List<DataSixteenroadSoil> dataSixteenroadSoils) {
        if(!dataSixteenroadSoils.isEmpty()){
            dataSixteenroadSoilRepositoryLocal.saveAll(dataSixteenroadSoils);
        }
        return 1;
    }
}
