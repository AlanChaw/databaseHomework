package com.expertWeb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by alan on 16/7/14.
 */



@Controller
@RequestMapping("/user")
public class UserController {


    @RequestMapping("/regist")
    @ResponseBody
    public Object userRegist(){
        return "成功";
    }


}