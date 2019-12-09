package datasuorcetwo.datasource.repositoryProduct;

import datasuorcetwo.datasource.entity.DeviceWaterPressure;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DeviceWaterPressureRepositoryProduct extends JpaRepository<DeviceWaterPressure, Integer> {
    @Query(nativeQuery = true, value = "select id from device_water_pressure order by id desc limit 1")
    Integer findMaxId();

    @Query(nativeQuery = true, value = "select * from device_water_pressure where id > ?")
    List<DeviceWaterPressure> findThanMaxId(Integer id);

    @Query(nativeQuery = true, value = "select * from device_water_pressure where id >= ? and id < ?")
    List<DeviceWaterPressure> getBetweenData(Integer beforeId, Integer afterId);
}
