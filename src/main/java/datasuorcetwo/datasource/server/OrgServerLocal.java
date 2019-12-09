package datasuorcetwo.datasource.server;

import datasuorcetwo.datasource.baseInterface.BaseServerInte;
import datasuorcetwo.datasource.entity.Org;
import datasuorcetwo.datasource.repositoryLocal.OrgRepositoryLocal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrgServerLocal implements BaseServerInte<Org> {
    @Autowired
    OrgRepositoryLocal orgRepositoryLocal;

    @Override
    public int getMaxId() {
        if(orgRepositoryLocal.findMaxId() == null){
            return 0;
        }
        return orgRepositoryLocal.findMaxId();
    }

    @Override
    public List<Org> getThanMaxId(Integer maxId) {
        return orgRepositoryLocal.findThanMaxId(maxId);
    }

    @Override
    public List<Org> getBetweenData(Integer beforeId, Integer afterId) {
        return orgRepositoryLocal.getBetweenData(beforeId,afterId);
    }

    @Override
    public int insert(List<Org> orgs) {
        if(!orgs.isEmpty()){
            orgRepositoryLocal.saveAll(orgs);
        }
        return 0;
    }

    @Override
    public int deleteByIterator(Iterable<Org> iterable) {
        orgRepositoryLocal.deleteAll(iterable);
        return 0;
    }
}
