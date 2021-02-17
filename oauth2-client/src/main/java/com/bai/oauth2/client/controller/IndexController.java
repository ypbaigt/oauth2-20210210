package com.bai.oauth2.client.controller;

import com.bai.oauth2.client.model.Student;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextImpl;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class IndexController {

    @GetMapping("/securedPage")
    public String securedPage(HttpServletRequest request, Model model) {
        System.out.println(request.getSession());

        SecurityContextImpl securityContext = (SecurityContextImpl) request.getSession().getAttribute("SPRING_SECURITY_CONTEXT");
        Authentication authentication = securityContext.getAuthentication();
        System.out.println(authentication.getName());

        return "securedPage.html";
    }

    @GetMapping("/index")
    public String index() {
        return "index.html";
    }
}
