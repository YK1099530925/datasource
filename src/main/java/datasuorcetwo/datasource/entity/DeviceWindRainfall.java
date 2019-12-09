package datasuorcetwo.datasource.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "device_wind_rainfall")
public class DeviceWindRainfall extends BaseEntity implements Serializable {
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
    @Column(name = "temp_error")
    private Double tempError;
    @Column(name = "fixed_parameters")
    private String fixedParameters;
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
    @Column(name = "is_delete")
    private Integer isDelete;
    @Column(name = "has_switch")
    private Integer hasSwitch;
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
    @Column(name = "wind_upper_limit")
    private Double windUpperLimit;
    @Column(name = "wind_lower_limit")
    private Double windLowerLimit;
    @Column(name = "wind_alarm_value_yellow")
    private Double windAlarmValueYellow;
    @Column(name = "wind_alarm_value_orange")
    private Double windAlarmValueOrange;
    @Column(name = "wind_alarm_value_red")
    private Double windAlarmValueRed;
    @Column(name = "humidity_uplimit")
    private Double humidityUplimit;
    @Column(name = "humidity_lowlimit")
    private Double humidityLowlimit;
    @Column(name = "humidity_red")
    private Double humidityRed;
    @Column(name = "humidity_yellow")
    private Double humidityYellow;
    @Column(name = "humidity_orange")
    private Double humidityOrange;
    @Column(name = "temperature_uplimit")
    private Double temperatureUplimit;
    @Column(name = "temperature_lowlimit")
    private Double temperatureLowlimit;
    @Column(name = "temperature_red")
    private Double temperatureRed;
    @Column(name = "temperature_orange")
    private Double temperatureOrange;
    @Column(name = "temperature_yellow")
    private Double temperatureYellow;
    @Column(name = "light_uplimit")
    private Double lightUplimit;
    @Column(name = "light_lowlimit")
    private Double lightLowlimit;
    @Column(name = "light_red")
    private Double lightRed;
    @Column(name = "light_orange")
    private Double lightOrange;
    @Column(name = "light_yellow")
    private Double lightYellow;
    @Column(name = "rain_uplimit")
    private Double rainUplimit;
    @Column(name = "rain_lowlimit")
    private Double rainLowlimit;
    @Column(name = "rain_red")
    private Double rainRed;
    @Column(name = "rain_yellow")
    private Double rainYellow;
    @Column(name = "rain_orange")
    private Double rainOrange;
    @Column(name = "battery_lowlimit")
    private Double batteryLowlimit;
    @Column(name = "battery_uplimit")
    private Double batteryUplimit;
    @Column(name = "battery_red")
    private Double batteryRed;
    @Column(name = "battery_orange")
    private Double batteryOrange;
    @Column(name = "battery_yellow")
    private Double batteryYellow;
    @Column(name = "pressure_uplimit")
    private Double pressureUplimit;
    @Column(name = "pressure_lowlimit")
    private Double pressureLowlimit;
    @Column(name = "pressure_red")
    private Double pressureRed;
    @Column(name = "pressure_orange")
    private Double pressureOrange;
    @Column(name = "pressure_yellow")
    private Double pressureYellow;

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
        this.deviceNbId = deviceNbId;
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

    public Double getTempError() {
        return tempError;
    }

    public void setTempError(Double tempError) {
        this.tempError = tempError;
    }

    public String getFixedParameters() {
        return fixedParameters;
    }

