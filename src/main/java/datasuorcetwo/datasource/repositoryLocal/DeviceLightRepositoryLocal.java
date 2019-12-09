package datasuorcetwo.datasource.repositoryLocal;

import datasuorcetwo.datasource.entity.DeviceLight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DeviceLightRepositoryLocal extends JpaRepository<DeviceLight, Integer> {
    @Query(nativeQuery = true, value = "select id from device_light order by id desc limit 1")
    Integer findMaxId();

    @Query(nativeQuery = true, value = "select * from device_light where id > ?")
    List<DeviceLight> findThanMaxId(Integer id);

    @Query(nativeQuery = true, value = "select * from device_light where id >= ? and id < ?")
    List<DeviceLight> getBetweenData(Integer beforeId, Integer afterId);
}
