package datasuorcetwo.datasource.repositoryProduct;

import datasuorcetwo.datasource.entity.NbCommand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;

public interface NbCommandRepositoryProduct extends JpaRepository<NbCommand, String> {

    @Query(nativeQuery = true, value = "select * from nb_command where create_time > ? and create_time <= ? ORDER BY create_time")
    List<NbCommand> getBetweenCreateTime(Date before, Date after);

    @Query(nativeQuery = true, value = "select count(*) from nb_command where create_time > ? and create_time <= ?")
    int getCountByCreateTimeBetween(Date before, Date after);

    @Query(nativeQuery = true, value = "SELECT create_time from nb_command ORDER BY create_time desc LIMIT 1")
    Date getMaxCreateTime();
}
