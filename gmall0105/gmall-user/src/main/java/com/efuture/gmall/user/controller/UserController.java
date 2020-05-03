package com.efuture.gmall.user.controller;

import com.efuture.gmall.bean.UmsMember;
import com.efuture.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/index")
    @ResponseBody
    public String index(){
        return "hello index";
    }

    @RequestMapping("/getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser(){
      List<UmsMember> userList=  userService.getAllUser();
      return  userList;
    }
}
