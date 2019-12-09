package datasuorcetwo.datasource.repositoryProduct;

import datasuorcetwo.datasource.entity.DataSixteenroadSoil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DataSixteenroadSoilRepositoryProduct extends JpaRepository<DataSixteenroadSoil, Integer> {
    @Query(nativeQuery = true, value = "select id from data_sixteenroad_soil limit 1")
    Integer getMinId();

    @Query(nativeQuery = true, value = "select * from data_sixteenroad_soil where id > ? and id <= ?")
    List<DataSixteenroadSoil> get1wData(Integer beforeId, Integer afterId);

    @Query(nativeQuery = true, value = "select id from data_sixteenroad_soil order by id desc limit 1")
    Integer findMaxId();
}
