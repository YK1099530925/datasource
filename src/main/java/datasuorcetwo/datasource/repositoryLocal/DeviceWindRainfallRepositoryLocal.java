package datasuorcetwo.datasource.repositoryLocal;

import datasuorcetwo.datasource.entity.DeviceWindRainfall;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DeviceWindRainfallRepositoryLocal extends JpaRepository<DeviceWindRainfall, Integer> {
    @Query(nativeQuery = true, value = "select id from device_wind_rainfall order by id desc limit 1")
    Integer findMaxId();

    @Query(nativeQuery = true, value = "select * from device_wind_rainfall where id > ?")
    List<DeviceWindRainfall> findThanMaxId(Integer id);

    @Query(nativeQuery = true, value = "select * from device_wind_rainfall where id >= ? and id < ?")
    List<DeviceWindRainfall> getBetweenData(Integer beforeId, Integer afterId);
}
