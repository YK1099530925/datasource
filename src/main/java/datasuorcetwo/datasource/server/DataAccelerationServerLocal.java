package datasuorcetwo.datasource.server;

import datasuorcetwo.datasource.baseInterface.DataBaseServerInte;
import datasuorcetwo.datasource.entity.DataAcceleration;
import datasuorcetwo.datasource.repositoryLocal.DataAccelerationRepositoryLocal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataAccelerationServerLocal implements DataBaseServerInte<DataAcceleration> {

    @Autowired
    DataAccelerationRepositoryLocal dataAccelerationRepositoryLocal;

    @Override
    public Integer getMaxId() {
        return dataAccelerationRepositoryLocal.findMaxId();
    }

    @Override
    public Integer getMinId() {
        return null;
    }

    @Override
    public List<DataAcceleration> get1wData(Integer beforeId, Integer afterId) {
        return null;
    }

    @Override
    public int insert(List<DataAcceleration> dataAccelerations) {
        if(!dataAccelerations.isEmpty()){
            dataAccelerationRepositoryLocal.saveAll(dataAccelerations);
        }
        return 1;
    }
}
