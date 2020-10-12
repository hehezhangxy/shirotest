package com.example.shirospringboot;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Mcontroller {
    @RequestMapping("/")
    public String toIndex() {
        return "index";
    }
    @RequestMapping("/user/add")
    public String add() {
        return "add";
    }
    @RequestMapping("/user/update")
    public String update() {
        return "update";
    }
    @RequestMapping("/toLogin")
    public String toLogin() {
        return "login";
    }
    @RequestMapping("login")
    public String login(String username, String password) {
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        return "login";
    }
}
