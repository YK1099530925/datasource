package datasuorcetwo.datasource.repositoryLocal;

import datasuorcetwo.datasource.entity.GroupDevice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GroupDeviceRepositoryLocal extends JpaRepository<GroupDevice, Integer> {
    @Query(nativeQuery = true, value = "select id from group_device order by id desc limit 1")
    Integer findMaxId();

    @Query(nativeQuery = true, value = "select * from group_device where id > ?")
    List<GroupDevice> findThanMaxId(Integer id);

    @Query(nativeQuery = true, value = "select * from group_device where id >= ? and id < ?")
    List<GroupDevice> getBetweenData(Integer beforeId, Integer afterId);
}
