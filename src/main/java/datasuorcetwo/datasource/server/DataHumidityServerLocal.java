package datasuorcetwo.datasource.server;

import datasuorcetwo.datasource.baseInterface.DataBaseServerInte;
import datasuorcetwo.datasource.entity.DataHumidity;
import datasuorcetwo.datasource.repositoryLocal.DataHumidityRepositoryLocal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataHumidityServerLocal implements DataBaseServerInte<DataHumidity> {

    @Autowired
    DataHumidityRepositoryLocal dataHumidityRepositoryLocal;

    @Override
    public Integer getMaxId() {
        return dataHumidityRepositoryLocal.findMaxId();
    }

    @Override
    public Integer getMinId() {
        return null;
    }

    @Override
    public List<DataHumidity> get1wData(Integer beforeId, Integer afterId) {
        return null;
    }

    @Override
    public int insert(List<DataHumidity> dataHumidities) {
        if(!dataHumidities.isEmpty()){
            dataHumidityRepositoryLocal.saveAll(dataHumidities);
        }
        return 1;
    }
}
