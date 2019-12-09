package datasuorcetwo.datasource.repositoryLocal;

import datasuorcetwo.datasource.entity.NbCommand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;

public interface NbCommandRepositoryLocal extends JpaRepository<NbCommand, String> {

    @Query(nativeQuery = true, value = "SELECT create_time from nb_command ORDER BY create_time desc LIMIT 1")
    Date getMaxCreateTime();
}
