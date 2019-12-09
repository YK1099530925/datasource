package datasuorcetwo.datasource.server;

import datasuorcetwo.datasource.baseInterface.NbBaseServerInte;
import datasuorcetwo.datasource.entity.NbCommandSensor;
import datasuorcetwo.datasource.repositoryLocal.NbCommandSensorRepositoryLocal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class NbCommandSensorServerLocal implements NbBaseServerInte<NbCommandSensor> {

    @Autowired
    NbCommandSensorRepositoryLocal nbCommandSensorRepositoryLocal;

    @Override
    public NbCommandSensor getByCreateTime(Date date) {
        return null;
    }

    @Override
    public Date getMaxCreateTime() {
        return nbCommandSensorRepositoryLocal.getMaxCreateTime();
    }

    @Override
    public List<NbCommandSensor> getBetweenCreateTime(Date before, Date after) {
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
    public List<NbCommandSensor> getThanMaxId(Integer id) {
        return null;
    }

    @Override
    public List<NbCommandSensor> getBetweenData(Integer beforeId, Integer afterId) {
        return null;
    }

    @Override
    public int insert(List<NbCommandSensor> nbCommandSensors) {
        if(!nbCommandSensors.isEmpty()){
            nbCommandSensorRepositoryLocal.saveAll(nbCommandSensors);
        }
        return 0;
    }

    @Override
    public int deleteByIterator(Iterable<NbCommandSensor> iterable) {
        return 0;
    }
}
