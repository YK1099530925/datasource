package datasuorcetwo.datasource.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * 注：不知为何，没有添加 @Column(name = "") 会报没找到字段的错误
 */
@Entity
@Table(name = "device_switch")
public class DeviceSwitch extends BaseEntity implements Serializable{
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
    @Column(name = "mode")
    private String mode;
    @Column(name = "mode2")
    private String mode2;
    @Column(name = "upper_limit")
    private Double upperLimit;
    @Column(name = "lower_limit")
    private Double lowerLimit;
    @Column(name = "outs")
    private String outs;
    @Column(name = "outs2")
    private String outs2;
    @Column(name = "status")
    private Integer status;
    @Column(name = "is_delete")
    private Integer isDelete;
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
    @Column(name = "fixed_parameters")
    private String fixedParameters;
    @Column(name = "fixed_parameters2")
    private String fixedParameters2;
    @Column(name = "device_type_id")
    private Integer deviceTypeId;
    @Column(name = "user_id")
    private Integer userId;
    @Column(name = "device_ip")
    private String deviceIp;
    @Column(name = "switch_status")
    private Long switchStatus;
    @Column(name = "remark")
    private String remark;
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
    @Column(name = "cmd_first_letter")
    private Long cmdFirstLetter;
    @Column(name = "cmd_switch_status")
    private Long cmdSwitchStatus;
    @Column(name = "road")
    private Integer road;
    @Column(name = "linkage_device_id")
    private Integer linkageDeviceId;
    @Column(name = "linkage_device_type_id")
    private Integer linkageDeviceTypeId;
    @Column(name = "linkage_weather")
    private Integer linkageWeather;
    @Column(name = "lower_limit_expect")
    private Double lowerLimitExpect;
    @Column(name = "lower_limit_value")
    private Double lowerLimitValue;
    @Column(name = "upper_limit_expect")
    private Double upperLimitExpect;
    @Column(name = "upper_limit_value")
    private Double upperLimitValue;
    @Column(name = "road2")
    private Integer road2;
    @Column(name = "linkage_weather2")
    private Integer linkageWeather2;
    @Column(name = "linkage_device_id2")
    private Integer linkageDeviceId2;
    @Column(name = "linkage_device_type_id2")
    private Integer linkageDeviceTypeId2;
    @Column(name = "lower_limit_expect2")
    private Double lowerLimitExpect2;
    @Column(name = "lower_limit_value2")
    private Double lowerLimitValue2;
    @Column(name = "upper_limit_expect2")
    private Double upperLimitExpect2;
    @Column(name = "upper_limit_value2")
    private Double upperLimitValue2;

    @Column(name = "cmd_copy")
    private Long cmdCopy;

