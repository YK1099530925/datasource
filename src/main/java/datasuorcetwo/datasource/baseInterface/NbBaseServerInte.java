package datasuorcetwo.datasource.baseInterface;

import java.util.Date;
import java.util.List;

public interface NbBaseServerInte<T> extends BaseServerInte<T> {
    // 根据时间获取最大的一条
    T getByCreateTime(Date date);
    // 获取最后一条的时间
    Date getMaxCreateTime();
    // 获取某个时间段的数据
    List<T> getBetweenCreateTime(Date before, Date after);
    // 获取某个时间段一共有多少条数据
    int getCountByCreateTimeBetween(Date before, Date after);
}
