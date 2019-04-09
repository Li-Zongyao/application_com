package com.knifelight.application_com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.zero01.pojo.AppUser;

@Controller
public class LoginController {


    private String a;

    @CrossOrigin
    @RequestMapping(value = "/api/login", method = RequestMethod.POST, produces = "application/json; charset=UTF-8")
    @ResponseBody
    public String Login(@RequestBody AppUser user) {
        System.out.printf("用户名" + user.getName());
        System.out.printf("用户密码" + user.getPassword()+"\n");
        a=user.getName();
        return a;
    }


}
