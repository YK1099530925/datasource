package datasuorcetwo.datasource.repositoryLocal;

import datasuorcetwo.datasource.entity.NbCommandSensor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;

public interface NbCommandSensorRepositoryLocal extends JpaRepository<NbCommandSensor, String> {
    @Query(nativeQuery = true, value = "SELECT create_time from nb_command_sensor ORDER BY create_time desc LIMIT 1")
    Date getMaxCreateTime();
}
