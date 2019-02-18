package com.ixpert.springsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DefaultController {

    @GetMapping(value = {"/","/home"})
    public String home(){
        return "/home";
    }

    @GetMapping(value = "/admin")
    public String admin(){
        return "/admin";
    }

    @GetMapping(value = "/user")
    public String user(){
        return "/user";
    }


    @GetMapping(value = "/about")
    public String about(){
        return "/about";
    }


    @GetMapping(value = "/login")
    public String login(){
        return "/login";
    }

    @GetMapping(value = "/403")
    public String error403(){
        return "/error/403";
    }







}
