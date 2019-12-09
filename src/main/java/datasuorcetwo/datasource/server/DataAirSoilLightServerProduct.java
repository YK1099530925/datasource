package datasuorcetwo.datasource.server;

import datasuorcetwo.datasource.baseInterface.DataBaseServerInte;
import datasuorcetwo.datasource.entity.DataAirSoilLight;
import datasuorcetwo.datasource.repositoryProduct.DataAirSoilLightRepositoryProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataAirSoilLightServerProduct implements DataBaseServerInte<DataAirSoilLight> {

    @Autowired
    DataAirSoilLightRepositoryProduct dataAirSoilLightRepositoryProduct;

    @Override
    public Integer getMaxId() {
        return dataAirSoilLightRepositoryProduct.findMaxId();
    }

    @Override
    public Integer getMinId() {
        return dataAirSoilLightRepositoryProduct.getMinId();
    }

    @Override
    public List<DataAirSoilLight> get1wData(Integer beforeId, Integer afterId) {
        return dataAirSoilLightRepositoryProduct.get1wData(beforeId, afterId);
    }

    @Override
    public int insert(List<DataAirSoilLight> dataAirSoilLights) {
        return 0;
    }
}
