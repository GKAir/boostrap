package com.test.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Author:  Air
 * Date  :  2017-11-09.
 */
@Controller
@RequestMapping("page")
public class PageController {

    @RequestMapping("toPage")
    public String toPage(String page) {

        return page;
    }
}
