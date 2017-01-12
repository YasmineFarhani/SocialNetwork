package com.yfarhani.controllers;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;

@Controller
public class ConnectController {

    @GetMapping("/")
    public String initIndex(){
        return "index";
    }

    @GetMapping("/connect")
    public String initConnect(){
        return "connect";
    }

    @PostMapping("/connect")
    protected String handleConnection(ModelAndView mav, HttpServletRequest request, HttpServletResponse response) throws Exception {
        // Action de se connecter, check user dans la base
        response.sendRedirect("/connect");
        return null;
    }

}