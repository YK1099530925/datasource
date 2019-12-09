package datasuorcetwo.datasource.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "org")
public class Org extends BaseEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "idOrGenerate")
    @GenericGenerator(name = "idOrGenerate", strategy = "datasuorcetwo.datasource.entity.IdOrGenerate")
    @Column(name = "Id")
    private Integer id;
    @Column(name = "org_1st_user_name")
    private String org1stUserName;
    @Column(name = "org_icon")
    private String orgIcon;
    @Column(name = "email")
    private String email;
    @Column(name = "register_time")
    private Date registerTime;
    @Column(name = "org_type")
    private Integer orgType;
    @Column(name = "real_name")
    private String realName;
    @Column(name = "org_level")
    private Integer orgLevel;
    @Column(name = "account_balance")
    private Double accountBalance;
    @Column(name = "qq")
    private String qq;
    @Column(name = "out_time")
    private Date outTime;
    @Column(name = "nick")
    private String nick;
    @Column(name = "status")
    private Integer status;
    @Column(name = "telPhone")
    private String telphone;
    @Column(name = "address")
    private String address;
    @Column(name = "addressDetail")
    private String addressdetail;
    @Column(name = "user_account_limit")
    private Integer userAccountLimit;
    @Column(name = "other_org")
    private String otherOrg;
    @Column(name = "longitude")
    private Double longitude;
    @Column(name = "latitude")
    private Double latitude;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrg1stUserName() {
        return org1stUserName;
    }

    public void setOrg1stUserName(String org1stUserName) {
        this.org1stUserName = org1stUserName == null ? null : org1stUserName.trim();
    }

    public String getOrgIcon() {
        return orgIcon;
    }

    public void setOrgIcon(String orgIcon) {
        this.orgIcon = orgIcon == null ? null : orgIcon.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public Integer getOrgType() {
        return orgType;
    }

    public void setOrgType(Integer orgType) {
        this.orgType = orgType;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    public Integer getOrgLevel() {
        return orgLevel;
    }

    public void setOrgLevel(Integer orgLevel) {
        this.orgLevel = orgLevel;
    }

    public Double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(Double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public Date getOutTime() {
        return outTime;
    }

    public void setOutTime(Date outTime) {
        this.outTime = outTime;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick == null ? null : nick.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone == null ? null : telphone.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getAddressdetail() {
        return addressdetail;
    }

    public void setAddressdetail(String addressdetail) {
        this.addressdetail = addressdetail == null ? null : addressdetail.trim();
    }

    public Integer getUserAccountLimit() {
        return userAccountLimit;
    }

    public void setUserAccountLimit(Integer userAccountLimit) {
        this.userAccountLimit = userAccountLimit;
    }

    public String getOtherOrg() {
        return otherOrg;
    }

    public void setOtherOrg(String otherOrg) {
        this.otherOrg = otherOrg == null ? null : otherOrg.trim();
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

    @Override
    public String toString() {
        return "Org{" +
                "id=" + id +
                ", org1stUserName='" + org1stUserName + '\'' +
                ", userAccountLimit=" + userAccountLimit +
                ", otherOrg='" + otherOrg + '\'' +
                ", longitude=" + longitude +
                ", latitude=" + latitude +
                '}';
    }
}
