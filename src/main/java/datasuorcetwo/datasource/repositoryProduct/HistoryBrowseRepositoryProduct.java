package datasuorcetwo.datasource.repositoryProduct;

import datasuorcetwo.datasource.entity.HistoryBrowse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface HistoryBrowseRepositoryProduct extends JpaRepository<HistoryBrowse, Integer> {

    @Query(nativeQuery = true, value = "select id from history_browse limit 1")
    Integer getMinId();

    @Query(nativeQuery = true, value = "select * from history_browse where id > ? and id <= ?")
    List<HistoryBrowse> get1wData(Integer beforeId, Integer afterId);

    @Query(nativeQuery = true, value = "select id from history_browse order by id desc limit 1")
    Integer findMaxId();
}
