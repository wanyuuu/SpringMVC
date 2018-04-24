package com.wanyu.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by samsung on 2017/11/22.
 */
@Controller
@RequestMapping(value = {"param"})
public class ParamController {
    @RequestMapping(value = {"/go/{username}/{price}"})
    public ModelAndView go(@PathVariable(value = "username") String username,
        @PathVariable(value = "price") String price){
        ModelAndView mv=new ModelAndView();
        mv.addObject("username",":"+username+",price:"+price);
        mv.setViewName("hello");
        return mv;
    }
    @RequestMapping(value = {"/go1/{pricemin:\\d+}-{pricemax:\\d+}"})
    public ModelAndView go1(@PathVariable(value = "pricemin") String pricemin,
                            @PathVariable(value = "pricemax") String pricemax){
        ModelAndView mv=new ModelAndView();
        mv.addObject("username",pricemin+"-"+pricemax);
        mv.setViewName("hello");
        return mv;
    }
}
