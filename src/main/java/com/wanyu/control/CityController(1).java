package com.wanyu.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;

/**
 * Created by samsung on 2017/11/22.
 */
@Controller
@RequestMapping(value = {"city"})
public class CityController {
    //默认POST、GET都可以
    @RequestMapping(value = {"bj"},method = RequestMethod.GET)
    public ModelAndView bjCity(){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("city");
        mv.addObject("city","北京");
        return mv;
    }
    @RequestMapping(value = {"sh"})
    public ModelAndView shCity(){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("city");
        mv.addObject("city","上海");
        return mv;
    }
}
