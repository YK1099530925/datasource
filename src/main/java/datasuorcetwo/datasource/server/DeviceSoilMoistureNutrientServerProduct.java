package datasuorcetwo.datasource.server;

import datasuorcetwo.datasource.baseInterface.BaseServerInte;
import datasuorcetwo.datasource.entity.DeviceSoilMoistureNutrient;
import datasuorcetwo.datasource.repositoryProduct.DeviceSoilMoistureNutrientRepositoryProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceSoilMoistureNutrientServerProduct implements BaseServerInte<DeviceSoilMoistureNutrient> {
    @Autowired
    DeviceSoilMoistureNutrientRepositoryProduct deviceSoilMoistureNutrientRepositoryProduct;

    @Override
    public int getMaxId() {
        return deviceSoilMoistureNutrientRepositoryProduct.findMaxId();
    }

    @Override
    public List<DeviceSoilMoistureNutrient> getThanMaxId(Integer maxId) {
        return deviceSoilMoistureNutrientRepositoryProduct.findThanMaxId(maxId);
    }

    @Override
    public List<DeviceSoilMoistureNutrient> getBetweenData(Integer beforeId, Integer afterId) {
        return deviceSoilMoistureNutrientRepositoryProduct.getBetweenData(beforeId,afterId);
    }

    @Override
    public int insert(List<DeviceSoilMoistureNutrient> deviceSoilMoistureNutrients) {
        return 0;
    }

    @Override
    public int deleteByIterator(Iterable<DeviceSoilMoistureNutrient> iterable) {
        return 0;
    }
}
