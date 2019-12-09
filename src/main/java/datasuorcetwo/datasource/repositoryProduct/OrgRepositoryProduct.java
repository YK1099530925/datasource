package datasuorcetwo.datasource.repositoryProduct;

import datasuorcetwo.datasource.entity.Org;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OrgRepositoryProduct extends JpaRepository<Org, Integer> {
    @Query(nativeQuery = true, value = "select id from org order by id desc limit 1")
    Integer findMaxId();

    @Query(nativeQuery = true, value = "select * from org where id > ?")
    List<Org> findThanMaxId(Integer id);

    @Query(nativeQuery = true, value = "select * from org where id >= ? and id < ?")
    List<Org> getBetweenData(Integer beforeId, Integer afterId);
}
