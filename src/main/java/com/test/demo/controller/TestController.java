package com.test.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Author:  Air
 * Date  :  2017-11-08.
 */
@Controller
@RequestMapping("user")
public class TestController {

    @RequestMapping("register")
    @ResponseBody
    public String register() {
        return "23333333333333333333333";
    }

    @RequestMapping("login")
    @ResponseBody
    public List<String> login(String username, String password) {
        List<String> list = new ArrayList<>();
        list.add(username);
        list.add(password);
        return list;
    }
}
