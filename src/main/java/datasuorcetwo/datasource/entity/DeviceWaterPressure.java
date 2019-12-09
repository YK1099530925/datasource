package datasuorcetwo.datasource.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "device_water_pressure")
public class DeviceWaterPressure  extends BaseEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "idOrGenerate")
    @GenericGenerator(name = "idOrGenerate", strategy = "datasuorcetwo.datasource.entity.IdOrGenerate")
    @Column(name = "Id")
    private Integer id;
    @Column(name = "device_nb_id")
    private String deviceNbId;
    @Column(name = "device_code")
    private String deviceCode;
    @Column(name = "address")
    private String address;
    @Column(name = "name")
    private String name;
    @Column(name = "remark")
    private String remark;
    @Column(name = "upper_limit")
    private Double upperLimit;
    @Column(name = "lower_limit")
    private Double lowerLimit;
    @Column(name = "waterpressure_yellow")
    private Double waterpressureYellow;
    @Column(name = "waterpressure_orange")
    private Double waterpressureOrange;
    @Column(name = "waterpressure_red")
    private Double waterpressureRed;
    @Column(name = "voltage_yellow")
    private Double voltageYellow;
    @Column(name = "voltage_orange")
    private Double voltageOrange;
    @Column(name = "voltage_red")
    private Double voltageRed;
    @Column(name = "status")
    private Integer status;
    @Column(name = "status_change_time")
    private Date statusChangeTime;
    @Column(name = "interval_time")
    private Integer intervalTime;
    @Column(name = "longitude")
    private Double longitude;
    @Column(name = "latitude")
    private Double latitude;
    @Column(name = "image_path")
    private String imagePath;
    @Column(name = "first_letter")
    private String firstLetter;
    @Column(name = "rate")
    private String rate;
    @Column(name = "alarmStatus")
    private String alarmstatus;
    @Column(name = "picture")
    private String picture;
    @Column(name = "is_delete")
    private Integer isDelete;
    @Column(name = "has_switch")
    private Integer hasSwitch;
    @Column(name = "fixed_parameters")
    private String fixedParameters;
    @Column(name = "switch_status")
    private Integer switchStatus;
    @Column(name = "switch_status_change_time")
    private Date switchStatusChangeTime;
    @Column(name = "device_type_id")
    private Integer deviceTypeId;
    @Column(name = "gateway_id")
    private Integer gatewayId;
    @Column(name = "gateway_name")
    private String gatewayName;
    @Column(name = "gateway_code")
    private String gatewayCode;
    @Column(name = "channel")
    private Integer channel;
    @Column(name = "access_mode")
    private Byte accessMode;
    @Column(name = "brand")
    private String brand;
    @Column(name = "model")
    private String model;
    @Column(name = "firmware")
    private String firmware;
    @Column(name = "organization")
    private String organization;
    @Column(name = "region")
    private String region;
    @Column(name = "branch")
    private String branch;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDeviceNbId() {
        return deviceNbId;
    }

    public void setDeviceNbId(String deviceNbId) {
        this.deviceNbId = deviceNbId == null ? null : deviceNbId.trim();
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

    public Double getUpperLimit() {
        return upperLimit;
    }

    public void setUpperLimit(Double upperLimit) {
        this.upperLimit = upperLimit;
    }

    public Double getLowerLimit() {
        return lowerLimit;
    }

    public void setLowerLimit(Double lowerLimit) {
        this.lowerLimit = lowerLimit;
    }

    public Double getWaterpressureYellow() {
        return waterpressureYellow;
    }

    public void setWaterpressureYellow(Double waterpressureYellow) {
        this.waterpressureYellow = waterpressureYellow;
    }

    public Double getWaterpressureOrange() {
        return waterpressureOrange;
    }

    public void setWaterpressureOrange(Double waterpressureOrange) {
        this.waterpressureOrange = waterpressureOrange;
    }

    public Double getWaterpressureRed() {
        return waterpressureRed;
    }

    public void setWaterpressureRed(Double waterpressureRed) {
        this.waterpressureRed = waterpressureRed;
    }

    public Double getVoltageYellow() {
        return voltageYellow;
    }

    public void setVoltageYellow(Double voltageYellow) {
        this.voltageYellow = voltageYellow;
    }

    public Double getVoltageOrange() {
        return voltageOrange;
    }

    public void setVoltageOrange(Double voltageOrange) {
        this.voltageOrange = voltageOrange;
    }

    public Double getVoltageRed() {
        return voltageRed;
    }

    public void setVoltageRed(Double voltageRed) {
        this.voltageRed = voltageRed;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getStatusChangeTime() {
        return statusChangeTime;
    }

    public void setStatusChangeTime(Date statusChangeTime) {
        this.statusChangeTime = statusChangeTime;
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

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate == null ? null : rate.trim();
    }

    public String getAlarmstatus() {
        return alarmstatus;
    }

    public void setAlarmstatus(String alarmstatus) {
        this.alarmstatus = alarmstatus == null ? null : alarmstatus.trim();
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
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

    public String getFixedParameters() {
        return fixedParameters;
    }

    public void setFixedParameters(String fixedParameters) {
        this.fixedParameters = fixedParameters == null ? null : fixedParameters.trim();
    }

    public Integer getSwitchStatus() {
        return switchStatus;
    }

    public void setSwitchStatus(Integer switchStatus) {
        this.switchStatus = switchStatus;
    }

    public Date getSwitchStatusChangeTime() {
        return switchStatusChangeTime;
    }

    public void setSwitchStatusChangeTime(Date switchStatusChangeTime) {
        this.switchStatusChangeTime = switchStatusChangeTime;
    }

    public Integer getDeviceTypeId() {
        return deviceTypeId;
    }

    public void setDeviceTypeId(Integer deviceTypeId) {
        this.deviceTypeId = deviceTypeId;
    }

    public Integer getGatewayId() {
        return gatewayId;
    }

    public void setGatewayId(Integer gatewayId) {
        this.gatewayId = gatewayId;
    }

    public String getGatewayName() {
        return gatewayName;
    }

    public void setGatewayName(String gatewayName) {
        this.gatewayName = gatewayName == null ? null : gatewayName.trim();
    }

    public String getGatewayCode() {
        return gatewayCode;
    }

    public void setGatewayCode(String gatewayCode) {
        this.gatewayCode = gatewayCode == null ? null : gatewayCode.trim();
    }

    public Integer getChannel() {
        return channel;
    }

    public void setChannel(Integer channel) {
        this.channel = channel;
    }

    public Byte getAccessMode() {
        return accessMode;
    }

    public void setAccessMode(Byte accessMode) {
        this.accessMode = accessMode;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand == null ? null : brand.trim();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model == null ? null : model.trim();
    }

    public String getFirmware() {
        return firmware;
    }

    public void setFirmware(String firmware) {
        this.firmware = firmware == null ? null : firmware.trim();
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization == null ? null : organization.trim();
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region == null ? null : region.trim();
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch == null ? null : branch.trim();
    }

    @Override
    public String toString() {
        return "DeviceWaterPressure{" +
                "id=" + id +
                ", deviceNbId='" + deviceNbId + '\'' +
                ", deviceCode='" + deviceCode + '\'' +
                ", name='" + name + '\'' +
                ", status=" + status +
                ", statusChangeTime=" + statusChangeTime +
                ", isDelete=" + isDelete +
                ", deviceTypeId=" + deviceTypeId +
                ", gatewayCode='" + gatewayCode + '\'' +
                ", channel=" + channel +
                ", accessMode=" + accessMode +
                '}';
    }
}
