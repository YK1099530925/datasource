package datasuorcetwo.datasource.server;

import datasuorcetwo.datasource.baseInterface.DataBaseServerInte;
import datasuorcetwo.datasource.entity.DataCo2;
import datasuorcetwo.datasource.repositoryProduct.DataCo2RepositoryProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataCo2ServerProduct implements DataBaseServerInte<DataCo2> {

    @Autowired
    DataCo2RepositoryProduct dataCo2RepositoryProduct;

    @Override
    public Integer getMaxId() {
        return dataCo2RepositoryProduct.findMaxId();
    }

    @Override
    public Integer getMinId() {
        return dataCo2RepositoryProduct.getMinId();
    }

    @Override
    public List<DataCo2> get1wData(Integer beforeId, Integer afterId) {
        return dataCo2RepositoryProduct.get1wData(beforeId, afterId);
    }

    @Override
    public int insert(List<DataCo2> dataCo2s) {
        return 0;
    }
}
