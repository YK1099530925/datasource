package datasuorcetwo.datasource.repositoryProduct;

import datasuorcetwo.datasource.entity.DataLight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DataLightRepositoryProduct extends JpaRepository<DataLight, Integer> {
    @Query(nativeQuery = true, value = "select id from data_light limit 1")
    Integer getMinId();

    @Query(nativeQuery = true, value = "select * from data_light where id > ? and id <= ?")
    List<DataLight> get1wData(Integer beforeId, Integer afterId);

    @Query(nativeQuery = true, value = "select id from data_light order by id desc limit 1")
    Integer findMaxId();
}
