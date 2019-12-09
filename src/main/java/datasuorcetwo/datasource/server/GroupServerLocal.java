package datasuorcetwo.datasource.server;

import datasuorcetwo.datasource.baseInterface.BaseServerInte;
import datasuorcetwo.datasource.entity.Group;
import datasuorcetwo.datasource.repositoryLocal.GroupRepositoryLocal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupServerLocal implements BaseServerInte<Group> {
    @Autowired
    GroupRepositoryLocal groupRepositoryLocal;

    @Override
    public int getMaxId() {
        if(groupRepositoryLocal.findMaxId() == null){
            return 0;
        }
        return groupRepositoryLocal.findMaxId();
    }

    @Override
    public List<Group> getThanMaxId(Integer maxId) {
        return groupRepositoryLocal.findThanMaxId(maxId);
    }

    @Override
    public List<Group> getBetweenData(Integer beforeId, Integer afterId) {
        return groupRepositoryLocal.getBetweenData(beforeId,afterId);
    }

    @Override
    public int insert(List<Group> groups) {
        if(!groups.isEmpty()){
            groupRepositoryLocal.saveAll(groups);
        }
        return 0;
    }

    @Override
    public int deleteByIterator(Iterable<Group> iterable) {
        groupRepositoryLocal.deleteAll(iterable);
        return 0;
    }
}
