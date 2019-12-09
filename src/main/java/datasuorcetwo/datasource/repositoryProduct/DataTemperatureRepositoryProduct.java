package datasuorcetwo.datasource.repositoryProduct;

import datasuorcetwo.datasource.entity.DataTemperature;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DataTemperatureRepositoryProduct extends JpaRepository<DataTemperature, Integer> {
    @Query(nativeQuery = true, value = "select id from data_temperature limit 1")
    Integer getMinId();

    @Query(nativeQuery = true, value = "select * from data_temperature where id > ? and id <= ?")
    List<DataTemperature> get1wData(Integer beforeId, Integer afterId);

    @Query(nativeQuery = true, value = "select id from data_temperature order by id desc limit 1")
    Integer findMaxId();
}
