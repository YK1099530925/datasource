package datasuorcetwo.datasource.server;

import datasuorcetwo.datasource.baseInterface.BaseServerInte;
import datasuorcetwo.datasource.entity.Gateway;
import datasuorcetwo.datasource.repositoryLocal.GatewayRepositoryLocal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GatewayServerLocal implements BaseServerInte<Gateway> {
    @Autowired
    GatewayRepositoryLocal gatewayRepositoryLocal;

    @Override
    public int getMaxId() {
        if(gatewayRepositoryLocal.findMaxId() == null){
            return 0;
        }
        return gatewayRepositoryLocal.findMaxId();
    }

    @Override
    public List<Gateway> getThanMaxId(Integer maxId) {
        return gatewayRepositoryLocal.findThanMaxId(maxId);
    }

    @Override
    public List<Gateway> getBetweenData(Integer beforeId, Integer afterId) {
        return gatewayRepositoryLocal.getBetweenData(beforeId,afterId);
    }

    @Override
    public int insert(List<Gateway> gateways) {
        if(!gateways.isEmpty()){
            gatewayRepositoryLocal.saveAll(gateways);
        }
        return 0;
    }

    @Override
    public int deleteByIterator(Iterable<Gateway> iterable) {
        gatewayRepositoryLocal.deleteAll(iterable);
        return 0;
    }
}
