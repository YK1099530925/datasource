package datasuorcetwo.datasource.server;

import datasuorcetwo.datasource.baseInterface.BaseServerInte;
import datasuorcetwo.datasource.entity.DeviceSwitch;
import datasuorcetwo.datasource.repositoryProduct.DeviceSwitchRepositoryProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DeviceSwitchServerProduct implements BaseServerInte<DeviceSwitch> {
    @Autowired
    DeviceSwitchRepositoryProduct deviceSwitchRepositoryProduct;

    @Override
    public int getMaxId() {
        return deviceSwitchRepositoryProduct.findMaxId();
    }

    @Override
    public List<DeviceSwitch> getThanMaxId(Integer maxId) {
        return deviceSwitchRepositoryProduct.findThanMaxId(maxId);
    }

    @Override
    public List<DeviceSwitch> getBetweenData(Integer beforeId, Integer afterId) {
        return deviceSwitchRepositoryProduct.getBetweenData(beforeId,afterId);
    }

    @Override
    public int insert(List<DeviceSwitch> deviceSwitches) {
        return 0;
    }

    @Override
    public int deleteByIterator(Iterable<DeviceSwitch> iterable) {
        return 0;
    }
}
