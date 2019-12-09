package datasuorcetwo.datasource.entity;

/**
 * baseentity的意义在于：让所有实体集成此类，然后在IdOrGenerate（自定义主键）中使用基类代表所有实体
 */
public class BaseEntity {
    Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        BaseEntity bean = (BaseEntity) o;
        if(toString().equals(bean.toString())) {
            return true;
        }
        return false;
    }

    /**
     * 重写hashcode，使用tostring来重写，是防止两个属性值一模一样的对象，因为地址不同，而导致hashcode不同，
     * 因此如下重写之后，两个对象是否相同，只会根据其属性值是否相同，来断定。
     * @return
     */
    @Override
    public int hashCode() {
        char[] charArray = this.toString().toCharArray();
        int hash = 0;
        for(char c : charArray) {
            hash = hash * 131 + c;
        }
        return hash;
    }
}
