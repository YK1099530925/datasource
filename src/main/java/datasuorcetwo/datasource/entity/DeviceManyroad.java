package datasuorcetwo.datasource.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "device_manyroad")
public class DeviceManyroad extends BaseEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "idOrGenerate")
    @GenericGenerator(name = "idOrGenerate", strategy = "datasuorcetwo.datasource.entity.IdOrGenerate")
    @Column(name = "Id")
    private Integer id;
    @Column(name = "device_switch_id")
    private Integer deviceSwitchId;
    @Column(name = "pass_road")
    private Integer passRoad;
    @Column(name = "road")
    private Integer road;
    @Column(name = "mode")
    private String mode;
    @Column(name = "outs")
    private String outs;
    @Column(name = "fixed_parameters")
    private String fixedParameters;
    @Column(name = "linkage_weather")
    private Integer linkageWeather;
    @Column(name = "linkage_device_id")
    private Integer linkageDeviceId;
    @Column(name = "linkage_device_type_id")
    private Integer linkageDeviceTypeId;
    @Column(name = "lower_limit_expect")
    private Double lowerLimitExpect;
    @Column(name = "lower_limit_value")
    private Double lowerLimitValue;
    @Column(name = "upper_limit_expect")
    private Double upperLimitExpect;
    @Column(name = "upper_limit_value")
    private Double upperLimitValue;
    @Column(name = "device_code")
    private String deviceCode;
    @Column(name = "spare")
    private Integer spare;
    @Column(name = "spare1")
    private String spare1;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDeviceSwitchId() {
        return deviceSwitchId;
    }

    public void setDeviceSwitchId(Integer deviceSwitchId) {
        this.deviceSwitchId = deviceSwitchId;
    }

    public Integer getPassRoad() {
        return passRoad;
    }

    public void setPassRoad(Integer passRoad) {
        this.passRoad = passRoad;
    }

    public Integer getRoad() {
        return road;
    }

    public void setRoad(Integer road) {
        this.road = road;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode == null ? null : mode.trim();
    }

    public String getOuts() {
        return outs;
    }

    public void setOuts(String outs) {
        this.outs = outs == null ? null : outs.trim();
    }

    public String getFixedParameters() {
        return fixedParameters;
    }

    public void setFixedParameters(String fixedParameters) {
        this.fixedParameters = fixedParameters == null ? null : fixedParameters.trim();
    }

    public Integer getLinkageWeather() {
        return linkageWeather;
    }

    public void setLinkageWeather(Integer linkageWeather) {
        this.linkageWeather = linkageWeather;
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

    public String getDeviceCode() {
        return deviceCode;
    }

    public void setDeviceCode(String deviceCode) {
        this.deviceCode = deviceCode == null ? null : deviceCode.trim();
    }

    public Integer getSpare() {
        return spare;
    }

    public void setSpare(Integer spare) {
        this.spare = spare;
    }

    public String getSpare1() {
        return spare1;
    }

    public void setSpare1(String spare1) {
        this.spare1 = spare1 == null ? null : spare1.trim();
    }

    @Override
    public String toString() {
        return "DeviceManyroad{" +
                "id=" + id +
                ", deviceId=" + deviceSwitchId +
                ", road=" + road +
                ", mode='" + mode + '\'' +
                ", outs='" + outs + '\'' +
                ", p='" + fixedParameters + '\'' +
                ", weather=" + linkageWeather +
                ", linkageId=" + linkageDeviceId +
                ", linkageTypeId=" + linkageDeviceTypeId +
                ", expect=" + lowerLimitExpect +
                ", value=" + lowerLimitValue +
                ", spare1='" + spare1 + '\'' +
                '}';
    }
}
