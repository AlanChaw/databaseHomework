package com.expertWeb.model;

/**
 * Created by alan on 16/7/14.
 */
public class AvoidUnit {
    private Integer unit_id;
    private String unit_name;
    private Integer is_working; //是否工作单位

    public Integer getIs_working() {
        return is_working;
    }

    public Integer getUnit_id() {
        return unit_id;
    }

    public String getUnit_name() {
        return unit_name;
    }

    public void setIs_working(Integer is_working) {
        this.is_working = is_working;
    }

    public void setUnit_id(Integer unit_id) {
        this.unit_id = unit_id;
    }

    public void setUnit_name(String unit_name) {
        this.unit_name = unit_name;
    }
}
