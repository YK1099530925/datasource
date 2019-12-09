package datasuorcetwo.datasource.server;

import datasuorcetwo.datasource.baseInterface.NbBaseServerInte;
import datasuorcetwo.datasource.entity.NbCommand;
import datasuorcetwo.datasource.repositoryLocal.NbCommandRepositoryLocal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class NbCommandServerLocal implements NbBaseServerInte<NbCommand> {

    @Autowired
    NbCommandRepositoryLocal nbCommandRepositoryLocal;

    @Override
    public NbCommand getByCreateTime(Date date) {
        return null;
    }

    @Override
    public Date getMaxCreateTime() {
        return nbCommandRepositoryLocal.getMaxCreateTime();
    }

    @Override
    public List<NbCommand> getBetweenCreateTime(Date before, Date after) {
        return null;
    }

    @Override
    public int getCountByCreateTimeBetween(Date before, Date after) {
        return 0;
    }

    @Override
    public int getMaxId() {
        return 0;
    }

    @Override
    public List<NbCommand> getThanMaxId(Integer id) {
        return null;
    }

    @Override
    public List<NbCommand> getBetweenData(Integer beforeId, Integer afterId) {
        return null;
    }

    @Override
    public int insert(List<NbCommand> nbCommands) {
        if(!nbCommands.isEmpty()){
            nbCommandRepositoryLocal.saveAll(nbCommands);
        }
        return 0;
    }

    @Override
    public int deleteByIterator(Iterable<NbCommand> iterable) {
        return 0;
    }
}
