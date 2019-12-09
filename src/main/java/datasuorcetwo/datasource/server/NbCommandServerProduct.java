package datasuorcetwo.datasource.server;

import datasuorcetwo.datasource.baseInterface.NbBaseServerInte;
import datasuorcetwo.datasource.entity.NbCommand;
import datasuorcetwo.datasource.repositoryProduct.NbCommandRepositoryProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class NbCommandServerProduct implements NbBaseServerInte<NbCommand> {

    @Autowired
    NbCommandRepositoryProduct nbCommandRepositoryProduct;

    @Override
    public NbCommand getByCreateTime(Date date) {
        return null;
    }

    @Override
    public Date getMaxCreateTime() {
        return nbCommandRepositoryProduct.getMaxCreateTime();
    }

    @Override
    public List<NbCommand> getBetweenCreateTime(Date before, Date after) {
        return nbCommandRepositoryProduct.getBetweenCreateTime(before, after);
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
        return 0;
    }

    @Override
    public int deleteByIterator(Iterable<NbCommand> iterable) {
        return 0;
    }
}
