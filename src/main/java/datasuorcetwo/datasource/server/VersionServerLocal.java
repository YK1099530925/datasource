package datasuorcetwo.datasource.server;

import datasuorcetwo.datasource.baseInterface.BaseServerInte;
import datasuorcetwo.datasource.entity.Version;
import datasuorcetwo.datasource.repositoryLocal.VersionRepositoryLocal;
import datasuorcetwo.datasource.repositoryProduct.VersionRepositoryProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VersionServerLocal implements BaseServerInte<Version> {
    @Autowired
    VersionRepositoryLocal versionRepositoryLocal;

    @Override
    public int getMaxId() {
        if(versionRepositoryLocal.findMaxId() == null){
            return 0;
        }
        return versionRepositoryLocal.findMaxId();
    }

    @Override
    public List<Version> getThanMaxId(Integer maxId) {
        return versionRepositoryLocal.findThanMaxId(maxId);
    }

    @Override
    public List<Version> getBetweenData(Integer beforeId, Integer afterId) {
        return versionRepositoryLocal.getBetweenData(beforeId,afterId);
    }

    @Override
    public int insert(List<Version> versions) {
        if(!versions.isEmpty()){
            versionRepositoryLocal.saveAll(versions);
        }
        return 0;
    }

    @Override
    public int deleteByIterator(Iterable<Version> iterable) {
        versionRepositoryLocal.deleteAll(iterable);
        return 0;
    }
}
