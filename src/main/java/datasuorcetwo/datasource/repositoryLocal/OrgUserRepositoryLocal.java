package datasuorcetwo.datasource.repositoryLocal;

import datasuorcetwo.datasource.entity.OrgUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OrgUserRepositoryLocal extends JpaRepository<OrgUser, Integer> {
    @Query(nativeQuery = true, value = "select user_id from org_user order by user_id desc limit 1")
    Integer findMaxId();

    @Query(nativeQuery = true, value = "select * from org_user where user_id > ?")
    List<OrgUser> findThanMaxId(Integer id);

    @Query(nativeQuery = true, value = "select * from org_user where user_id >= ? and user_id < ?")
    List<OrgUser> getBetweenData(Integer beforeId, Integer afterId);
}
