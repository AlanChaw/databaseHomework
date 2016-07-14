package com.expertWeb.model;

/**
 * Created by alan on 16/7/14.
 */
public class WorkExp {
    private Integer work_id;
    private String start_time;
    private String end_time;
    private String work_unit;   //工作单位
    private String job; //职务
    private String reference;   //证明人

    public String getWork_unit() {
        return work_unit;
    }

    public Integer getWork_id() {
        return work_id;
    }

    public String getEnd_time() {
        return end_time;
    }

    public String getJob() {
        return job;
    }

    public String getReference() {
        return reference;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setWork_unit(String work_unit) {
        this.work_unit = work_unit;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public void setWork_id(Integer work_id) {
        this.work_id = work_id;
    }

}

