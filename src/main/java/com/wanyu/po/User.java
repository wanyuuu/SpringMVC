package com.wanyu.po;

import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Pattern;
import java.io.Serializable;

/**
 * Created by samsung on 2017/11/22.
 */
public class User implements Serializable {
    @NotEmpty
    private String username;
    @NotEmpty
    private String pwd;
    @NotEmpty
    @Pattern(regexp = "^\\d+$")
    @Range(min=0,max=99)
    private String age;

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public User(){

    }
    public User(String username,String pwd){
        this.username=username;
        this.pwd=pwd;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