    public void setFixedParameters(String fixedParameters) {
        this.fixedParameters = fixedParameters == null ? null : fixedParameters.trim();
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

    public Double getWindUpperLimit() {
        return windUpperLimit;
    }

    public void setWindUpperLimit(Double windUpperLimit) {
        this.windUpperLimit = windUpperLimit;
    }

    public Double getWindLowerLimit() {
        return windLowerLimit;
    }

    public void setWindLowerLimit(Double windLowerLimit) {
        this.windLowerLimit = windLowerLimit;
    }

    public Double getWindAlarmValueYellow() {
        return windAlarmValueYellow;
    }

    public void setWindAlarmValueYellow(Double windAlarmValueYellow) {
        this.windAlarmValueYellow = windAlarmValueYellow;
    }

    public Double getWindAlarmValueOrange() {
        return windAlarmValueOrange;
    }

    public void setWindAlarmValueOrange(Double windAlarmValueOrange) {
        this.windAlarmValueOrange = windAlarmValueOrange;
    }

    public Double getWindAlarmValueRed() {
        return windAlarmValueRed;
    }

    public void setWindAlarmValueRed(Double windAlarmValueRed) {
        this.windAlarmValueRed = windAlarmValueRed;
    }

    public Double getHumidityUplimit() {
        return humidityUplimit;
    }

    public void setHumidityUplimit(Double humidityUplimit) {
        this.humidityUplimit = humidityUplimit;
    }

    public Double getHumidityLowlimit() {
        return humidityLowlimit;
    }

    public void setHumidityLowlimit(Double humidityLowlimit) {
        this.humidityLowlimit = humidityLowlimit;
    }

    public Double getHumidityRed() {
        return humidityRed;
    }

    public void setHumidityRed(Double humidityRed) {
        this.humidityRed = humidityRed;
    }

    public Double getHumidityYellow() {
        return humidityYellow;
    }

    public void setHumidityYellow(Double humidityYellow) {
        this.humidityYellow = humidityYellow;
    }

    public Double getHumidityOrange() {
        return humidityOrange;
    }

    public void setHumidityOrange(Double humidityOrange) {
        this.humidityOrange = humidityOrange;
    }

    public Double getTemperatureUplimit() {
        return temperatureUplimit;
    }

    public void setTemperatureUplimit(Double temperatureUplimit) {
        this.temperatureUplimit = temperatureUplimit;
    }

    public Double getTemperatureLowlimit() {
        return temperatureLowlimit;
    }

    public void setTemperatureLowlimit(Double temperatureLowlimit) {
        this.temperatureLowlimit = temperatureLowlimit;
    }

    public Double getTemperatureRed() {
        return temperatureRed;
    }

    public void setTemperatureRed(Double temperatureRed) {
        this.temperatureRed = temperatureRed;
    }

    public Double getTemperatureOrange() {
        return temperatureOrange;
    }

    public void setTemperatureOrange(Double temperatureOrange) {
        this.temperatureOrange = temperatureOrange;
    }

    public Double getTemperatureYellow() {
        return temperatureYellow;
    }

    public void setTemperatureYellow(Double temperatureYellow) {
        this.temperatureYellow = temperatureYellow;
    }

    public Double getLightUplimit() {
        return lightUplimit;
    }

    public void setLightUplimit(Double lightUplimit) {
        this.lightUplimit = lightUplimit;
    }

    public Double getLightLowlimit() {
        return lightLowlimit;
    }

    public void setLightLowlimit(Double lightLowlimit) {
        this.lightLowlimit = lightLowlimit;
    }

    public Double getLightRed() {
        return lightRed;
    }

    public void setLightRed(Double lightRed) {
        this.lightRed = lightRed;
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

    public Double getRainUplimit() {
        return rainUplimit;
    }

    public void setRainUplimit(Double rainUplimit) {
        this.rainUplimit = rainUplimit;
    }

    public Double getRainLowlimit() {
        return rainLowlimit;
    }

    public void setRainLowlimit(Double rainLowlimit) {
        this.rainLowlimit = rainLowlimit;
    }

    public Double getRainRed() {
        return rainRed;
    }

    public void setRainRed(Double rainRed) {
        this.rainRed = rainRed;
    }

    public Double getRainYellow() {
        return rainYellow;
    }

    public void setRainYellow(Double rainYellow) {
        this.rainYellow = rainYellow;
    }

    public Double getRainOrange() {
        return rainOrange;
    }

    public void setRainOrange(Double rainOrange) {
        this.rainOrange = rainOrange;
    }

    public Double getBatteryLowlimit() {
        return batteryLowlimit;
    }

    public void setBatteryLowlimit(Double batteryLowlimit) {
        this.batteryLowlimit = batteryLowlimit;
    }

    public Double getBatteryUplimit() {
        return batteryUplimit;
    }

    public void setBatteryUplimit(Double batteryUplimit) {
        this.batteryUplimit = batteryUplimit;
    }

    public Double getBatteryRed() {
        return batteryRed;
    }

    public void setBatteryRed(Double batteryRed) {
        this.batteryRed = batteryRed;
    }

    public Double getBatteryOrange() {
        return batteryOrange;
    }

    public void setBatteryOrange(Double batteryOrange) {
        this.batteryOrange = batteryOrange;
    }

    public Double getBatteryYellow() {
        return batteryYellow;
    }

    public void setBatteryYellow(Double batteryYellow) {
        this.batteryYellow = batteryYellow;
    }

    public Double getPressureUplimit() {
        return pressureUplimit;
    }

    public void setPressureUplimit(Double pressureUplimit) {
        this.pressureUplimit = pressureUplimit;
    }

    public Double getPressureLowlimit() {
        return pressureLowlimit;
    }

    public void setPressureLowlimit(Double pressureLowlimit) {
        this.pressureLowlimit = pressureLowlimit;
    }

    public Double getPressureRed() {
        return pressureRed;
    }

    public void setPressureRed(Double pressureRed) {
        this.pressureRed = pressureRed;
    }

    public Double getPressureOrange() {
        return pressureOrange;
    }

    public void setPressureOrange(Double pressureOrange) {
        this.pressureOrange = pressureOrange;
    }

    public Double getPressureYellow() {
        return pressureYellow;
    }

    public void setPressureYellow(Double pressureYellow) {
        this.pressureYellow = pressureYellow;
    }

    @Override
    public String toString() {
        return "DeviceWindRainfall{" +
                "id=" + id +
                ", deviceNbId='" + deviceNbId + '\'' +
                ", deviceCode='" + deviceCode + '\'' +
                ", name='" + name + '\'' +
                ", status=" + status +
                ", statusChangeTime=" + statusChangeTime +
                ", isDelete=" + isDelete +
                ", hasSwitch=" + hasSwitch +
                ", deviceTypeId=" + deviceTypeId +
                ", gatewayId=" + gatewayId +
                ", gatewayCode='" + gatewayCode + '\'' +
                ", channel=" + channel +
                ", accessMode=" + accessMode +
                '}';
    }
}
