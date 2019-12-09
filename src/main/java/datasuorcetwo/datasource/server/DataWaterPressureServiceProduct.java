package datasuorcetwo.datasource.server;

import datasuorcetwo.datasource.baseInterface.DataBaseServerInte;
import datasuorcetwo.datasource.entity.DataWaterPressure;
import datasuorcetwo.datasource.repositoryProduct.DataWaterPressureRepositoryProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataWaterPressureServiceProduct implements DataBaseServerInte<DataWaterPressure> {
    @Autowired
    DataWaterPressureRepositoryProduct dataWaterPressureRepositoryProduct;

    @Override
    public Integer getMaxId() {
        return dataWaterPressureRepositoryProduct.findMaxId();
    }

    @Override
    public Integer getMinId() {
        return dataWaterPressureRepositoryProduct.getMinId();
    }

    @Override
    public List<DataWaterPressure> get1wData(Integer beforeId, Integer afterId) {
        return dataWaterPressureRepositoryProduct.get1wData(beforeId, afterId);
    }

    @Override
    public int insert(List<DataWaterPressure> dataWaterPressures) {
        return 0;
    }
}
