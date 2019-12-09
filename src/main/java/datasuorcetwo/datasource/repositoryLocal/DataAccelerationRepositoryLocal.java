package datasuorcetwo.datasource.repositoryLocal;

import datasuorcetwo.datasource.entity.DataAcceleration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DataAccelerationRepositoryLocal extends JpaRepository<DataAcceleration, Integer> {
    @Query(nativeQuery = true, value = "select id from data_acceleration order by id desc limit 1")
    Integer findMaxId();
}
