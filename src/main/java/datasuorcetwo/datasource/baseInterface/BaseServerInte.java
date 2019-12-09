package datasuorcetwo.datasource.baseInterface;

import java.util.List;

public interface BaseServerInte<T> {
    // 获取最大id
    int getMaxId();
    // 获取id之后的数据
    List<T> getThanMaxId(Integer id);
    List<T> getBetweenData(Integer beforeId, Integer afterId);
    int insert(List<T> ts);
    // 根据iterator删除
    int deleteByIterator(Iterable<T> iterable);
}
