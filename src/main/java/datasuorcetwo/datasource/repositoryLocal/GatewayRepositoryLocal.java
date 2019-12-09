package datasuorcetwo.datasource.repositoryLocal;

import datasuorcetwo.datasource.entity.Gateway;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GatewayRepositoryLocal extends JpaRepository<Gateway, Integer> {
    @Query(nativeQuery = true, value = "select id from gateway order by id desc limit 1")
    Integer findMaxId();
    @Query(nativeQuery = true, value = "select * from gateway where id > ?")
    List<Gateway> findThanMaxId(Integer id);

    @Query(nativeQuery = true, value = "select * from gateway where id >= ? and id < ?")
    List<Gateway> getBetweenData(Integer beforeId, Integer afterId);
}
