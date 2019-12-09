package datasuorcetwo.datasource.server;

import datasuorcetwo.datasource.baseInterface.DataBaseServerInte;
import datasuorcetwo.datasource.entity.DataSoilMoistureNutrient;
import datasuorcetwo.datasource.repositoryLocal.DataSoilMoistureNutrientRepositoryLocal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataSoilMoistureNutrientServiceLocal implements DataBaseServerInte<DataSoilMoistureNutrient> {
    @Autowired
    DataSoilMoistureNutrientRepositoryLocal dataSoilMoistureNutrientRepositoryLocal;

    @Override
    public Integer getMaxId() {
        return dataSoilMoistureNutrientRepositoryLocal.findMaxId();
    }

    @Override
    public Integer getMinId() {
        return null;
    }

    @Override
    public List<DataSoilMoistureNutrient> get1wData(Integer beforeId, Integer afterId) {
        return null;
    }

    @Override
    public int insert(List<DataSoilMoistureNutrient> dataSoilMoistureNutrients) {
        if(!dataSoilMoistureNutrients.isEmpty()){
            dataSoilMoistureNutrientRepositoryLocal.saveAll(dataSoilMoistureNutrients);
        }
        return 1;
    }
}
