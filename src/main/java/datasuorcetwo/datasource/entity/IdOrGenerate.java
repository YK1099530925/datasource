package datasuorcetwo.datasource.entity;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentityGenerator;

import java.io.Serializable;

/**
 * 自定义主键：否则jpa的save的方法添加数据会导致有数据的id根据自增策略进行添加，因此已有id的数据进行插入，已有的id会改变
 */
public class IdOrGenerate extends IdentityGenerator {
    @Override
    public Serializable generate(SharedSessionContractImplementor s, Object obj) throws HibernateException{
        if(obj == null){
            throw new HibernateException(new NullPointerException());
        }
        if((((BaseEntity) obj).getId()) == null){
            Serializable id = super.generate(s, obj);
            return id;
        }else {
            return ((BaseEntity) obj).getId();
        }
    }
}
