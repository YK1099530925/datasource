package datasuorcetwo.datasource.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "device_video")
public class DeviceVideo extends BaseEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "idOrGenerate")
    @GenericGenerator(name = "idOrGenerate", strategy = "datasuorcetwo.datasource.entity.IdOrGenerate")
    @Column(name = "Id")
    private Integer id;
    @Column(name = "device_code")
    private String deviceCode;
    @Column(name = "address")
    private String address;
    @Column(name = "name")
    private String name;
    @Column(name = "remark")
    private String remark;
    @Column(name = "status")
    private Integer status;
    @Column(name = "password")
    private String password;
    @Column(name = "status_change_time")
    private Date statusChangeTime;
    @Column(name = "fixed_parameters")
    private String fixedParameters;
    @Column(name = "interval_time")
    private Integer intervalTime;
    @Column(name = "longitude")
    private Double longitude;
    @Column(name = "latitude")
    private Double latitude;
    @Column(name = "transfer_rate")
    private Double transferRate;
    @Column(name = "image_path")
    private String imagePath;
    @Column(name = "first_letter")
    private String firstLetter;
    @Column(name = "is_delete")
    private Integer isDelete;
    @Column(name = "has_switch")
    private Integer hasSwitch;
    @Column(name = "is_ptz_control")
    private Integer isPtzControl;
    @Column(name = "device_type_id")
    private Integer deviceTypeId;
    @Column(name = "live_url")
    private String liveUrl;
    @Column(name = "ezopen_url")
    private String ezopenUrl;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDeviceCode() {
        return deviceCode;
    }

    public void setDeviceCode(String deviceCode) {
        this.deviceCode = deviceCode == null ? null : deviceCode.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Date getStatusChangeTime() {
        return statusChangeTime;
    }

    public void setStatusChangeTime(Date statusChangeTime) {
        this.statusChangeTime = statusChangeTime;
    }

    public String getFixedParameters() {
        return fixedParameters;
    }

    public void setFixedParameters(String fixedParameters) {
        this.fixedParameters = fixedParameters == null ? null : fixedParameters.trim();
    }

    public Integer getIntervalTime() {
        return intervalTime;
    }

    public void setIntervalTime(Integer intervalTime) {
        this.intervalTime = intervalTime;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getTransferRate() {
        return transferRate;
    }

    public void setTransferRate(Double transferRate) {
        this.transferRate = transferRate;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath == null ? null : imagePath.trim();
    }

    public String getFirstLetter() {
        return firstLetter;
    }

    public void setFirstLetter(String firstLetter) {
        this.firstLetter = firstLetter == null ? null : firstLetter.trim();
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public Integer getHasSwitch() {
        return hasSwitch;
    }

    public void setHasSwitch(Integer hasSwitch) {
        this.hasSwitch = hasSwitch;
    }

    public Integer getIsPtzControl() {
        return isPtzControl;
    }

    public void setIsPtzControl(Integer isPtzControl) {
        this.isPtzControl = isPtzControl;
    }

    public Integer getDeviceTypeId() {
        return deviceTypeId;
    }

    public void setDeviceTypeId(Integer deviceTypeId) {
        this.deviceTypeId = deviceTypeId;
    }

    public String getLiveUrl() {
        return liveUrl;
    }

    public void setLiveUrl(String liveUrl) {
        this.liveUrl = liveUrl == null ? null : liveUrl.trim();
    }

    public String getEzopenUrl() {
        return ezopenUrl;
    }

    public void setEzopenUrl(String ezopenUrl) {
        this.ezopenUrl = ezopenUrl == null ? null : ezopenUrl.trim();
    }

    @Override
    public String toString() {
        return "DeviceVideo{" +
                "id=" + id +
                ", deviceCode='" + deviceCode + '\'' +
                ", address='" + address + '\'' +
                ", name='" + name + '\'' +
                ", isDelete=" + isDelete +
                ", hasSwitch=" + hasSwitch +
                ", liveUrl='" + liveUrl + '\'' +
                ", ezopenUrl='" + ezopenUrl + '\'' +
                '}';
    }
}
