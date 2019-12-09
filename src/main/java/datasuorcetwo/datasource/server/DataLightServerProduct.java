package datasuorcetwo.datasource.server;

import datasuorcetwo.datasource.baseInterface.DataBaseServerInte;
import datasuorcetwo.datasource.entity.DataLight;
import datasuorcetwo.datasource.repositoryProduct.DataLightRepositoryProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataLightServerProduct implements DataBaseServerInte<DataLight> {

    @Autowired
    DataLightRepositoryProduct dataLightRepositoryProduct;

    @Override
    public Integer getMaxId() {
        return dataLightRepositoryProduct.findMaxId();
    }

    @Override
    public Integer getMinId() {
        return dataLightRepositoryProduct.getMinId();
    }

    @Override
    public List<DataLight> get1wData(Integer beforeId, Integer afterId) {
        return dataLightRepositoryProduct.get1wData(beforeId, afterId);
    }

    @Override
    public int insert(List<DataLight> dataLights) {
        return 0;
    }
}
