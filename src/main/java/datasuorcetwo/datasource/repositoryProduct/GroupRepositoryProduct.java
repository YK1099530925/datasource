package datasuorcetwo.datasource.repositoryProduct;

import datasuorcetwo.datasource.entity.Group;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GroupRepositoryProduct extends JpaRepository<Group, Integer> {
    @Query(nativeQuery = true, value = "select group_id from `group` order by group_id desc limit 1")
    Integer findMaxId();

    @Query(nativeQuery = true, value = "select * from `group` where group_id > ?")
    List<Group> findThanMaxId(Integer id);

    @Query(nativeQuery = true, value = "select * from `group` where group_id >= ? and group_id < ?")
    List<Group> getBetweenData(Integer beforeId, Integer afterId);
}
