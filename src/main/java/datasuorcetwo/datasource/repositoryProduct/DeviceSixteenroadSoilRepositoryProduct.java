package datasuorcetwo.datasource.repositoryProduct;

import datasuorcetwo.datasource.entity.DeviceSixteenroadSoil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DeviceSixteenroadSoilRepositoryProduct extends JpaRepository<DeviceSixteenroadSoil, Integer> {
    @Query(nativeQuery = true, value = "select id from device_sixteenroad_soil order by id desc limit 1")
    Integer findMaxId();

    @Query(nativeQuery = true, value = "select * from device_sixteenroad_soil where id > ?")
    List<DeviceSixteenroadSoil> findThanMaxId(Integer id);

    @Query(nativeQuery = true, value = "select * from device_sixteenroad_soil where id >= ? and id < ?")
    List<DeviceSixteenroadSoil> getBetweenData(Integer beforeId, Integer afterId);
}
