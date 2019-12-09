package datasuorcetwo.datasource.entity;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "nb_command")
public class NbCommand extends BaseEntity implements Serializable {
    @Id
    @Column(name = "command_id")
    private String commandId;
    @Column(name = "device_nb_id")
    private String deviceNbId;
    @Column(name = "para_dvc_type")
    private Integer paraDvcType;
    @Column(name = "para_cmd")
    private Integer paraCmd;
    @Column(name = "resp_para_cmd_rcvd")
    private Integer respParaCmdRcvd;
    @Column(name = "resp_para_response")
    private Integer respParaResponse;
    @Column(name = "resp_para_dvc_type")
    private Integer respParaDvcType;
    @Column(name = "resp_error_code")
    private Integer respErrorCode;
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
    @Column(name = "retry_times")
    private Date retryTimes;
    @Column(name = "command_id_2nd")
    private Date commandId2nd;
    @Column(name = "command_id_3nd")
    private Date commandId3nd;

    public String getCommandId() {
        return commandId;
    }

    public void setCommandId(String commandId) {
        this.commandId = commandId == null ? null : commandId.trim();
    }

    public String getDeviceNbId() {
        return deviceNbId;
    }

    public void setDeviceNbId(String deviceNbId) {
        this.deviceNbId = deviceNbId == null ? null : deviceNbId.trim();
    }

    public Integer getParaDvcType() {
        return paraDvcType;
    }

    public void setParaDvcType(Integer paraDvcType) {
        this.paraDvcType = paraDvcType;
    }

    public Integer getParaCmd() {
        return paraCmd;
    }

    public void setParaCmd(Integer paraCmd) {
        this.paraCmd = paraCmd;
    }

    public Integer getRespParaCmdRcvd() {
        return respParaCmdRcvd;
    }

    public void setRespParaCmdRcvd(Integer respParaCmdRcvd) {
        this.respParaCmdRcvd = respParaCmdRcvd;
    }

    public Integer getRespParaResponse() {
        return respParaResponse;
    }

    public void setRespParaResponse(Integer respParaResponse) {
        this.respParaResponse = respParaResponse;
    }

    public Integer getRespParaDvcType() {
        return respParaDvcType;
    }

    public void setRespParaDvcType(Integer respParaDvcType) {
        this.respParaDvcType = respParaDvcType;
    }

    public Integer getRespErrorCode() {
        return respErrorCode;
    }

    public void setRespErrorCode(Integer respErrorCode) {
        this.respErrorCode = respErrorCode;
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
        this.status = status == null ? null : status.trim();
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

    public Date getCommandId2nd() {
        return commandId2nd;
    }

    public void setCommandId2nd(Date commandId2nd) {
        this.commandId2nd = commandId2nd;
    }

    public Date getRetryTimes() {
        return retryTimes;
    }

    public void setRetryTimes(Date retryTimes) {
        this.retryTimes = retryTimes;
    }

    public Date getCommandId3nd() {
        return commandId3nd;
    }

    public void setCommandId3nd(Date commandId3nd) {
        this.commandId3nd = commandId3nd;
    }

    @Override
    public String toString() {
        return "NbCommand{" +
                "commandId='" + commandId + '\'' +
                ", deviceNbId='" + deviceNbId + '\'' +
                ", paraDvcType=" + paraDvcType +
                ", paraCmd=" + paraCmd +
                ", respParaCmdRcvd=" + respParaCmdRcvd +
                ", respParaResponse=" + respParaResponse +
                ", respParaDvcType=" + respParaDvcType +
                ", respErrorCode=" + respErrorCode +
                ", createTime=" + createTime +
                ", deliverTime=" + deliverTime +
                ", successTime=" + successTime +
                ", status='" + status + '\'' +
                ", timeoutTime=" + timeoutTime +
                ", statusTime=" + statusTime +
                '}';
    }
}
