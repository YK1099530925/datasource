package datasuorcetwo.datasource.server;

import datasuorcetwo.datasource.baseInterface.DataBaseServerInte;
import datasuorcetwo.datasource.entity.DataWindRainfall;
import datasuorcetwo.datasource.repositoryLocal.DataWindRainfallRepositoryLocal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataWindRainfallServerLocal implements DataBaseServerInte<DataWindRainfall> {
    @Autowired
    DataWindRainfallRepositoryLocal dataWindRainfallRepositoryLocal;

    @Override
    public Integer getMaxId() {
        return dataWindRainfallRepositoryLocal.findMaxId();
    }

    @Override
    public Integer getMinId() {
        return null;
    }

    @Override
    public List<DataWindRainfall> get1wData(Integer beforeId, Integer afterId) {
        return null;
    }

    @Override
    public int insert(List<DataWindRainfall> dataWindRainfalls) {
        if(!dataWindRainfalls.isEmpty()){
            dataWindRainfallRepositoryLocal.saveAll(dataWindRainfalls);
        }
        return 1;
    }
}
