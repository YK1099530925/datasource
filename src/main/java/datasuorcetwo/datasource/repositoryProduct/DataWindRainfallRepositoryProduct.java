package datasuorcetwo.datasource.repositoryProduct;

import datasuorcetwo.datasource.entity.DataWindRainfall;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DataWindRainfallRepositoryProduct extends JpaRepository<DataWindRainfall, Integer> {
    @Query(nativeQuery = true, value = "select id from data_wind_rainfall limit 1")
    Integer getMinId();

    @Query(nativeQuery = true, value = "select * from data_wind_rainfall where id > ? and id <= ?")
    List<DataWindRainfall> get1wData(Integer beforeId, Integer afterId);

    @Query(nativeQuery = true, value = "select id from data_wind_rainfall order by id desc limit 1")
    Integer findMaxId();
}
