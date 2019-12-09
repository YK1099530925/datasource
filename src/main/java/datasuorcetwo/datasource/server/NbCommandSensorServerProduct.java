package datasuorcetwo.datasource.server;

import datasuorcetwo.datasource.baseInterface.NbBaseServerInte;
import datasuorcetwo.datasource.entity.NbCommandSensor;
import datasuorcetwo.datasource.repositoryProduct.NbCommandSensorRepositoryProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class NbCommandSensorServerProduct implements NbBaseServerInte<NbCommandSensor> {

    @Autowired
    NbCommandSensorRepositoryProduct nbCommandSensorRepositoryProduct;

    @Override
    public NbCommandSensor getByCreateTime(Date date) {
        return null;
    }

    @Override
    public Date getMaxCreateTime() {
        return nbCommandSensorRepositoryProduct.getMaxCreateTime();
    }

    @Override
    public List<NbCommandSensor> getBetweenCreateTime(Date before, Date after) {
        return nbCommandSensorRepositoryProduct.getBetweenCreateTime(before, after);
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
        return 0;
    }

    @Override
    public int deleteByIterator(Iterable<NbCommandSensor> iterable) {
        return 0;
    }
}
