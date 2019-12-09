package datasuorcetwo.datasource.server;

import datasuorcetwo.datasource.baseInterface.BaseServerInte;
import datasuorcetwo.datasource.entity.User;
import datasuorcetwo.datasource.repositoryLocal.UserRepositoryLocal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServerLocal implements BaseServerInte<User> {
    @Autowired
    UserRepositoryLocal userRepositoryLocal;

    @Override
    public int getMaxId() {
        if(userRepositoryLocal.findMaxId() == null){
            return 0;
        }
        return userRepositoryLocal.findMaxId();
    }

    @Override
    public List<User> getThanMaxId(Integer maxId) {
        return userRepositoryLocal.findThanMaxId(maxId);
    }

    @Override
    public List<User> getBetweenData(Integer beforeId, Integer afterId) {
        return userRepositoryLocal.getBetweenData(beforeId,afterId);
    }

    @Override
    public int insert(List<User> users) {
        if(!users.isEmpty()){
            userRepositoryLocal.saveAll(users);
        }
        return 0;
    }

    @Override
    public int deleteByIterator(Iterable<User> iterable) {
        userRepositoryLocal.deleteAll(iterable);
        return 0;
    }
}
