package datasuorcetwo.datasource.repositoryLocal;

import datasuorcetwo.datasource.entity.HistoryBrowse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface HistoryBrowseRepositoryLocal extends JpaRepository<HistoryBrowse, Integer> {
    @Query(nativeQuery = true, value = "select id from history_browse order by id desc limit 1")
    Integer findMaxId();
}
