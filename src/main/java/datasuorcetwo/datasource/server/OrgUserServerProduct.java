package datasuorcetwo.datasource.server;

import datasuorcetwo.datasource.baseInterface.BaseServerInte;
import datasuorcetwo.datasource.entity.OrgUser;
import datasuorcetwo.datasource.repositoryProduct.OrgUserRepositoryProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrgUserServerProduct implements BaseServerInte<OrgUser> {
    @Autowired
    OrgUserRepositoryProduct orgUserRepositoryProduct;

    @Override
    public int getMaxId() {
        return orgUserRepositoryProduct.findMaxId();
    }

    @Override
    public List<OrgUser> getThanMaxId(Integer maxId) {
        return orgUserRepositoryProduct.findThanMaxId(maxId);
    }

    @Override
    public List<OrgUser> getBetweenData(Integer beforeId, Integer afterId) {
        return orgUserRepositoryProduct.getBetweenData(beforeId,afterId);
    }

    @Override
    public int insert(List<OrgUser> orgUsers) {
        return 0;
    }

    @Override
    public int deleteByIterator(Iterable<OrgUser> iterable) {
        return 0;
    }
}
