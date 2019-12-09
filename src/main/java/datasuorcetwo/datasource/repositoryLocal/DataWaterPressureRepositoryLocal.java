package datasuorcetwo.datasource.repositoryLocal;

import datasuorcetwo.datasource.entity.DataWaterPressure;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DataWaterPressureRepositoryLocal extends JpaRepository<DataWaterPressure, Integer> {
    @Query(nativeQuery = true, value = "select id from data_water_pressure order by id desc limit 1")
    Integer findMaxId();
}
