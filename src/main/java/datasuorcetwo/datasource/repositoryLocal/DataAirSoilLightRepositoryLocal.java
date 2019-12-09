package datasuorcetwo.datasource.repositoryLocal;

import datasuorcetwo.datasource.entity.DataAirSoilLight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DataAirSoilLightRepositoryLocal extends JpaRepository<DataAirSoilLight, Integer> {
    @Query(nativeQuery = true, value = "select id from data_air_soil_light order by id desc limit 1")
    Integer findMaxId();
}
