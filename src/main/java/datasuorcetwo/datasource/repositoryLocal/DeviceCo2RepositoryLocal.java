package datasuorcetwo.datasource.repositoryLocal;

import datasuorcetwo.datasource.entity.DeviceCo2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DeviceCo2RepositoryLocal extends JpaRepository<DeviceCo2, Integer> {
    @Query(nativeQuery = true, value = "select id from device_co2 order by id desc limit 1")
    Integer findMaxId();

    @Query(nativeQuery = true, value = "select * from device_co2 where id > ?")
    List<DeviceCo2> findThanMaxId(Integer id);

    @Query(nativeQuery = true, value = "select * from device_co2 where id >= ? and id < ?")
    List<DeviceCo2> getBetweenData(Integer beforeId, Integer afterId);
}
