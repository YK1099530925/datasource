package datasuorcetwo.datasource.repositoryLocal;

import datasuorcetwo.datasource.entity.DeviceType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DeviceTypeRepositoryLocal extends JpaRepository<DeviceType, Integer> {
    @Query(nativeQuery = true, value = "select id from device_type order by id desc limit 1")
    Integer findMaxId();
    @Query(nativeQuery = true, value = "select * from device_type where id > ?")
    List<DeviceType> findThanMaxId(Integer id);

    @Query(nativeQuery = true, value = "select * from device_type where id >= ? and id < ?")
    List<DeviceType> getBetweenData(Integer beforeId, Integer afterId);
}
