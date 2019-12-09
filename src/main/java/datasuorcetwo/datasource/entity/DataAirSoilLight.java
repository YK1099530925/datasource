package datasuorcetwo.datasource.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "data_air_soil_light")
public class DataAirSoilLight extends BaseEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "idOrGenerate")
    @GenericGenerator(name = "idOrGenerate", strategy = "datasuorcetwo.datasource.entity.IdOrGenerate")
    @Column(name = "Id")
    private Integer id;
    @Column(name = "create_time")
    private Date createTime;
    @Column(name = "device_id")
    private Integer deviceId;
    @Column(name = "air_temperature_value")
    private Double airTemperatureValue;
    @Column(name = "air_humidity_value")
    private Double airHumidityValue;
    @Column(name = "soil_temperature_value")
    private Double soilTemperatureValue;
    @Column(name = "soil_humidity_value")
    private Double soilHumidityValue;
    @Column(name = "light_value")
    private Double lightValue;

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

    public Integer getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }

    public Double getAirTemperatureValue() {
        return airTemperatureValue;
    }

    public void setAirTemperatureValue(Double airTemperatureValue) {
        this.airTemperatureValue = airTemperatureValue;
    }

    public Double getAirHumidityValue() {
        return airHumidityValue;
    }

    public void setAirHumidityValue(Double airHumidityValue) {
        this.airHumidityValue = airHumidityValue;
    }

    public Double getSoilTemperatureValue() {
        return soilTemperatureValue;
    }

    public void setSoilTemperatureValue(Double soilTemperatureValue) {
        this.soilTemperatureValue = soilTemperatureValue;
    }

    public Double getSoilHumidityValue() {
        return soilHumidityValue;
    }

    public void setSoilHumidityValue(Double soilHumidityValue) {
        this.soilHumidityValue = soilHumidityValue;
    }

    public Double getLightValue() {
        return lightValue;
    }

    public void setLightValue(Double lightValue) {
        this.lightValue = lightValue;
    }
}
