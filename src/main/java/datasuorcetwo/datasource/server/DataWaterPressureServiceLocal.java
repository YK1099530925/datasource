package datasuorcetwo.datasource.server;

import datasuorcetwo.datasource.baseInterface.DataBaseServerInte;
import datasuorcetwo.datasource.entity.DataWaterPressure;
import datasuorcetwo.datasource.repositoryLocal.DataWaterPressureRepositoryLocal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataWaterPressureServiceLocal implements DataBaseServerInte<DataWaterPressure> {
    @Autowired
    DataWaterPressureRepositoryLocal dataWaterPressureRepositoryLocal;

    @Override
    public Integer getMaxId() {
        return dataWaterPressureRepositoryLocal.findMaxId();
    }

    @Override
    public Integer getMinId() {
        return null;
    }

    @Override
    public List<DataWaterPressure> get1wData(Integer beforeId, Integer afterId) {
        return null;
    }

    @Override
    public int insert(List<DataWaterPressure> dataWaterPressures) {
        if(!dataWaterPressures.isEmpty()){
            dataWaterPressureRepositoryLocal.saveAll(dataWaterPressures);
        }
        return 1;
    }
}
