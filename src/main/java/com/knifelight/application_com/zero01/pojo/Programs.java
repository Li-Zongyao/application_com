package com.knifelight.application_com.zero01.pojo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity//声明一个实体，用的是Java规范下的注解
@Table(name = "programs") //映射的表名称
public class Programs {

    /*声明主键 声明主键的生成策略*/
    @Id
    @GeneratedValue
    private Integer id;

    private String programname;

    private String username;

    private String applicantunit;

    private String subject;

    private String apptime;

    private String status;

    public Programs(Integer id, String programname, String username, String applicantunit, String subject, String apptime, String status) {
        this.id = id;
        this.programname = programname;
        this.username = username;
        this.applicantunit = applicantunit;
        this.subject = subject;
        this.apptime = apptime;
        this.status = status;
    }

    public Programs() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProgramname() {
        return programname;
    }

    public void setProgramname(String programname) {
        this.programname = programname == null ? null : programname.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getApplicantunit() {
        return applicantunit;
    }

    public void setApplicantunit(String applicantunit) {
        this.applicantunit = applicantunit == null ? null : applicantunit.trim();
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject == null ? null : subject.trim();
    }

    public String getApptime() {
        return apptime;
    }

    public void setApptime(String apptime) {
        this.apptime = apptime == null ? null : apptime.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}