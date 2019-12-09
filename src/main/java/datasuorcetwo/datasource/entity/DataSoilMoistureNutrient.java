package datasuorcetwo.datasource.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "data_soil_moist_nutr")
public class DataSoilMoistureNutrient extends BaseEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "idOrGenerate")
    @GenericGenerator(name = "idOrGenerate", strategy = "datasuorcetwo.datasource.entity.IdOrGenerate")
    @Column(name = "Id")
    private Integer id;
    @Column(name = "create_time")
    private Date createTime;
    @Column(name = "moisture_value")
    private Double moistureValue;
    @Column(name = "device_id")
    private Integer deviceId;
    @Column(name = "nutrient_value")
    private Double nutrientValue;
    @Column(name = "s3_nutrient")
    private String s3Nutrient;

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

    public Double getMoistureValue() {
        return moistureValue;
    }

    public void setMoistureValue(Double moistureValue) {
        this.moistureValue = moistureValue;
    }

    public Integer getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }

    public Double getNutrientValue() {
        return nutrientValue;
    }

    public void setNutrientValue(Double nutrientValue) {
        this.nutrientValue = nutrientValue;
    }

    public String getS3Nutrient() {
        return s3Nutrient;
    }

    public void setS3Nutrient(String s3Nutrient) {
        this.s3Nutrient = s3Nutrient == null ? null : s3Nutrient.trim();
    }
}
