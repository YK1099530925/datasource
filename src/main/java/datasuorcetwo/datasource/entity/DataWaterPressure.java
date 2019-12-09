package datasuorcetwo.datasource.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "data_water_pressure")
public class DataWaterPressure extends BaseEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "idOrGenerate")
    @GenericGenerator(name = "idOrGenerate", strategy = "datasuorcetwo.datasource.entity.IdOrGenerate")
    @Column(name = "Id")
    private Integer id;
    @Column(name = "create_time")
    private Date createTime;
    @Column(name = "devTime")
    private String devtime;
    @Column(name = "firmware_version")
    private Integer firmwareVersion;
    @Column(name = "device_id")
    private Integer deviceId;
    @Column(name = "devType")
    private Integer devtype;
    @Column(name = "devSoftVer")
    private Integer devsoftver;
    @Column(name = "devProVer")
    private Integer devprover;
    @Column(name = "devIMEI")
    private String devimei;
    @Column(name = "devIMSI")
    private String devimsi;
    @Column(name = "waterLevelState")
    private Integer waterlevelstate;
    @Column(name = "waterLevelMax")
    private Integer waterlevelmax;
    @Column(name = "waterLevelMin")
    private Integer waterlevelmin;
    @Column(name = "voltage_value")
    private Double voltageValue;
    @Column(name = "connCsq")
    private Integer conncsq;
    @Column(name = "devSendClycle")
    private Integer devsendclycle;
    @Column(name = "waterpressure_value")
    private Double waterpressureValue;
    @Column(name = "devMessageCnt")
    private Integer devmessagecnt;
    @Column(name = "connPCI")
    private Integer connpci;
    @Column(name = "connRsrp")
    private Integer connrsrp;
    @Column(name = "connSnr")
    private Integer connsnr;
    @Column(name = "waterLevelFluctuation")
    private Integer waterlevelfluctuation;

    public Integer getWaterlevelfluctuation() {
        return waterlevelfluctuation;
    }

    public void setWaterlevelfluctuation(Integer waterlevelfluctuation) {
        this.waterlevelfluctuation = waterlevelfluctuation;
    }

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

    public String getDevtime() {
        return devtime;
    }

    public void setDevtime(String devtime) {
        this.devtime = devtime == null ? null : devtime.trim();
    }

    public Integer getFirmwareVersion() {
        return firmwareVersion;
    }

    public void setFirmwareVersion(Integer firmwareVersion) {
        this.firmwareVersion = firmwareVersion;
    }

    public Integer getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }

    public Integer getDevtype() {
        return devtype;
    }

    public void setDevtype(Integer devtype) {
        this.devtype = devtype;
    }

    public Integer getDevsoftver() {
        return devsoftver;
    }

    public void setDevsoftver(Integer devsoftver) {
        this.devsoftver = devsoftver;
    }

    public Integer getDevprover() {
        return devprover;
    }

    public void setDevprover(Integer devprover) {
        this.devprover = devprover;
    }

    public String getDevimei() {
        return devimei;
    }

    public void setDevimei(String devimei) {
        this.devimei = devimei == null ? null : devimei.trim();
    }

    public String getDevimsi() {
        return devimsi;
    }

    public void setDevimsi(String devimsi) {
        this.devimsi = devimsi == null ? null : devimsi.trim();
    }

    public Integer getWaterlevelstate() {
        return waterlevelstate;
    }

    public void setWaterlevelstate(Integer waterlevelstate) {
        this.waterlevelstate = waterlevelstate;
    }

    public Integer getWaterlevelmax() {
        return waterlevelmax;
    }

    public void setWaterlevelmax(Integer waterlevelmax) {
        this.waterlevelmax = waterlevelmax;
    }

    public Integer getWaterlevelmin() {
        return waterlevelmin;
    }

    public void setWaterlevelmin(Integer waterlevelmin) {
        this.waterlevelmin = waterlevelmin;
    }

    public Double getVoltageValue() {
        return voltageValue;
    }

    public void setVoltageValue(Double voltageValue) {
        this.voltageValue = voltageValue;
    }

    public Integer getConncsq() {
        return conncsq;
    }

    public void setConncsq(Integer conncsq) {
        this.conncsq = conncsq;
    }

    public Integer getDevsendclycle() {
        return devsendclycle;
    }

    public void setDevsendclycle(Integer devsendclycle) {
        this.devsendclycle = devsendclycle;
    }

    public Double getWaterpressureValue() {
        return waterpressureValue;
    }

    public void setWaterpressureValue(Double waterpressureValue) {
        this.waterpressureValue = waterpressureValue;
    }

    public Integer getDevmessagecnt() {
        return devmessagecnt;
    }

    public void setDevmessagecnt(Integer devmessagecnt) {
        this.devmessagecnt = devmessagecnt;
    }

    public Integer getConnpci() {
        return connpci;
    }

    public void setConnpci(Integer connpci) {
        this.connpci = connpci;
    }

    public Integer getConnrsrp() {
        return connrsrp;
    }

    public void setConnrsrp(Integer connrsrp) {
        this.connrsrp = connrsrp;
    }

    public Integer getConnsnr() {
        return connsnr;
    }

    public void setConnsnr(Integer connsnr) {
        this.connsnr = connsnr;
    }
}
