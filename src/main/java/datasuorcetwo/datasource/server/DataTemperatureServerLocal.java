package datasuorcetwo.datasource.server;

import datasuorcetwo.datasource.baseInterface.DataBaseServerInte;
import datasuorcetwo.datasource.entity.DataTemperature;
import datasuorcetwo.datasource.repositoryLocal.DataTemperatureRepositoryLocal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataTemperatureServerLocal implements DataBaseServerInte<DataTemperature> {
    @Autowired
    DataTemperatureRepositoryLocal dataTemperatureRepositoryLocal;

    @Override
    public Integer getMaxId() {
        return dataTemperatureRepositoryLocal.findMaxId();
    }

    @Override
    public Integer getMinId() {
        return null;
    }

    @Override
    public List<DataTemperature> get1wData(Integer beforeId, Integer afterId) {
        return null;
    }

    @Override
    public int insert(List<DataTemperature> dataTemperatures) {
        if(!dataTemperatures.isEmpty()){
            dataTemperatureRepositoryLocal.saveAll(dataTemperatures);
        }
        return 1;
    }
}
