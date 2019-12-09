package datasuorcetwo.datasource.server;

import datasuorcetwo.datasource.baseInterface.DataBaseServerInte;
import datasuorcetwo.datasource.entity.DataHumidity;
import datasuorcetwo.datasource.repositoryProduct.DataHumidityRepositoryProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataHumidityServerProduct implements DataBaseServerInte<DataHumidity> {

    @Autowired
    DataHumidityRepositoryProduct dataHumidityRepositoryProduct;

    @Override
    public Integer getMaxId() {
        return dataHumidityRepositoryProduct.findMaxId();
    }

    @Override
    public Integer getMinId() {
        return dataHumidityRepositoryProduct.getMinId();
    }

    @Override
    public List<DataHumidity> get1wData(Integer beforeId, Integer afterId) {
        return dataHumidityRepositoryProduct.get1wData(beforeId, afterId);
    }

    @Override
    public int insert(List<DataHumidity> dataHumidities) {
        return 0;
    }
}
