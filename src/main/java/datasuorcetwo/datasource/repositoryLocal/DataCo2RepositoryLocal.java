package datasuorcetwo.datasource.repositoryLocal;

import datasuorcetwo.datasource.entity.DataCo2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DataCo2RepositoryLocal extends JpaRepository<DataCo2, Integer> {
    @Query(nativeQuery = true, value = "select id from data_co2 order by id desc limit 1")
    Integer findMaxId();
}
