package datasuorcetwo.datasource.repositoryProduct;

import datasuorcetwo.datasource.entity.LinkageDevice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface LinkageDeviceRepositoryProduct extends JpaRepository<LinkageDevice, Integer> {
    @Query(nativeQuery = true, value = "select id from linkage_device order by id desc limit 1")
    Integer findMaxId();

    @Query(nativeQuery = true, value = "select * from linkage_device where id > ?")
    List<LinkageDevice> findThanMaxId(Integer id);

    @Query(nativeQuery = true, value = "select * from linkage_device where id >= ? and id < ?")
    List<LinkageDevice> getBetweenData(Integer beforeId, Integer afterId);
}
