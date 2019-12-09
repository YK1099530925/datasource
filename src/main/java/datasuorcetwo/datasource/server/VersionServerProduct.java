package datasuorcetwo.datasource.server;

import datasuorcetwo.datasource.baseInterface.BaseServerInte;
import datasuorcetwo.datasource.entity.Version;
import datasuorcetwo.datasource.repositoryProduct.VersionRepositoryProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VersionServerProduct implements BaseServerInte<Version> {
    @Autowired
    VersionRepositoryProduct versionRepositoryProduct;

    @Override
    public int getMaxId() {
        return versionRepositoryProduct.findMaxId();
    }

    @Override
    public List<Version> getThanMaxId(Integer maxId) {
        return versionRepositoryProduct.findThanMaxId(maxId);
    }

    @Override
    public List<Version> getBetweenData(Integer beforeId, Integer afterId) {
        return versionRepositoryProduct.getBetweenData(beforeId,afterId);
    }

    @Override
    public int insert(List<Version> versions) {
        return 0;
    }

    @Override
    public int deleteByIterator(Iterable<Version> iterable) {
        return 0;
    }
}
