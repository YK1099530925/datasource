package datasuorcetwo.datasource.repositoryLocal;

import datasuorcetwo.datasource.entity.DeviceAlarm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DeviceAlarmRepositoryLocal extends JpaRepository<DeviceAlarm, Integer> {
    @Query(nativeQuery = true, value = "select id from device_alarm order by id desc limit 1")
    Integer findMaxId();

    @Query(nativeQuery = true, value = "select * from device_alarm where id > ?")
    List<DeviceAlarm> findThanMaxId(Integer id);

    @Query(nativeQuery = true, value = "select * from device_alarm where id >= ? and id < ?")
    List<DeviceAlarm> getBetweenData(Integer beforeId, Integer afterId);
}
