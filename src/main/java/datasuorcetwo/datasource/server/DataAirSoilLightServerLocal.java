package datasuorcetwo.datasource.server;

import datasuorcetwo.datasource.baseInterface.DataBaseServerInte;
import datasuorcetwo.datasource.entity.DataAirSoilLight;
import datasuorcetwo.datasource.repositoryLocal.DataAirSoilLightRepositoryLocal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataAirSoilLightServerLocal implements DataBaseServerInte<DataAirSoilLight> {

    @Autowired
    DataAirSoilLightRepositoryLocal dataAirSoilLightRepositoryLocal;

    @Override
    public Integer getMaxId() {
        return dataAirSoilLightRepositoryLocal.findMaxId();
    }

    @Override
    public Integer getMinId() {
        return null;
    }

    @Override
    public List<DataAirSoilLight> get1wData(Integer beforeId, Integer afterId) {
        return null;
    }

    @Override
    public int insert(List<DataAirSoilLight> dataAirSoilLights) {
        if(!dataAirSoilLights.isEmpty()){
            dataAirSoilLightRepositoryLocal.saveAll(dataAirSoilLights);
        }
        return 1;
    }
}
