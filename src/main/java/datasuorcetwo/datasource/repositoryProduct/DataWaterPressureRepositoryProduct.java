package datasuorcetwo.datasource.repositoryProduct;

import datasuorcetwo.datasource.entity.DataWaterPressure;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DataWaterPressureRepositoryProduct extends JpaRepository<DataWaterPressure, Integer> {
    @Query(nativeQuery = true, value = "select id from data_water_pressure limit 1")
    Integer getMinId();

    @Query(nativeQuery = true, value = "select * from data_water_pressure where id > ? and id <= ?")
    List<DataWaterPressure> get1wData(Integer beforeId, Integer afterId);

    @Query(nativeQuery = true, value = "select id from data_water_pressure order by id desc limit 1")
    Integer findMaxId();
}
