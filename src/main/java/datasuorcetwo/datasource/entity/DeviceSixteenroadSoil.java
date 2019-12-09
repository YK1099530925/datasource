package datasuorcetwo.datasource.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "device_sixteenroad_soil")
public class DeviceSixteenroadSoil extends BaseEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "idOrGenerate")
    @GenericGenerator(name = "idOrGenerate", strategy = "datasuorcetwo.datasource.entity.IdOrGenerate")
    @Column(name = "Id")
    private Integer id;
    @Column(name = "device_nb_id")
    private String deviceNbId;
    @Column(name = "device_code")
    private String deviceCode;
    @Column(name = "name")
    private String name;
    @Column(name = "address")
    private String address;
    @Column(name = "remake")
    private String remake;
    @Column(name = "status")
    private Integer status;
    @Column(name = "status_change_time")
    private Date statusChangeTime;
    @Column(name = "longitude")
    private Double longitude;
    @Column(name = "latitude")
    private Double latitude;
    @Column(name = "is_delete")
    private Integer isDelete;
    @Column(name = "has_switch")
    private Integer hasSwitch;
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
    @Column(name = "all_road_name")
    private String allRoadName;
    @Column(name = "all_road_status")
    private String allRoadStatus;
    @Column(name = "all_road_humidity_orange")
    private String allRoadHumidityOrange;
    @Column(name = "all_road_humidity_yellow")
    private String allRoadHumidityYellow;
    @Column(name = "all_road_humidity_red")
    private String allRoadHumidityRed;
    @Column(name = "all_road_temperature_orange")
    private String allRoadTemperatureOrange;
    @Column(name = "all_road_temperature_yellow")
    private String allRoadTemperatureYellow;
    @Column(name = "all_road_temperature_red")
    private String allRoadTemperatureRed;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getRemake() {
        return remake;
    }

    public void setRemake(String remake) {
        this.remake = remake == null ? null : remake.trim();
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

    public String getAllRoadName() {
        return allRoadName;
    }

    public void setAllRoadName(String allRoadName) {
        this.allRoadName = allRoadName == null ? null : allRoadName.trim();
    }

    public String getAllRoadStatus() {
        return allRoadStatus;
    }

    public void setAllRoadStatus(String allRoadStatus) {
        this.allRoadStatus = allRoadStatus == null ? null : allRoadStatus.trim();
    }

    public String getAllRoadHumidityOrange() {
        return allRoadHumidityOrange;
    }

    public void setAllRoadHumidityOrange(String allRoadHumidityOrange) {
        this.allRoadHumidityOrange = allRoadHumidityOrange == null ? null : allRoadHumidityOrange.trim();
    }

    public String getAllRoadHumidityYellow() {
        return allRoadHumidityYellow;
    }

    public void setAllRoadHumidityYellow(String allRoadHumidityYellow) {
        this.allRoadHumidityYellow = allRoadHumidityYellow == null ? null : allRoadHumidityYellow.trim();
    }

    public String getAllRoadHumidityRed() {
        return allRoadHumidityRed;
    }

    public void setAllRoadHumidityRed(String allRoadHumidityRed) {
        this.allRoadHumidityRed = allRoadHumidityRed == null ? null : allRoadHumidityRed.trim();
    }

    public String getAllRoadTemperatureOrange() {
        return allRoadTemperatureOrange;
    }

    public void setAllRoadTemperatureOrange(String allRoadTemperatureOrange) {
        this.allRoadTemperatureOrange = allRoadTemperatureOrange == null ? null : allRoadTemperatureOrange.trim();
    }

    public String getAllRoadTemperatureYellow() {
        return allRoadTemperatureYellow;
    }

    public void setAllRoadTemperatureYellow(String allRoadTemperatureYellow) {
        this.allRoadTemperatureYellow = allRoadTemperatureYellow == null ? null : allRoadTemperatureYellow.trim();
    }

    public String getAllRoadTemperatureRed() {
        return allRoadTemperatureRed;
    }

    public void setAllRoadTemperatureRed(String allRoadTemperatureRed) {
        this.allRoadTemperatureRed = allRoadTemperatureRed == null ? null : allRoadTemperatureRed.trim();
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
        return "DeviceSixteenroadSoil{" +
                "id=" + id +
                ", nbId='" + deviceNbId + '\'' +
                ", deviceCode='" + deviceCode + '\'' +
                ", name='" + name + '\'' +
                ", status=" + status +
                ", statusChangeTime=" + statusChangeTime +
                ", isDelete=" + isDelete +
                ", gatewayCode='" + gatewayCode + '\'' +
                ", channel=" + channel +
                ", accessMode=" + accessMode +
                ", allRoadName='" + allRoadName + '\'' +
                ", allRoadStatus='" + allRoadStatus + '\'' +
                '}';
    }
}
