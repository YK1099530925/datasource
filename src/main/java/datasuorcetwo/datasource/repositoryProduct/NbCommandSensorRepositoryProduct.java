package datasuorcetwo.datasource.repositoryProduct;

import datasuorcetwo.datasource.entity.NbCommandSensor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;

public interface NbCommandSensorRepositoryProduct extends JpaRepository<NbCommandSensor, String> {

    @Query(nativeQuery = true, value = "select * from nb_command_sensor where create_time > ? and create_time <= ? ORDER BY create_time")
    List<NbCommandSensor> getBetweenCreateTime(Date before, Date after);

    @Query(nativeQuery = true, value = "select count(*) from nb_command_sensor where create_time > ? and create_time <= ?")
    int getCountByCreateTimeBetween(Date before, Date after);

    @Query(nativeQuery = true, value = "SELECT create_time from nb_command_sensor ORDER BY create_time desc LIMIT 1")
    Date getMaxCreateTime();
}
