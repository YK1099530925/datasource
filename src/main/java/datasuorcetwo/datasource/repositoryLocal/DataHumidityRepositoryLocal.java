package datasuorcetwo.datasource.repositoryLocal;

import datasuorcetwo.datasource.entity.DataHumidity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DataHumidityRepositoryLocal extends JpaRepository<DataHumidity, Integer> {
    @Query(nativeQuery = true, value = "select id from data_humidity order by id desc limit 1")
    Integer findMaxId();
}
