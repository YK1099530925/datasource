package datasuorcetwo.datasource.server;

import datasuorcetwo.datasource.baseInterface.BaseServerInte;
import datasuorcetwo.datasource.entity.Group;
import datasuorcetwo.datasource.repositoryProduct.GroupRepositoryProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupServerProduct implements BaseServerInte<Group> {
    @Autowired
    GroupRepositoryProduct groupRepositoryProduct;

    @Override
    public int getMaxId() {
        return groupRepositoryProduct.findMaxId();
    }

    @Override
    public List<Group> getThanMaxId(Integer maxId) {
        return groupRepositoryProduct.findThanMaxId(maxId);
    }

    @Override
    public List<Group> getBetweenData(Integer beforeId, Integer afterId) {
        return groupRepositoryProduct.getBetweenData(beforeId,afterId);
    }

    @Override
    public int insert(List<Group> groups) {
        return 0;
    }

    @Override
    public int deleteByIterator(Iterable<Group> iterable) {
        return 0;
    }
}