    @Column(name = "cmd_copy_time")
    private Date cmdCopyTime;

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

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode == null ? null : mode.trim();
    }

    public String getMode2() {
        return mode2;
    }

    public void setMode2(String mode2) {
        this.mode2 = mode2 == null ? null : mode2.trim();
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

    public String getOuts() {
        return outs;
    }

    public void setOuts(String outs) {
        this.outs = outs == null ? null : outs.trim();
    }

    public String getOuts2() {
        return outs2;
    }

    public void setOuts2(String outs2) {
        this.outs2 = outs2 == null ? null : outs2.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
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

    public String getFixedParameters() {
        return fixedParameters;
    }

    public void setFixedParameters(String fixedParameters) {
        this.fixedParameters = fixedParameters == null ? null : fixedParameters.trim();
    }

    public String getFixedParameters2() {
        return fixedParameters2;
    }

    public void setFixedParameters2(String fixedParameters2) {
        this.fixedParameters2 = fixedParameters2 == null ? null : fixedParameters2.trim();
    }

    public Integer getDeviceTypeId() {
        return deviceTypeId;
    }

    public void setDeviceTypeId(Integer deviceTypeId) {
        this.deviceTypeId = deviceTypeId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getDeviceIp() {
        return deviceIp;
    }

    public void setDeviceIp(String deviceIp) {
        this.deviceIp = deviceIp == null ? null : deviceIp.trim();
    }

    public Long getSwitchStatus() {
        return switchStatus;
    }

    public void setSwitchStatus(Long switchStatus) {
        this.switchStatus = switchStatus;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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

    public Long getCmdFirstLetter() {
        return cmdFirstLetter;
    }

    public void setCmdFirstLetter(Long cmdFirstLetter) {
        this.cmdFirstLetter = cmdFirstLetter;
    }

    public Long getCmdSwitchStatus() {
        return cmdSwitchStatus;
    }

    public void setCmdSwitchStatus(Long cmdSwitchStatus) {
        this.cmdSwitchStatus = cmdSwitchStatus;
    }

    public Integer getRoad() {
        return road;
    }

    public void setRoad(Integer road) {
        this.road = road;
    }

    public Integer getLinkageDeviceId() {
        return linkageDeviceId;
    }

    public void setLinkageDeviceId(Integer linkageDeviceId) {
        this.linkageDeviceId = linkageDeviceId;
    }

    public Integer getLinkageDeviceTypeId() {
        return linkageDeviceTypeId;
    }

    public void setLinkageDeviceTypeId(Integer linkageDeviceTypeId) {
        this.linkageDeviceTypeId = linkageDeviceTypeId;
    }

    public Integer getLinkageWeather() {
        return linkageWeather;
    }

    public void setLinkageWeather(Integer linkageWeather) {
        this.linkageWeather = linkageWeather;
    }

    public Double getLowerLimitExpect() {
        return lowerLimitExpect;
    }

    public void setLowerLimitExpect(Double lowerLimitExpect) {
        this.lowerLimitExpect = lowerLimitExpect;
    }

    public Double getLowerLimitValue() {
        return lowerLimitValue;
    }

    public void setLowerLimitValue(Double lowerLimitValue) {
        this.lowerLimitValue = lowerLimitValue;
    }

    public Double getUpperLimitExpect() {
        return upperLimitExpect;
    }

    public void setUpperLimitExpect(Double upperLimitExpect) {
        this.upperLimitExpect = upperLimitExpect;
    }

    public Double getUpperLimitValue() {
        return upperLimitValue;
    }

    public void setUpperLimitValue(Double upperLimitValue) {
        this.upperLimitValue = upperLimitValue;
    }

    public Integer getRoad2() {
        return road2;
    }

    public void setRoad2(Integer road2) {
        this.road2 = road2;
    }

    public Integer getLinkageWeather2() {
        return linkageWeather2;
    }

    public void setLinkageWeather2(Integer linkageWeather2) {
        this.linkageWeather2 = linkageWeather2;
    }

    public Integer getLinkageDeviceId2() {
        return linkageDeviceId2;
    }

    public void setLinkageDeviceId2(Integer linkageDeviceId2) {
        this.linkageDeviceId2 = linkageDeviceId2;
    }

    public Integer getLinkageDeviceTypeId2() {
        return linkageDeviceTypeId2;
    }

    public void setLinkageDeviceTypeId2(Integer linkageDeviceTypeId2) {
        this.linkageDeviceTypeId2 = linkageDeviceTypeId2;
    }

    public Double getLowerLimitExpect2() {
        return lowerLimitExpect2;
    }

    public void setLowerLimitExpect2(Double lowerLimitExpect2) {
        this.lowerLimitExpect2 = lowerLimitExpect2;
    }

    public Double getLowerLimitValue2() {
        return lowerLimitValue2;
    }

    public void setLowerLimitValue2(Double lowerLimitValue2) {
        this.lowerLimitValue2 = lowerLimitValue2;
    }

    public Double getUpperLimitExpect2() {
        return upperLimitExpect2;
    }

    public void setUpperLimitExpect2(Double upperLimitExpect2) {
        this.upperLimitExpect2 = upperLimitExpect2;
    }

    public Double getUpperLimitValue2() {
        return upperLimitValue2;
    }

    public void setUpperLimitValue2(Double upperLimitValue2) {
        this.upperLimitValue2 = upperLimitValue2;
    }

    public Long getCmdCopy() {
        return cmdCopy;
    }

    public void setCmdCopy(Long cmdCopy) {
        this.cmdCopy = cmdCopy;
    }

    public Date getCmdCopyTime() {
        return cmdCopyTime;
    }

    public void setCmdCopyTime(Date cmdCopyTime) {
        this.cmdCopyTime = cmdCopyTime;
    }

    @Override
    public String toString() {
        return "DS{" +
                "id=" + id +
                ", ni='" + deviceNbId + '\'' +
                ", c='" + deviceCode + '\'' +
                ", n='" + name + '\'' +
                ", m='" + mode + '\'' +
                ", m2='" + mode2 + '\'' +
                ", o='" + outs + '\'' +
                ", o2='" + outs2 + '\'' +
                ", ss=" + status +
                ", iD=" + isDelete +
                ", sC=" + statusChangeTime +
                ", fP='" + fixedParameters + '\'' +
                ", fP2='" + fixedParameters2 + '\'' +
                ", dTI=" + deviceTypeId +
                ", sS=" + switchStatus +
                ", gI=" + gatewayId +
                ", gC='" + gatewayCode + '\'' +
                ", cl=" + channel +
                ", aM=" + accessMode +
                ", ml='" + model + '\'' +
                ", on='" + organization + '\'' +
                ", rn='" + region + '\'' +
                ", bh='" + branch + '\'' +
                ", cFL=" + cmdFirstLetter +
                ", cSS=" + cmdSwitchStatus +
                ", road=" + road +
                ", lDId=" + linkageDeviceId +
                ", lDTId=" + linkageDeviceTypeId +
                ", lW=" + linkageWeather +
                ", lLE=" + lowerLimitExpect +
                ", lLV=" + lowerLimitValue +
                ", r2=" + road2 +
                ", lW2=" + linkageWeather2 +
                ", lDI2=" + linkageDeviceId2 +
                ", lDTI2=" + linkageDeviceTypeId2 +
                ", lLE2=" + lowerLimitExpect2 +
                ", lLV2=" + lowerLimitValue2 +
                ", cC=" + cmdCopy +
                ", cCT=" + cmdCopyTime +
                '}';
    }
}
