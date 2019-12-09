package datasuorcetwo.datasource.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "device_air_soil_light")
public class DeviceAirSoilLight extends BaseEntity implements Serializable {
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
    @Column(name = "alarm_value_yellow")
    private Double alarmValueYellow;
    @Column(name = "alarm_value_orange")
    private Double alarmValueOrange;
    @Column(name = "alarm_value_red")
    private Double alarmValueRed;
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
    @Column(name = "air_temperature_orange")
    private Double airTemperatureOrange;
    @Column(name = "air_temperature_yellow")
    private Double airTemperatureYellow;
    @Column(name = "air_temperature_red")
    private Double airTemperatureRed;
    @Column(name = "air_humidity_orange")
    private Double airHumidityOrange;
    @Column(name = "air_humidity_yellow")
    private Double airHumidityYellow;
    @Column(name = "air_humidity_red")
    private Double airHumidityRed;
    @Column(name = "soil_temperature_orange")
    private Double soilTemperatureOrange;
    @Column(name = "soil_temperature_yellow")
    private Double soilTemperatureYellow;
    @Column(name = "soil_temperature_red")
    private Double soilTemperatureRed;
    @Column(name = "soil_humidity_orange")
    private Double soilHumidityOrange;
    @Column(name = "soil_humidity_yellow")
    private Double soilHumidityYellow;
    @Column(name = "soil_humidity_red")
    private Double soilHumidityRed;
    @Column(name = "light_orange")
    private Double lightOrange;
    @Column(name = "light_yellow")
    private Double lightYellow;
    @Column(name = "light_red")
    private Double lightRed;
    @Column(name = "remark")
    private String remark;
    @Column(name = "version")
    private Integer version;
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

    public Double getAlarmValueYellow() {
        return alarmValueYellow;
    }

    public void setAlarmValueYellow(Double alarmValueYellow) {
        this.alarmValueYellow = alarmValueYellow;
    }

    public Double getAlarmValueOrange() {
        return alarmValueOrange;
    }

    public void setAlarmValueOrange(Double alarmValueOrange) {
        this.alarmValueOrange = alarmValueOrange;
    }

    public Double getAlarmValueRed() {
        return alarmValueRed;
    }

    public void setAlarmValueRed(Double alarmValueRed) {
        this.alarmValueRed = alarmValueRed;
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

    public Double getAirTemperatureOrange() {
        return airTemperatureOrange;
    }

    public void setAirTemperatureOrange(Double airTemperatureOrange) {
        this.airTemperatureOrange = airTemperatureOrange;
    }

    public Double getAirTemperatureYellow() {
        return airTemperatureYellow;
    }

    public void setAirTemperatureYellow(Double airTemperatureYellow) {
        this.airTemperatureYellow = airTemperatureYellow;
    }

    public Double getAirTemperatureRed() {
        return airTemperatureRed;
    }

    public void setAirTemperatureRed(Double airTemperatureRed) {
        this.airTemperatureRed = airTemperatureRed;
    }

    public Double getAirHumidityOrange() {
        return airHumidityOrange;
    }

    public void setAirHumidityOrange(Double airHumidityOrange) {
        this.airHumidityOrange = airHumidityOrange;
    }

    public Double getAirHumidityYellow() {
        return airHumidityYellow;
    }

    public void setAirHumidityYellow(Double airHumidityYellow) {
        this.airHumidityYellow = airHumidityYellow;
    }

    public Double getAirHumidityRed() {
        return airHumidityRed;
    }

    public void setAirHumidityRed(Double airHumidityRed) {
        this.airHumidityRed = airHumidityRed;
    }

    public Double getSoilTemperatureOrange() {
        return soilTemperatureOrange;
    }

    public void setSoilTemperatureOrange(Double soilTemperatureOrange) {
        this.soilTemperatureOrange = soilTemperatureOrange;
    }

    public Double getSoilTemperatureYellow() {
        return soilTemperatureYellow;
    }

    public void setSoilTemperatureYellow(Double soilTemperatureYellow) {
        this.soilTemperatureYellow = soilTemperatureYellow;
    }

    public Double getSoilTemperatureRed() {
        return soilTemperatureRed;
    }

    public void setSoilTemperatureRed(Double soilTemperatureRed) {
        this.soilTemperatureRed = soilTemperatureRed;
    }

    public Double getSoilHumidityOrange() {
        return soilHumidityOrange;
    }

    public void setSoilHumidityOrange(Double soilHumidityOrange) {
        this.soilHumidityOrange = soilHumidityOrange;
    }

    public Double getSoilHumidityYellow() {
        return soilHumidityYellow;
    }

    public void setSoilHumidityYellow(Double soilHumidityYellow) {
        this.soilHumidityYellow = soilHumidityYellow;
    }

    public Double getSoilHumidityRed() {
        return soilHumidityRed;
    }

    public void setSoilHumidityRed(Double soilHumidityRed) {
        this.soilHumidityRed = soilHumidityRed;
    }

    public Double getLightOrange() {
        return lightOrange;
    }

    public void setLightOrange(Double lightOrange) {
        this.lightOrange = lightOrange;
    }

    public Double getLightYellow() {
        return lightYellow;
    }

    public void setLightYellow(Double lightYellow) {
        this.lightYellow = lightYellow;
    }

    public Double getLightRed() {
        return lightRed;
    }

    public void setLightRed(Double lightRed) {
        this.lightRed = lightRed;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "DeviceAirSoilLight{" +
                "id=" + id +
                ", deviceNbId='" + deviceNbId + '\'' +
                ", deviceCode='" + deviceCode + '\'' +
                ", name='" + name + '\'' +
                ", status=" + status +
                ", statusChangeTime=" + statusChangeTime +
                ", isDelete=" + isDelete +
                ", gatewayCode='" + gatewayCode + '\'' +
                ", channel=" + channel +
                ", accessMode=" + accessMode +
                ", remark='" + remark + '\'' +
                ", version=" + version +
                '}';
    }
}
