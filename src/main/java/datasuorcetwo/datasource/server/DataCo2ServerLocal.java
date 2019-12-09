package datasuorcetwo.datasource.server;

import datasuorcetwo.datasource.baseInterface.DataBaseServerInte;
import datasuorcetwo.datasource.entity.DataCo2;
import datasuorcetwo.datasource.repositoryLocal.DataCo2RepositoryLocal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataCo2ServerLocal implements DataBaseServerInte<DataCo2> {

    @Autowired
    DataCo2RepositoryLocal dataCo2RepositoryLocal;

    @Override
    public Integer getMaxId() {
        return dataCo2RepositoryLocal.findMaxId();
    }

    @Override
    public Integer getMinId() {
        return null;
    }

    @Override
    public List<DataCo2> get1wData(Integer beforeId, Integer afterId) {
        return null;
    }

    @Override
    public int insert(List<DataCo2> dataCo2s) {
        if(!dataCo2s.isEmpty()){
            dataCo2RepositoryLocal.saveAll(dataCo2s);
        }
        return 1;
    }
}
