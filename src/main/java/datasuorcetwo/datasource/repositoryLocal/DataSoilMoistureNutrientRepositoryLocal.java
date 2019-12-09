package datasuorcetwo.datasource.repositoryLocal;

import datasuorcetwo.datasource.entity.DataSoilMoistureNutrient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DataSoilMoistureNutrientRepositoryLocal extends JpaRepository<DataSoilMoistureNutrient, Integer> {
    @Query(nativeQuery = true, value = "select id from data_soil_moist_nutr order by id desc limit 1")
    Integer findMaxId();
}
