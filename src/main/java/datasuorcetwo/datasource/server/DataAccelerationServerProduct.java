package datasuorcetwo.datasource.server;

import datasuorcetwo.datasource.baseInterface.DataBaseServerInte;
import datasuorcetwo.datasource.entity.DataAcceleration;
import datasuorcetwo.datasource.repositoryProduct.DataAccelerationRepositoryProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataAccelerationServerProduct implements DataBaseServerInte<DataAcceleration> {

    @Autowired
    DataAccelerationRepositoryProduct dataAccelerationRepositoryProduct;

    @Override
    public Integer getMaxId() {
        return dataAccelerationRepositoryProduct.findMaxId();
    }

    @Override
    public Integer getMinId() {
        return dataAccelerationRepositoryProduct.getMinId();
    }

    @Override
    public List<DataAcceleration> get1wData(Integer beforeId, Integer afterId) {
        return dataAccelerationRepositoryProduct.get1wData(beforeId, afterId);
    }

    @Override
    public int insert(List<DataAcceleration> dataAccelerations) {
        return 0;
    }
}
