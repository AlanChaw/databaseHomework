package com.expertWeb.model;

/**
 * Created by alan on 16/7/14.
 */

/**
 * 资格证书
 */
public class Qualification {
    private Integer qualification_id;
    private String name;

    public Integer getQualification_id() {
        return qualification_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQualification_id(Integer qualification_id) {
        this.qualification_id = qualification_id;
    }
}
