package com.bai.oauth2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    /**
     * 自定义登录页面
     * @return
     */
    @GetMapping("/toLogin")
    public String login() {
        return "login";
    }

}