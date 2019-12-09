package datasuorcetwo.datasource.repositoryLocal;

import datasuorcetwo.datasource.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepositoryLocal extends JpaRepository<User, Integer> {
    @Query(nativeQuery = true, value = "select id from `user` order by id desc limit 1")
    Integer findMaxId();

    @Query(nativeQuery = true, value = "select * from `user` where id > ?")
    List<User> findThanMaxId(Integer id);

    @Query(nativeQuery = true, value = "select * from `user` where id >= ? and id < ?")
    List<User> getBetweenData(Integer beforeId, Integer afterId);
}
