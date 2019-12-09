package datasuorcetwo.datasource.server;

import datasuorcetwo.datasource.baseInterface.DataBaseServerInte;
import datasuorcetwo.datasource.entity.DataLight;
import datasuorcetwo.datasource.repositoryLocal.DataLightRepositoryLocal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataLightServerLocal implements DataBaseServerInte<DataLight> {

    @Autowired
    DataLightRepositoryLocal dataLightRepositoryLocal;

    @Override
    public Integer getMaxId() {
        return dataLightRepositoryLocal.findMaxId();
    }

    @Override
    public Integer getMinId() {
        return null;
    }

    @Override
    public List<DataLight> get1wData(Integer beforeId, Integer afterId) {
        return null;
    }

    @Override
    public int insert(List<DataLight> dataLights) {
        if(!dataLights.isEmpty()){
            dataLightRepositoryLocal.saveAll(dataLights);
        }
        return 1;
    }
}
