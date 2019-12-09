package datasuorcetwo.datasource.repositoryLocal;

import datasuorcetwo.datasource.entity.DeviceHumidity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DeviceHumidityRepositoryLocal extends JpaRepository<DeviceHumidity, Integer> {
    @Query(nativeQuery = true, value = "select id from device_humidity order by id desc limit 1")
    Integer findMaxId();

    @Query(nativeQuery = true, value = "select * from device_humidity where id > ?")
    List<DeviceHumidity> findThanMaxId(Integer id);

    @Query(nativeQuery = true, value = "select * from device_humidity where id >= ? and id < ?")
    List<DeviceHumidity> getBetweenData(Integer beforeId, Integer afterId);
}
