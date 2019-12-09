package datasuorcetwo.datasource.server;

import datasuorcetwo.datasource.baseInterface.DataBaseServerInte;
import datasuorcetwo.datasource.entity.DataSoilMoistureNutrient;
import datasuorcetwo.datasource.repositoryProduct.DataSoilMoistureNutrientRepositoryProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataSoilMoistureNutrientServiceProduct implements DataBaseServerInte<DataSoilMoistureNutrient> {
    @Autowired
    DataSoilMoistureNutrientRepositoryProduct dataSoilMoistureNutrientRepositoryProduct;

    @Override
    public Integer getMaxId() {
        return dataSoilMoistureNutrientRepositoryProduct.findMaxId();
    }

    @Override
    public Integer getMinId() {
        return dataSoilMoistureNutrientRepositoryProduct.getMinId();
    }

    @Override
    public List<DataSoilMoistureNutrient> get1wData(Integer beforeId, Integer afterId) {
        return dataSoilMoistureNutrientRepositoryProduct.get1wData(beforeId, afterId);
    }

    @Override
    public int insert(List<DataSoilMoistureNutrient> dataSoilMoistureNutrients) {
        return 0;
    }
}
