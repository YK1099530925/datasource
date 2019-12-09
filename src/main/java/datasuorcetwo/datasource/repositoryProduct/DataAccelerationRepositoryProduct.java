package datasuorcetwo.datasource.repositoryProduct;

import datasuorcetwo.datasource.entity.DataAcceleration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DataAccelerationRepositoryProduct extends JpaRepository<DataAcceleration, Integer> {
    @Query(nativeQuery = true, value = "select id from data_acceleration limit 1")
    Integer getMinId();

    @Query(nativeQuery = true, value = "select id,create_time,accx_value,accy_value,accz_value,device_id from data_acceleration where id > ? and id <= ?")
    List<DataAcceleration> get1wData(Integer beforeId, Integer afterId);

    @Query(nativeQuery = true, value = "select id from data_acceleration order by id desc limit 1")
    Integer findMaxId();
}
