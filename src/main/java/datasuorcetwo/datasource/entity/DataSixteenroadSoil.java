package datasuorcetwo.datasource.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "data_sixteenroad_soil")
public class DataSixteenroadSoil extends BaseEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "idOrGenerate")
    @GenericGenerator(name = "idOrGenerate", strategy = "datasuorcetwo.datasource.entity.IdOrGenerate")
    @Column(name = "Id")
    private Integer id;
    @Column(name = "device_id")
    private Integer deviceId;
    @Column(name = "create_time")
    private Date createTime;
    @Column(name = "road1_temperature_value")
    private Double road1TemperatureValue;
    @Column(name = "road1_humidity_value")
    private Double road1HumidityValue;
    @Column(name = "road2_temperature_value")
    private Double road2TemperatureValue;
    @Column(name = "road2_humidity_value")
    private Double road2HumidityValue;
    @Column(name = "road3_temperature_value")
    private Double road3TemperatureValue;
    @Column(name = "road3_humidity_value")
    private Double road3HumidityValue;
    @Column(name = "road4_temperature_value")
    private Double road4TemperatureValue;
    @Column(name = "road4_humidity_value")
    private Double road4HumidityValue;
    @Column(name = "road5_temperature_value")
    private Double road5TemperatureValue;
    @Column(name = "road5_humidity_value")
    private Double road5HumidityValue;
    @Column(name = "road6_temperature_value")
    private Double road6TemperatureValue;
    @Column(name = "road6_humidity_value")
    private Double road6HumidityValue;
    @Column(name = "road7_temperature_value")
    private Double road7TemperatureValue;
    @Column(name = "road7_humidity_value")
    private Double road7HumidityValue;
    @Column(name = "road8_temperature_value")
    private Double road8TemperatureValue;
    @Column(name = "road8_humidity_value")
    private Double road8HumidityValue;
    @Column(name = "road9_temperature_value")
    private Double road9TemperatureValue;
    @Column(name = "road9_humidity_value")
    private Double road9HumidityValue;
    @Column(name = "road10_temperature_value")
    private Double road10TemperatureValue;
    @Column(name = "road10_humidity_value")
    private Double road10HumidityValue;
    @Column(name = "road11_temperature_value")
    private Double road11TemperatureValue;
    @Column(name = "road11_humidity_value")
    private Double road11HumidityValue;
    @Column(name = "road12_temperature_value")
    private Double road12TemperatureValue;
    @Column(name = "road12_humidity_value")
    private Double road12HumidityValue;
    @Column(name = "road13_temperature_value")
    private Double road13TemperatureValue;
    @Column(name = "road13_humidity_value")
    private Double road13HumidityValue;
    @Column(name = "road14_temperature_value")
    private Double road14TemperatureValue;
    @Column(name = "road14_humidity_value")
    private Double road14HumidityValue;
    @Column(name = "road15_temperature_value")
    private Double road15TemperatureValue;
    @Column(name = "road15_humidity_value")
    private Double road15HumidityValue;
    @Column(name = "road16_temperature_value")
    private Double road16TemperatureValue;
    @Column(name = "road16_humidity_value")
    private Double road16HumidityValue;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Double getRoad1TemperatureValue() {
        return road1TemperatureValue;
    }

    public void setRoad1TemperatureValue(Double road1TemperatureValue) {
        this.road1TemperatureValue = road1TemperatureValue;
    }

    public Double getRoad1HumidityValue() {
        return road1HumidityValue;
    }

    public void setRoad1HumidityValue(Double road1HumidityValue) {
        this.road1HumidityValue = road1HumidityValue;
    }

    public Double getRoad2TemperatureValue() {
        return road2TemperatureValue;
    }

    public void setRoad2TemperatureValue(Double road2TemperatureValue) {
        this.road2TemperatureValue = road2TemperatureValue;
    }

    public Double getRoad2HumidityValue() {
        return road2HumidityValue;
    }

    public void setRoad2HumidityValue(Double road2HumidityValue) {
        this.road2HumidityValue = road2HumidityValue;
    }

    public Double getRoad3TemperatureValue() {
        return road3TemperatureValue;
    }

    public void setRoad3TemperatureValue(Double road3TemperatureValue) {
        this.road3TemperatureValue = road3TemperatureValue;
    }

    public Double getRoad3HumidityValue() {
        return road3HumidityValue;
    }

    public void setRoad3HumidityValue(Double road3HumidityValue) {
        this.road3HumidityValue = road3HumidityValue;
    }

    public Double getRoad4TemperatureValue() {
        return road4TemperatureValue;
    }

    public void setRoad4TemperatureValue(Double road4TemperatureValue) {
        this.road4TemperatureValue = road4TemperatureValue;
    }

    public Double getRoad4HumidityValue() {
        return road4HumidityValue;
    }

    public void setRoad4HumidityValue(Double road4HumidityValue) {
        this.road4HumidityValue = road4HumidityValue;
    }

    public Double getRoad5TemperatureValue() {
        return road5TemperatureValue;
    }

    public void setRoad5TemperatureValue(Double road5TemperatureValue) {
        this.road5TemperatureValue = road5TemperatureValue;
    }

    public Double getRoad5HumidityValue() {
        return road5HumidityValue;
    }

    public void setRoad5HumidityValue(Double road5HumidityValue) {
        this.road5HumidityValue = road5HumidityValue;
    }

    public Double getRoad6TemperatureValue() {
        return road6TemperatureValue;
    }

    public void setRoad6TemperatureValue(Double road6TemperatureValue) {
        this.road6TemperatureValue = road6TemperatureValue;
    }

    public Double getRoad6HumidityValue() {
        return road6HumidityValue;
    }

    public void setRoad6HumidityValue(Double road6HumidityValue) {
        this.road6HumidityValue = road6HumidityValue;
    }

    public Double getRoad7TemperatureValue() {
        return road7TemperatureValue;
    }

    public void setRoad7TemperatureValue(Double road7TemperatureValue) {
        this.road7TemperatureValue = road7TemperatureValue;
    }

    public Double getRoad7HumidityValue() {
        return road7HumidityValue;
    }

    public void setRoad7HumidityValue(Double road7HumidityValue) {
        this.road7HumidityValue = road7HumidityValue;
    }

    public Double getRoad8TemperatureValue() {
        return road8TemperatureValue;
    }

    public void setRoad8TemperatureValue(Double road8TemperatureValue) {
        this.road8TemperatureValue = road8TemperatureValue;
    }

    public Double getRoad8HumidityValue() {
        return road8HumidityValue;
    }

    public void setRoad8HumidityValue(Double road8HumidityValue) {
        this.road8HumidityValue = road8HumidityValue;
    }

    public Double getRoad9TemperatureValue() {
        return road9TemperatureValue;
    }

    public void setRoad9TemperatureValue(Double road9TemperatureValue) {
        this.road9TemperatureValue = road9TemperatureValue;
    }

    public Double getRoad9HumidityValue() {
        return road9HumidityValue;
    }

    public void setRoad9HumidityValue(Double road9HumidityValue) {
        this.road9HumidityValue = road9HumidityValue;
    }

    public Double getRoad10TemperatureValue() {
        return road10TemperatureValue;
    }

    public void setRoad10TemperatureValue(Double road10TemperatureValue) {
        this.road10TemperatureValue = road10TemperatureValue;
    }

    public Double getRoad10HumidityValue() {
        return road10HumidityValue;
    }

    public void setRoad10HumidityValue(Double road10HumidityValue) {
        this.road10HumidityValue = road10HumidityValue;
    }

    public Double getRoad11TemperatureValue() {
        return road11TemperatureValue;
    }

    public void setRoad11TemperatureValue(Double road11TemperatureValue) {
        this.road11TemperatureValue = road11TemperatureValue;
    }

    public Double getRoad11HumidityValue() {
        return road11HumidityValue;
    }

    public void setRoad11HumidityValue(Double road11HumidityValue) {
        this.road11HumidityValue = road11HumidityValue;
    }

    public Double getRoad12TemperatureValue() {
        return road12TemperatureValue;
    }

    public void setRoad12TemperatureValue(Double road12TemperatureValue) {
        this.road12TemperatureValue = road12TemperatureValue;
    }

    public Double getRoad12HumidityValue() {
        return road12HumidityValue;
    }

    public void setRoad12HumidityValue(Double road12HumidityValue) {
        this.road12HumidityValue = road12HumidityValue;
    }

    public Double getRoad13TemperatureValue() {
        return road13TemperatureValue;
    }

    public void setRoad13TemperatureValue(Double road13TemperatureValue) {
        this.road13TemperatureValue = road13TemperatureValue;
    }

    public Double getRoad13HumidityValue() {
        return road13HumidityValue;
    }

    public void setRoad13HumidityValue(Double road13HumidityValue) {
        this.road13HumidityValue = road13HumidityValue;
    }

    public Double getRoad14TemperatureValue() {
        return road14TemperatureValue;
    }

    public void setRoad14TemperatureValue(Double road14TemperatureValue) {
        this.road14TemperatureValue = road14TemperatureValue;
    }

    public Double getRoad14HumidityValue() {
        return road14HumidityValue;
    }

    public void setRoad14HumidityValue(Double road14HumidityValue) {
        this.road14HumidityValue = road14HumidityValue;
    }

    public Double getRoad15TemperatureValue() {
        return road15TemperatureValue;
    }

    public void setRoad15TemperatureValue(Double road15TemperatureValue) {
        this.road15TemperatureValue = road15TemperatureValue;
    }

    public Double getRoad15HumidityValue() {
        return road15HumidityValue;
    }

    public void setRoad15HumidityValue(Double road15HumidityValue) {
        this.road15HumidityValue = road15HumidityValue;
    }

    public Double getRoad16TemperatureValue() {
        return road16TemperatureValue;
    }

    public void setRoad16TemperatureValue(Double road16TemperatureValue) {
        this.road16TemperatureValue = road16TemperatureValue;
    }

    public Double getRoad16HumidityValue() {
        return road16HumidityValue;
    }

    public void setRoad16HumidityValue(Double road16HumidityValue) {
        this.road16HumidityValue = road16HumidityValue;
    }
}
