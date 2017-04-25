package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.ws.rs.Path;

/**
 * Created by shenjin on 2017/4/25.
 */
@Controller
@RequestMapping("/user")
public class UserTest {
    @RequestMapping("/userinfor.action")
    public ModelAndView getUserInfor() {
        ModelAndView modelAndView = new ModelAndView();
        System.out.print("test");
        modelAndView.setViewName("welcom");
        return  modelAndView;
    }
}
