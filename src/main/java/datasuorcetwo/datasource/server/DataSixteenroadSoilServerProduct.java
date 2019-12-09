package datasuorcetwo.datasource.server;

import datasuorcetwo.datasource.baseInterface.DataBaseServerInte;
import datasuorcetwo.datasource.entity.DataSixteenroadSoil;
import datasuorcetwo.datasource.repositoryProduct.DataSixteenroadSoilRepositoryProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataSixteenroadSoilServerProduct implements DataBaseServerInte<DataSixteenroadSoil> {

    @Autowired
    DataSixteenroadSoilRepositoryProduct dataSixteenroadSoilRepositoryProduct;

    @Override
    public Integer getMaxId() {
        return dataSixteenroadSoilRepositoryProduct.findMaxId();
    }

    @Override
    public Integer getMinId() {
        return dataSixteenroadSoilRepositoryProduct.getMinId();
    }

    @Override
    public List<DataSixteenroadSoil> get1wData(Integer beforeId, Integer afterId) {
        return dataSixteenroadSoilRepositoryProduct.get1wData(beforeId, afterId);
    }

    @Override
    public int insert(List<DataSixteenroadSoil> dataSixteenroadSoils) {
        return 0;
    }
}
