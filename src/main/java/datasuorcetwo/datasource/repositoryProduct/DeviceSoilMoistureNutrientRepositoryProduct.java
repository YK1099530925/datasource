package datasuorcetwo.datasource.repositoryProduct;

import datasuorcetwo.datasource.entity.DeviceSoilMoistureNutrient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DeviceSoilMoistureNutrientRepositoryProduct extends JpaRepository<DeviceSoilMoistureNutrient, Integer> {
    @Query(nativeQuery = true, value = "select id from device_soil_moisture_nutrient order by id desc limit 1")
    Integer findMaxId();

    @Query(nativeQuery = true, value = "select * from device_soil_moisture_nutrient where id > ?")
    List<DeviceSoilMoistureNutrient> findThanMaxId(Integer id);

    @Query(nativeQuery = true, value = "select * from device_soil_moisture_nutrient where id >= ? and id < ?")
    List<DeviceSoilMoistureNutrient> getBetweenData(Integer beforeId, Integer afterId);
}
