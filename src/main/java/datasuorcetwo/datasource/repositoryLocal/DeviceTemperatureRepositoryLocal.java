package datasuorcetwo.datasource.repositoryLocal;

import datasuorcetwo.datasource.entity.DeviceTemperature;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DeviceTemperatureRepositoryLocal extends JpaRepository<DeviceTemperature, Integer> {
    @Query(nativeQuery = true, value = "select id from device_temperature order by id desc limit 1")
    Integer findMaxId();

    @Query(nativeQuery = true, value = "select * from device_temperature where id > ?")
    List<DeviceTemperature> findThanMaxId(Integer id);

    @Query(nativeQuery = true, value = "select * from device_temperature where id >= ? and id < ?")
    List<DeviceTemperature> getBetweenData(Integer beforeId, Integer afterId);
}
