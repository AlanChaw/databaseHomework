package com.expertWeb.model;

/**
 * Created by alan on 16/7/14.
 */
public class Expert {
    //基本信息
    private Integer expert_id;  //证书编号
    private Integer state;  //审核状态
    private String certificate_date;    //证书有效时间
    private String expert_name;
    private Integer sex;
    private String born_date;
    private String politics_status;
    private String issue_unit;  //颁发机构
    private Integer education;  //最高学历
    private String job_title;   //职称
    private String job;   //职务
    private Integer retired;    //是否退休
    private Integer credentials_type;   //证件类型
    private String credentials_id;  //证件编号
    private Integer degree;   //最高学位
    private String certificate_number;   //证书编号
    private Integer work_date;   //从业时长
    private Integer part_time_job;  //是否兼职
    private String work_unit;   //工作单位
    private String detail_address;   //详细地址
    private String post_number;    //邮政编码
    private String email;   //电子邮件
    private Integer telephone;
    private String graduate;    //毕业院校及专业
    private Integer field;  //评审领域

    public Integer getCredentials_type() {
        return credentials_type;
    }

    public Integer getDegree() {
        return degree;
    }

    public Integer getEducation() {
        return education;
    }

    public Integer getExpert_id() {
        return expert_id;
    }

    public Integer getPart_time_job() {
        return part_time_job;
    }

    public Integer getRetired() {
        return retired;
    }

    public Integer getSex() {
        return sex;
    }

    public Integer getState() {
        return state;
    }

    public Integer getWork_date() {
        return work_date;
    }

    public String getBorn_date() {
        return born_date;
    }

    public String getCertificate_date() {
        return certificate_date;
    }

    public String getCertificate_number() {
        return certificate_number;
    }

    public String getCredentials_id() {
        return credentials_id;
    }

    public String getDetail_address() {
        return detail_address;
    }

    public String getExpert_name() {
        return expert_name;
    }

    public String getEmail() {
        return email;
    }

    public Integer getTelephone() {
        return telephone;
    }

    public String getIssue_unit() {
        return issue_unit;
    }

    public String getJob() {
        return job;
    }

    public String getJob_title() {
        return job_title;
    }

    public String getPolitics_status() {
        return politics_status;
    }

    public Integer getField() {
        return field;
    }

    public String getGraduate() {
        return graduate;
    }

    public String getPost_number() {
        return post_number;
    }

    public String getWork_unit() {
        return work_unit;
    }

    public void setBorn_date(String born_date) {
        this.born_date = born_date;
    }

    public void setCertificate_date(String certificate_date) {
        this.certificate_date = certificate_date;
    }

    public void setCredentials_id(String credentials_id) {
        this.credentials_id = credentials_id;
    }

    public void setCertificate_number(String certificate_number) {
        this.certificate_number = certificate_number;
    }

    public void setCredentials_type(Integer credentials_type) {
        this.credentials_type = credentials_type;
    }

    public void setDegree(Integer degree) {
        this.degree = degree;
    }

    public void setDetail_address(String detail_address) {
        this.detail_address = detail_address;
    }

    public void setEducation(Integer education) {
        this.education = education;
    }

    public void setExpert_id(Integer expert_id) {
        this.expert_id = expert_id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setExpert_name(String expert_name) {
        this.expert_name = expert_name;
    }

    public void setIssue_unit(String issue_unit) {
        this.issue_unit = issue_unit;
    }

    public void setField(Integer field) {
        this.field = field;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setJob_title(String job_title) {
        this.job_title = job_title;
    }

    public void setPolitics_status(String politics_status) {
        this.politics_status = politics_status;
    }

    public void setGraduate(String graduate) {
        this.graduate = graduate;
    }

    public void setRetired(Integer retired) {
        this.retired = retired;
    }

    public void setPart_time_job(Integer part_time_job) {
        this.part_time_job = part_time_job;
    }

    public void setPost_number(String post_number) {
        this.post_number = post_number;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public void setTelephone(Integer telephone) {
        this.telephone = telephone;
    }

    public void setWork_date(Integer work_date) {
        this.work_date = work_date;
    }

    public void setWork_unit(String work_unit) {
        this.work_unit = work_unit;
    }
}
