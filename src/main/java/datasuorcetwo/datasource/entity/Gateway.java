package datasuorcetwo.datasource.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "gateway")
public class Gateway extends BaseEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "idOrGenerate")
    @GenericGenerator(name = "idOrGenerate", strategy = "datasuorcetwo.datasource.entity.IdOrGenerate")
    @Column(name = "Id")
    private Integer id;
    @Column(name = "sn")
    private String sn;
    @Column(name = "gateway_id")
    private Integer gatewayId;
    @Column(name = "gateway_code")
    private String gatewayCode;
    @Column(name = "type")
    private Integer type;
    @Column(name = "status")
    private Integer status;
    @Column(name = "model")
    private Integer model;
    @Column(name = "brand")
    private String brand;
    @Column(name = "remake")
    private String remake;
    @Column(name = "max_delay")
    private Integer maxDelay;
    @Column(name = "active_time")
    private Date activeTime;
    @Column(name = "offline_time")
    private Date offlineTime;
    @Column(name = "lora_sensor_offline_time")
    private Integer loraSensorOfflineTime;
    @Column(name = "port")
    private Integer port;

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn == null ? null : sn.trim();
    }

    public Integer getGatewayId() {
        return gatewayId;
    }

    public void setGatewayId(Integer gatewayId) {
        this.gatewayId = gatewayId;
    }

    public String getGatewayCode() {
        return gatewayCode;
    }

    public void setGatewayCode(String gatewayCode) {
        this.gatewayCode = gatewayCode == null ? null : gatewayCode.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getModel() {
        return model;
    }

    public void setModel(Integer model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand == null ? null : brand.trim();
    }

    public String getRemake() {
        return remake;
    }

    public void setRemake(String remake) {
        this.remake = remake == null ? null : remake.trim();
    }

    public Integer getMaxDelay() {
        return maxDelay;
    }

    public void setMaxDelay(Integer maxDelay) {
        this.maxDelay = maxDelay;
    }

    public Date getActiveTime() {
        return activeTime;
    }

    public void setActiveTime(Date activeTime) {
        this.activeTime = activeTime;
    }

    public Date getOfflineTime() {
        return offlineTime;
    }

    public void setOfflineTime(Date offlineTime) {
        this.offlineTime = offlineTime;
    }

    public Integer getLoraSensorOfflineTime() {
        return loraSensorOfflineTime;
    }

    public void setLoraSensorOfflineTime(Integer loraSensorOfflineTime) {
        this.loraSensorOfflineTime = loraSensorOfflineTime;
    }

    @Override
    public String toString() {
        return "Gateway{" +
                "id=" + id +
                ", sn='" + sn + '\'' +
                ", gatewayId=" + gatewayId +
                ", gatewayCode='" + gatewayCode + '\'' +
                ", type=" + type +
                ", status=" + status +
                ", brand='" + brand + '\'' +
                ", remake='" + remake + '\'' +
                ", activeTime=" + activeTime +
                ", offlineTime=" + offlineTime +
                ", port=" + port +
                '}';
    }
}
