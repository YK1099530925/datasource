package datasuorcetwo.datasource.baseInterface;

import java.util.List;

public interface DataBaseServerInte<T> {
    // 目标数据库获取最大id
    Integer getMaxId();
    // 源数据库的最小id
    Integer getMinId();
    List<T> get1wData(Integer beforeId, Integer afterId);
    // 插入到目标数据库
    int insert(List<T> ts);
}
