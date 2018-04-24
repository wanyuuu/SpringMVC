package com.wanyu.control;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.jws.WebParam;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by samsung on 2017/11/22.
 */
public class HelloController implements Controller{
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView mv=new ModelAndView();
        mv.addObject("username","wanyu"); //向前端传值
        mv.setViewName("hello");//设置view名称

        return mv;
    }
}
