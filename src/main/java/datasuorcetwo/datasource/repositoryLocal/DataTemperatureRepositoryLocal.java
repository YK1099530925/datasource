package datasuorcetwo.datasource.repositoryLocal;

import datasuorcetwo.datasource.entity.DataTemperature;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DataTemperatureRepositoryLocal extends JpaRepository<DataTemperature, Integer> {
    @Query(nativeQuery = true, value = "select id from data_temperature order by id desc limit 1")
    Integer findMaxId();
}
