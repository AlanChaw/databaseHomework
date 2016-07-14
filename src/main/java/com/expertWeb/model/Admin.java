package com.expertWeb.model;

/**
 * Created by alan on 16/7/14.
 */
public class Admin {
    private Integer admin_id;
    private String username;

    public String getUsername() {
        return username;
    }

    public Integer getAdmin_id() {
        return admin_id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setAdmin_id(Integer admin_id) {
        this.admin_id = admin_id;
    }
}
