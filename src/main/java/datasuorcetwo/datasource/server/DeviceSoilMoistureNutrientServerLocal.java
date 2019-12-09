package datasuorcetwo.datasource.server;

import datasuorcetwo.datasource.baseInterface.BaseServerInte;
import datasuorcetwo.datasource.entity.DeviceSoilMoistureNutrient;
import datasuorcetwo.datasource.repositoryLocal.DeviceSoilMoistureNutrientRepositoryLocal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceSoilMoistureNutrientServerLocal implements BaseServerInte<DeviceSoilMoistureNutrient> {
    @Autowired
    DeviceSoilMoistureNutrientRepositoryLocal deviceSoilMoistureNutrientRepositoryLocal;

    @Override
    public int getMaxId() {
        if(deviceSoilMoistureNutrientRepositoryLocal.findMaxId() == null){
            return 0;
        }
        return deviceSoilMoistureNutrientRepositoryLocal.findMaxId();
    }

    @Override
    public List<DeviceSoilMoistureNutrient> getThanMaxId(Integer maxId) {
        return deviceSoilMoistureNutrientRepositoryLocal.findThanMaxId(maxId);
    }

    @Override
    public List<DeviceSoilMoistureNutrient> getBetweenData(Integer beforeId, Integer afterId) {
        return deviceSoilMoistureNutrientRepositoryLocal.getBetweenData(beforeId,afterId);
    }

    @Override
    public int insert(List<DeviceSoilMoistureNutrient> deviceSoilMoistureNutrients) {
        if(!deviceSoilMoistureNutrients.isEmpty()){
            deviceSoilMoistureNutrientRepositoryLocal.saveAll(deviceSoilMoistureNutrients);
        }
        return 0;
    }

    @Override
    public int deleteByIterator(Iterable<DeviceSoilMoistureNutrient> iterable) {
        deviceSoilMoistureNutrientRepositoryLocal.deleteAll(iterable);
        return 0;
    }
}
