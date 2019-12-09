package datasuorcetwo.datasource.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "data_acceleration")
public class DataAcceleration extends BaseEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "idOrGenerate")
    @GenericGenerator(name = "idOrGenerate", strategy = "datasuorcetwo.datasource.entity.IdOrGenerate")
    @Column(name = "Id")
    private Integer id;
    @Column(name = "create_time")
    private Date createTime;
    @Column(name = "accx_value")
    private Double accxValue;
    @Column(name = "accy_value")
    private Double accyValue;
    @Column(name = "accz_value")
    private Double acczValue;
    @Column(name = "device_id")
    private Integer deviceId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Double getAccxValue() {
        return accxValue;
    }

    public void setAccxValue(Double accxValue) {
        this.accxValue = accxValue;
    }

    public Double getAccyValue() {
        return accyValue;
    }

    public void setAccyValue(Double accyValue) {
        this.accyValue = accyValue;
    }

    public Double getAcczValue() {
        return acczValue;
    }

    public void setAcczValue(Double acczValue) {
        this.acczValue = acczValue;
    }

    public Integer getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }
}
