package com.test.demo.controller;

import com.test.demo.pojo.ManagerUser;
import com.test.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Author:  Air
 * Date  :  2017-11-08.
 */
@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("index")
    public String register() {
        return "index.jsp";
    }

    @RequestMapping("login")
    @ResponseBody
    public List<ManagerUser> login(ManagerUser user) {

        System.out.println(user);
        List<ManagerUser> list = userService.login(user);

        /*if (list.size() == 0 || list.size() > 1) {
            return "register.html";
        } else {
            return "redirect:index";
        }*/
        return list;
    }

    @RequestMapping("register")
    public String register(ManagerUser user) {

        Integer flag = userService.register(user);
        System.out.println(flag);
        System.out.println(user);
        if (flag == 1) {
            return "../../login.html";
        } else {
            return "register.html";
        }
    }
}
