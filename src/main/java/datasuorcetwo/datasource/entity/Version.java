package datasuorcetwo.datasource.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "version")
public class Version extends BaseEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "idOrGenerate")
    @GenericGenerator(name = "idOrGenerate", strategy = "datasuorcetwo.datasource.entity.IdOrGenerate")
    @Column(name = "Id")
    private Integer id;

    @Column(name = "name")
    private String name;
    @Column(name = "version_no")
    private Long versionNo;
    @Column(name = "content1")
    private String content1;
    @Column(name = "content2")
    private String content2;
    @Column(name = "content3")
    private String content3;
    @Column(name = "content4")
    private String content4;
    @Column(name = "content5")
    private String content5;
    @Column(name = "content6")
    private String content6;
    @Column(name = "content7")
    private String content7;
    @Column(name = "content8")
    private String content8;
    @Column(name = "content9")
    private String content9;
    @Column(name = "content10")
    private String content10;
    @Column(name = "url")
    private String url;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Long getVersionNo() {
        return versionNo;
    }

    public void setVersionNo(Long versionNo) {
        this.versionNo = versionNo;
    }

    public String getContent1() {
        return content1;
    }

    public void setContent1(String content1) {
        this.content1 = content1 == null ? null : content1.trim();
    }

    public String getContent2() {
        return content2;
    }

    public void setContent2(String content2) {
        this.content2 = content2 == null ? null : content2.trim();
    }

    public String getContent3() {
        return content3;
    }

    public void setContent3(String content3) {
        this.content3 = content3 == null ? null : content3.trim();
    }

    public String getContent4() {
        return content4;
    }

    public void setContent4(String content4) {
        this.content4 = content4 == null ? null : content4.trim();
    }

    public String getContent5() {
        return content5;
    }

    public void setContent5(String content5) {
        this.content5 = content5 == null ? null : content5.trim();
    }

    public String getContent6() {
        return content6;
    }

    public void setContent6(String content6) {
        this.content6 = content6 == null ? null : content6.trim();
    }

    public String getContent7() {
        return content7;
    }

    public void setContent7(String content7) {
        this.content7 = content7 == null ? null : content7.trim();
    }

    public String getContent8() {
        return content8;
    }

    public void setContent8(String content8) {
        this.content8 = content8 == null ? null : content8.trim();
    }

    public String getContent9() {
        return content9;
    }

    public void setContent9(String content9) {
        this.content9 = content9 == null ? null : content9.trim();
    }

    public String getContent10() {
        return content10;
    }

    public void setContent10(String content10) {
        this.content10 = content10 == null ? null : content10.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    @Override
    public String toString() {
        return "Version{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", versionNo=" + versionNo +
                ", content1='" + content1 + '\'' +
                ", content2='" + content2 + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
