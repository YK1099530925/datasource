package datasuorcetwo.datasource.server;

import datasuorcetwo.datasource.baseInterface.DataBaseServerInte;
import datasuorcetwo.datasource.entity.HistoryBrowse;
import datasuorcetwo.datasource.repositoryLocal.HistoryBrowseRepositoryLocal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HistoryBrowseServerLocal implements DataBaseServerInte<HistoryBrowse> {
    @Autowired
    HistoryBrowseRepositoryLocal historyBrowseRepositoryLocal;

    @Override
    public Integer getMaxId() {
        return historyBrowseRepositoryLocal.findMaxId();
    }

    @Override
    public Integer getMinId() {
        return null;
    }

    @Override
    public List<HistoryBrowse> get1wData(Integer beforeId, Integer afterId) {
        return null;
    }

    @Override
    public int insert(List<HistoryBrowse> historyBrowses) {
        if(!historyBrowses.isEmpty()){
            historyBrowseRepositoryLocal.saveAll(historyBrowses);
        }
        return 1;
    }
}
