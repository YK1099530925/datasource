package datasuorcetwo.datasource.server;

import datasuorcetwo.datasource.baseInterface.BaseServerInte;
import datasuorcetwo.datasource.entity.OrgUser;
import datasuorcetwo.datasource.repositoryLocal.OrgUserRepositoryLocal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrgUserServerLocal implements BaseServerInte<OrgUser> {
    @Autowired
    OrgUserRepositoryLocal orgUserRepositoryLocal;

    @Override
    public int getMaxId() {
        if(orgUserRepositoryLocal.findMaxId() == null){
            return 0;
        }
        return orgUserRepositoryLocal.findMaxId();
    }

    @Override
    public List<OrgUser> getThanMaxId(Integer maxId) {
        return orgUserRepositoryLocal.findThanMaxId(maxId);
    }

    @Override
    public List<OrgUser> getBetweenData(Integer beforeId, Integer afterId) {
        return orgUserRepositoryLocal.getBetweenData(beforeId, afterId);
    }

    @Override
    public int insert(List<OrgUser> orgUsers) {
        if(!orgUsers.isEmpty()){
            orgUserRepositoryLocal.saveAll(orgUsers);
        }
        return 0;
    }

    @Override
    public int deleteByIterator(Iterable<OrgUser> iterable) {
        orgUserRepositoryLocal.deleteAll(iterable);
        return 0;
    }
}
