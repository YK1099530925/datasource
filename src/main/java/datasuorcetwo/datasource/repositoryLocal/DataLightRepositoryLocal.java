package datasuorcetwo.datasource.repositoryLocal;

import datasuorcetwo.datasource.entity.DataLight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DataLightRepositoryLocal extends JpaRepository<DataLight, Integer> {
    @Query(nativeQuery = true, value = "select id from data_light order by id desc limit 1")
    Integer findMaxId();
}
