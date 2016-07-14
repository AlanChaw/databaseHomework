package com.expertWeb.model;

/**
 * Created by alan on 16/7/14.
 */
public class User {
    private String username;
    private String passwd;
    private Integer kind;

    public Integer getKind() {
        return kind;
    }

    public String getPasswd() {
        return passwd;
    }

    public String getUsername() {
        return username;
    }

    public void setKind(Integer kind) {
        this.kind = kind;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
