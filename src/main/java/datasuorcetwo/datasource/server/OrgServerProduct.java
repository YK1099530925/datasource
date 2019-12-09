package datasuorcetwo.datasource.server;

import datasuorcetwo.datasource.baseInterface.BaseServerInte;
import datasuorcetwo.datasource.entity.Org;
import datasuorcetwo.datasource.repositoryProduct.OrgRepositoryProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrgServerProduct implements BaseServerInte<Org> {
    @Autowired
    OrgRepositoryProduct orgRepositoryProduct;

    @Override
    public int getMaxId() {
        return orgRepositoryProduct.findMaxId();
    }

    @Override
    public List<Org> getThanMaxId(Integer maxId) {
        return orgRepositoryProduct.findThanMaxId(maxId);
    }

    @Override
    public List<Org> getBetweenData(Integer beforeId, Integer afterId) {
        return orgRepositoryProduct.getBetweenData(beforeId,afterId);
    }

    @Override
    public int insert(List<Org> orgs) {
        return 0;
    }

    @Override
    public int deleteByIterator(Iterable<Org> iterable) {
        return 0;
    }
}
