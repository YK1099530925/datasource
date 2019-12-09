package datasuorcetwo.datasource.repositoryProduct;

import datasuorcetwo.datasource.entity.DataSoilMoistureNutrient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DataSoilMoistureNutrientRepositoryProduct extends JpaRepository<DataSoilMoistureNutrient, Integer> {
    @Query(nativeQuery = true, value = "select id from data_soil_moist_nutr limit 1")
    Integer getMinId();

    @Query(nativeQuery = true, value = "select * from data_soil_moist_nutr where id > ? and id <= ?")
    List<DataSoilMoistureNutrient> get1wData(Integer beforeId, Integer afterId);

    @Query(nativeQuery = true, value = "select id from data_soil_moist_nutr order by id desc limit 1")
    Integer findMaxId();
}
