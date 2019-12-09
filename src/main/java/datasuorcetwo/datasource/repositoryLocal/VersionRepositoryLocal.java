package datasuorcetwo.datasource.repositoryLocal;

import datasuorcetwo.datasource.entity.Version;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface VersionRepositoryLocal extends JpaRepository<Version, Integer> {
    @Query(nativeQuery = true, value = "select id from version order by id desc limit 1")
    Integer findMaxId();

    @Query(nativeQuery = true, value = "select * from version where id > ?")
    List<Version> findThanMaxId(Integer id);

    @Query(nativeQuery = true, value = "select * from version where id >= ? and id < ?")
    List<Version> getBetweenData(Integer beforeId, Integer afterId);
}
