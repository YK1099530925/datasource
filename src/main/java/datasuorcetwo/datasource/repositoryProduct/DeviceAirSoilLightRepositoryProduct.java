package datasuorcetwo.datasource.repositoryProduct;

import datasuorcetwo.datasource.entity.DeviceAirSoilLight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DeviceAirSoilLightRepositoryProduct extends JpaRepository<DeviceAirSoilLight, Integer> {
    @Query(nativeQuery = true, value = "select id from device_air_soil_light order by id desc limit 1")
    Integer findMaxId();

    @Query(nativeQuery = true, value = "select * from device_air_soil_light where id > ?")
    List<DeviceAirSoilLight> findThanMaxId(Integer id);

    @Query(nativeQuery = true, value = "select * from device_air_soil_light where id >= ? and id < ?")
    List<DeviceAirSoilLight> getBetweenData(Integer beforeId, Integer afterId);
}
