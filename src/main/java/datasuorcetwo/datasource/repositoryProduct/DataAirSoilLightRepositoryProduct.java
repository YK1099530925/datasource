package datasuorcetwo.datasource.repositoryProduct;

import datasuorcetwo.datasource.entity.DataAirSoilLight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DataAirSoilLightRepositoryProduct extends JpaRepository<DataAirSoilLight, Integer> {
    @Query(nativeQuery = true, value = "select id from data_air_soil_light limit 1")
    Integer getMinId();

    @Query(nativeQuery = true, value = "select id,create_time,air_temperature_value,air_humidity_value,soil_temperature_value," +
            "soil_humidity_value,light_value,device_id from data_air_soil_light where id > ? and id <= ?")
    List<DataAirSoilLight> get1wData(Integer beforeId, Integer afterId);

    @Query(nativeQuery = true, value = "select id from data_air_soil_light order by id desc limit 1")
    Integer findMaxId();
}
