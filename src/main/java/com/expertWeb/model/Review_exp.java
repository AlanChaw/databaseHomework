package com.expertWeb.model;

/**
 * Created by alan on 16/7/14.
 */
public class Review_exp {
    private Integer review_id;
    private String review_date;
    private String review_name; //任务名称
    private String desc;    //任务描述
    private Integer review_type;    //任务类型

    public Integer getReview_id() {
        return review_id;
    }

    public Integer getReview_type() {
        return review_type;
    }

    public String getDesc() {
        return desc;
    }

    public String getReview_date() {
        return review_date;
    }

    public String getReview_name() {
        return review_name;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setReview_date(String review_date) {
        this.review_date = review_date;
    }

    public void setReview_id(Integer review_id) {
        this.review_id = review_id;
    }

    public void setReview_name(String review_name) {
        this.review_name = review_name;
    }

    public void setReview_type(Integer review_type) {
        this.review_type = review_type;
    }
}
