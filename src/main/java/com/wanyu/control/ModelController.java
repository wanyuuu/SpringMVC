package com.wanyu.control;

import com.wanyu.po.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by samsung on 2017/11/25.
 */
@Controller
@RequestMapping(value = "model")
public class ModelController {
    @RequestMapping(value = "/go")
    public String go(@ModelAttribute(value = "user") User user, Model model) {

        System.out.println(user.getUsername());
        System.out.println(user.getPwd());
        System.out.println(model.containsAttribute("user"));//是否有这个属性
        return "hello";
    }

    @RequestMapping(value = "/go1")
    //user2为后端向前端传的数据
    public @ModelAttribute("user2") User go1(@ModelAttribute("user") User user){
        System.out.println(user.getUsername());
                System.out.println(user.getPwd());
        return user; //返回model 下 go1.jsp
    }
    @RequestMapping(value = "/go2")
    public @ModelAttribute List<String> go2(){

        return Arrays.asList("詹姆斯","科比");//返回stringList 契约式编程
    }
    @RequestMapping(value = "/go3")
    public @ModelAttribute List<User> go3(){

        return Arrays.asList(new User("wanyu","123456"),new User("jms","232323"));
    }
    @RequestMapping("/go4")
    public @ModelAttribute Map<String,User> go4(){
        Map<String,User> map=new HashMap<String, User>();
        map.put("A",new User("wanyu","123456"));
        map.put("B",new User("xiaoming","987654"));
        return map;
    }
}

