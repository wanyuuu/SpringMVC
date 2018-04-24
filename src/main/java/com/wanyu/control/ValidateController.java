package com.wanyu.control;

import com.wanyu.po.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.Map;

/**
 * Created by samsung on 2017/11/25.
 */
@Controller
@RequestMapping("vc")
public class ValidateController {
    @RequestMapping("/show")
    public String show(Map map){//显示校验窗体
        User user=new User();
        map.put("user",user );
        return "validate";
    }
    @RequestMapping("/val")
    public String validate(@Valid User user, BindingResult result,Model model){
        if(result.hasErrors()){
            return "validate";
        }else {
            return "success";
        }
    }
}
