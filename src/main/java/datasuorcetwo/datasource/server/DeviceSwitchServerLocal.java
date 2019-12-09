package datasuorcetwo.datasource.server;

import datasuorcetwo.datasource.baseInterface.BaseServerInte;
import datasuorcetwo.datasource.entity.DeviceSwitch;
import datasuorcetwo.datasource.repositoryLocal.DeviceSwitchRepositoryLocal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceSwitchServerLocal implements BaseServerInte<DeviceSwitch> {
    @Autowired
    DeviceSwitchRepositoryLocal deviceSwitchRepositoryLocal;

    @Override
    public int getMaxId() {
        if(deviceSwitchRepositoryLocal.findMaxId() == null){
            return 0;
        }
        return deviceSwitchRepositoryLocal.findMaxId();
    }

    @Override
    public List<DeviceSwitch> getThanMaxId(Integer maxId) {
        return deviceSwitchRepositoryLocal.findThanMaxId(maxId);
    }

    @Override
    public List<DeviceSwitch> getBetweenData(Integer beforeId, Integer afterId) {
        return deviceSwitchRepositoryLocal.getBetweenData(beforeId,afterId);
    }

    @Override
    public int insert(List<DeviceSwitch> deviceSwitches) {
        if(!deviceSwitches.isEmpty()){
            deviceSwitchRepositoryLocal.saveAll(deviceSwitches);
        }
        return 0;
    }

    @Override
    public int deleteByIterator(Iterable<DeviceSwitch> iterable) {
        deviceSwitchRepositoryLocal.deleteAll(iterable);
        return 0;
    }
}
