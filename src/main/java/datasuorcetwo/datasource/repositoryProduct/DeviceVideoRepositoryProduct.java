package datasuorcetwo.datasource.repositoryProduct;

import datasuorcetwo.datasource.entity.DeviceVideo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DeviceVideoRepositoryProduct extends JpaRepository<DeviceVideo, Integer> {
    @Query(nativeQuery = true, value = "select id from device_video order by id desc limit 1")
    Integer findMaxId();

    @Query(nativeQuery = true, value = "select * from device_video where id > ?")
    List<DeviceVideo> findThanMaxId(Integer id);

    @Query(nativeQuery = true, value = "select * from device_video where id >= ? and id < ?")
    List<DeviceVideo> getBetweenData(Integer beforeId, Integer afterId);
}
