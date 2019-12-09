package datasuorcetwo.datasource.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "data_wind_rainfall")
public class DataWindRainfall extends BaseEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "idOrGenerate")
    @GenericGenerator(name = "idOrGenerate", strategy = "datasuorcetwo.datasource.entity.IdOrGenerate")
    @Column(name = "Id")
    private Integer id;
    @Column(name = "create_time")
    private Date createTime;
    @Column(name = "speed_value")
    private Double speedValue;
    @Column(name = "wind_value")
    private String windValue;
    @Column(name = "rainfall_vale")
    private Double rainfallVale;
    @Column(name = "battery_value")
    private Double batteryValue;
    @Column(name = "temperature_value")
    private String temperatureValue;
    @Column(name = "humidity_value")
    private Double humidityValue;
    @Column(name = "light_value")
    private Double lightValue;
    @Column(name = "pressure_value")
    private Double pressureValue;
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

    public Double getSpeedValue() {
        return speedValue;
    }

    public void setSpeedValue(Double speedValue) {
        this.speedValue = speedValue;
    }

    public String getWindValue() {
        return windValue;
    }

    public void setWindValue(String windValue) {
        this.windValue = windValue == null ? null : windValue.trim();
    }

    public Double getRainfallVale() {
        return rainfallVale;
    }

    public void setRainfallVale(Double rainfallVale) {
        this.rainfallVale = rainfallVale;
    }

    public Double getBatteryValue() {
        return batteryValue;
    }

    public void setBatteryValue(Double batteryValue) {
        this.batteryValue = batteryValue;
    }

    public String getTemperatureValue() {
        return temperatureValue;
    }

    public void setTemperatureValue(String temperatureValue) {
        this.temperatureValue = temperatureValue == null ? null : temperatureValue.trim();
    }

    public Double getHumidityValue() {
        return humidityValue;
    }

    public void setHumidityValue(Double humidityValue) {
        this.humidityValue = humidityValue;
    }

    public Double getLightValue() {
        return lightValue;
    }

    public void setLightValue(Double lightValue) {
        this.lightValue = lightValue;
    }

    public Double getPressureValue() {
        return pressureValue;
    }

    public void setPressureValue(Double pressureValue) {
        this.pressureValue = pressureValue;
    }

    public Integer getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }
}
