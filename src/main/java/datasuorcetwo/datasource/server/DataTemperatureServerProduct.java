package datasuorcetwo.datasource.server;

import datasuorcetwo.datasource.baseInterface.DataBaseServerInte;
import datasuorcetwo.datasource.entity.DataTemperature;
import datasuorcetwo.datasource.repositoryProduct.DataTemperatureRepositoryProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataTemperatureServerProduct implements DataBaseServerInte<DataTemperature> {
    @Autowired
    DataTemperatureRepositoryProduct dataTemperatureRepositoryProduct;

    @Override
    public Integer getMaxId() {
        return dataTemperatureRepositoryProduct.findMaxId();
    }

    @Override
    public Integer getMinId() {
        return dataTemperatureRepositoryProduct.getMinId();
    }

    @Override
    public List<DataTemperature> get1wData(Integer beforeId, Integer afterId) {
        return dataTemperatureRepositoryProduct.get1wData(beforeId, afterId);
    }

    @Override
    public int insert(List<DataTemperature> dataTemperatures) {
        return 0;
    }
}
