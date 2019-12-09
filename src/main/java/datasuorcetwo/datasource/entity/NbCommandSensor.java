package datasuorcetwo.datasource.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "nb_command_sensor")
public class NbCommandSensor extends BaseEntity implements Serializable {
    @Id
    @Column(name = "command_id")
    private String commandId;
    @Column(name = "device_nb_id")
    private String deviceNbId;
    @Column(name = "para_receive_ok")
    private Integer paraReceiveOk;
    @Column(name = "create_time")
    private Date createTime;
    @Column(name = "deliver_time")
    private Date deliverTime;
    @Column(name = "success_time")
    private Date successTime;
    @Column(name = "status")
    private String status;
    @Column(name = "timeout_time")
    private Date timeoutTime;
    @Column(name = "status_time")
    private Date statusTime;
    @Column(name = "para_dvc_type")
    private Integer paraDvcType;

    public String getCommandId() {
        return commandId;
    }

    public void setCommandId(String commandId) {
        this.commandId = commandId;
    }

    public String getDeviceNbId() {
        return deviceNbId;
    }

    public void setDeviceNbId(String deviceNbId) {
        this.deviceNbId = deviceNbId;
    }

    public Integer getParaReceiveOk() {
        return paraReceiveOk;
    }

    public void setParaReceiveOk(Integer paraReceiveOk) {
        this.paraReceiveOk = paraReceiveOk;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getDeliverTime() {
        return deliverTime;
    }

    public void setDeliverTime(Date deliverTime) {
        this.deliverTime = deliverTime;
    }

    public Date getSuccessTime() {
        return successTime;
    }

    public void setSuccessTime(Date successTime) {
        this.successTime = successTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getTimeoutTime() {
        return timeoutTime;
    }

    public void setTimeoutTime(Date timeoutTime) {
        this.timeoutTime = timeoutTime;
    }

    public Date getStatusTime() {
        return statusTime;
    }

    public void setStatusTime(Date statusTime) {
        this.statusTime = statusTime;
    }

    public Integer getParaDvcType() {
        return paraDvcType;
    }

    public void setParaDvcType(Integer paraDvcType) {
        this.paraDvcType = paraDvcType;
    }

    @Override
    public String toString() {
        return "NbCommandSensor{" +
                "commandId='" + commandId + '\'' +
                ", deviceNbId='" + deviceNbId + '\'' +
                ", paraReceiveOk=" + paraReceiveOk +
                ", createTime=" + createTime +
                ", deliverTime=" + deliverTime +
                ", successTime=" + successTime +
                ", status='" + status + '\'' +
                ", timeoutTime=" + timeoutTime +
                ", statusTime=" + statusTime +
                ", paraDvcType=" + paraDvcType +
                '}';
    }
}
