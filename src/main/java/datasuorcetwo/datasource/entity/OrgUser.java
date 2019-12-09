package datasuorcetwo.datasource.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "org_user")
public class OrgUser extends BaseEntity implements Serializable {

    @Column(name = "org_id")
    private Integer orgId;
    @Id
    @Column(name = "user_id")
    private Integer id;
    @Column(name = "remark")
    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer org_id) {
        this.orgId = org_id;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    @Override
    public String toString() {
        return "OrgUser{" +
                "orgId=" + orgId +
                ", id=" + id +
                ", remark='" + remark + '\'' +
                '}';
    }
}
