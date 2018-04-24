package com.wanyu.control;

import com.wanyu.po.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.annotation.SessionScope;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

/**
 * Created by samsung on 2017/11/22.
 * 数据绑定
 */
@Controller
@RequestMapping(value = "my")
public class MyController {
    //契约式编程
    @RequestMapping(value = "/go")
    public String go(User user, Map<String,String> map , Model model, ModelMap mm){
        System.out.println(user.getUsername());
        System.out.println(user.getPwd());
        map.put("username",user.getUsername());
        map.put("pwd",user.getPwd());
        //使用model方法渲染视图需要的模型数据
        model.addAttribute("username1",user.getUsername());
        mm.put("username2",user.getUsername());
        return "my";
    }
    @RequestMapping(value = "/go1")
    public String go1(@RequestParam String username){

        System.out.println(username);
        return "my";
    }
    @RequestMapping(value = "/go2")
    public String go2(@RequestParam(value = "user") String username){
        System.out.println(username);
        return "my";
    }
    @RequestMapping(value = "/go3")
    public String go3(@RequestParam(value = "name") String names[]){
        System.out.println(names[0]);
        System.out.println(names[1]);
        return "my";
    }
    @RequestMapping(value = "/go4")
    public String go4(@RequestParam(value = "name") List list){
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        return "my";
    }
    @RequestMapping(value = "/go5")
    public String go5(@CookieValue(value = "count",defaultValue = "0") Long count,
                      HttpServletResponse resp){
        count++;
        Cookie cookie=new Cookie("count",count.toString());
        resp.addCookie(cookie);
        return "cookie";
    }
    @RequestMapping(value = "/go6")
    public String go6(@CookieValue("JSESSIONID") Cookie jsessionid,
                      HttpServletResponse resp){
        jsessionid.setValue("Wanyu");
        resp.addCookie(jsessionid);
        return "cookie";
    }
    @RequestMapping(value = "/go7")
    public String go7(Model model){
        model.addAttribute("age","1000");
        return "session";
    }
}
