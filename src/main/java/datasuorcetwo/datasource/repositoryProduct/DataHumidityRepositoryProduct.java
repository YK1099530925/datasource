package datasuorcetwo.datasource.repositoryProduct;

import datasuorcetwo.datasource.entity.DataHumidity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DataHumidityRepositoryProduct extends JpaRepository<DataHumidity, Integer> {

    @Query(nativeQuery = true, value = "select id from data_humidity limit 1")
    Integer getMinId();

    @Query(nativeQuery = true, value = "select * from data_humidity where id > ? and id <= ?")
    List<DataHumidity> get1wData(Integer beforeId, Integer afterId);

    @Query(nativeQuery = true, value = "select id from data_humidity order by id desc limit 1")
    Integer findMaxId();
}
