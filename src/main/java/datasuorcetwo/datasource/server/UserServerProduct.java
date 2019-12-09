package datasuorcetwo.datasource.server;

import datasuorcetwo.datasource.baseInterface.BaseServerInte;
import datasuorcetwo.datasource.entity.User;
import datasuorcetwo.datasource.repositoryProduct.UserRepositoryProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServerProduct implements BaseServerInte<User> {
    @Autowired
    UserRepositoryProduct userRepositoryProduct;

    @Override
    public int getMaxId() {
        return userRepositoryProduct.findMaxId();
    }

    @Override
    public List<User> getThanMaxId(Integer maxId) {
        return userRepositoryProduct.findThanMaxId(maxId);
    }

    @Override
    public List<User> getBetweenData(Integer beforeId, Integer afterId) {
        return userRepositoryProduct.getBetweenData(beforeId,afterId);
    }

    @Override
    public int insert(List<User> users) {
        return 0;
    }

    @Override
    public int deleteByIterator(Iterable<User> iterable) {
        return 0;
    }
}
