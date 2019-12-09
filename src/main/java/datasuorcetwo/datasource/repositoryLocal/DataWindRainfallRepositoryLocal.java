package datasuorcetwo.datasource.repositoryLocal;

import datasuorcetwo.datasource.entity.DataWindRainfall;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DataWindRainfallRepositoryLocal extends JpaRepository<DataWindRainfall, Integer> {
    @Query(nativeQuery = true, value = "select id from data_wind_rainfall order by id desc limit 1")
    Integer findMaxId();
}
