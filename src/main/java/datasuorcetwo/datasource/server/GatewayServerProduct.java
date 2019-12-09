package datasuorcetwo.datasource.server;

import datasuorcetwo.datasource.baseInterface.BaseServerInte;
import datasuorcetwo.datasource.entity.Gateway;
import datasuorcetwo.datasource.repositoryProduct.GatewayRepositoryProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GatewayServerProduct implements BaseServerInte<Gateway> {
    @Autowired
    GatewayRepositoryProduct gatewayRepositoryProduct;

    @Override
    public int getMaxId() {
        return gatewayRepositoryProduct.findMaxId();
    }

    @Override
    public List<Gateway> getThanMaxId(Integer maxId) {
        return gatewayRepositoryProduct.findThanMaxId(maxId);
    }

    @Override
    public List<Gateway> getBetweenData(Integer beforeId, Integer afterId) {
        return gatewayRepositoryProduct.getBetweenData(beforeId,afterId);
    }

    @Override
    public int insert(List<Gateway> gateways) {
        return 0;
    }

    @Override
    public int deleteByIterator(Iterable<Gateway> iterable) {
        return 0;
    }
}
