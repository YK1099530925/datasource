package datasuorcetwo.datasource.server;

import datasuorcetwo.datasource.baseInterface.DataBaseServerInte;
import datasuorcetwo.datasource.entity.DataWindRainfall;
import datasuorcetwo.datasource.repositoryProduct.DataWindRainfallRepositoryProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataWindRainfallServerProduct implements DataBaseServerInte<DataWindRainfall> {
    @Autowired
    DataWindRainfallRepositoryProduct dataWindRainfallRepositoryProduct;

    @Override
    public Integer getMaxId() {
        return dataWindRainfallRepositoryProduct.findMaxId();
    }

    @Override
    public Integer getMinId() {
        return dataWindRainfallRepositoryProduct.getMinId();
    }

    @Override
    public List<DataWindRainfall> get1wData(Integer beforeId, Integer afterId) {
        return dataWindRainfallRepositoryProduct.get1wData(beforeId, afterId);
    }

    @Override
    public int insert(List<DataWindRainfall> dataWindRainfalls) {
        return 0;
    }
}
