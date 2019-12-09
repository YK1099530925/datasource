package datasuorcetwo.datasource.repositoryProduct;

import datasuorcetwo.datasource.entity.DataCo2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DataCo2RepositoryProduct extends JpaRepository<DataCo2, Integer> {
    @Query(nativeQuery = true, value = "select id from data_co2 limit 1")
    Integer getMinId();

    @Query(nativeQuery = true, value = "select id,create_time,co2_value,device_id from data_co2 where id > ? and id <= ?")
    List<DataCo2> get1wData(Integer beforeId, Integer afterId);

    @Query(nativeQuery = true, value = "select id from data_co2 order by id desc limit 1")
    Integer findMaxId();
}
