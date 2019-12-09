package datasuorcetwo.datasource.repositoryLocal;

import datasuorcetwo.datasource.entity.DataSixteenroadSoil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DataSixteenroadSoilRepositoryLocal extends JpaRepository<DataSixteenroadSoil, Integer> {
    @Query(nativeQuery = true, value = "select id from data_sixteenroad_soil order by id desc limit 1")
    Integer findMaxId();
}
