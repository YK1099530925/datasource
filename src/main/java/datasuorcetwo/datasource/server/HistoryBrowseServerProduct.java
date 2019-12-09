package datasuorcetwo.datasource.server;

import datasuorcetwo.datasource.baseInterface.DataBaseServerInte;
import datasuorcetwo.datasource.entity.HistoryBrowse;
import datasuorcetwo.datasource.repositoryProduct.HistoryBrowseRepositoryProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HistoryBrowseServerProduct implements DataBaseServerInte<HistoryBrowse> {
    @Autowired
    HistoryBrowseRepositoryProduct historyBrowseRepositoryProduct;

    @Override
    public Integer getMaxId() {
        return historyBrowseRepositoryProduct.findMaxId();
    }

    @Override
    public Integer getMinId() {
        return historyBrowseRepositoryProduct.getMinId();
    }

    @Override
    public List<HistoryBrowse> get1wData(Integer beforeId, Integer afterId) {
        return historyBrowseRepositoryProduct.get1wData(beforeId, afterId);
    }

    @Override
    public int insert(List<HistoryBrowse> historyBrowses) {
        return 0;
    }
}
