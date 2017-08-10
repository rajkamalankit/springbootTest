package com.crud.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String home(Model model){
        model.addAttribute("name","Rajkamal");
        return "home";
    }

    @GetMapping("/about")
    public String about(Model model){
        model.addAttribute("name","Rajkamal");
        return "about";
    }
    @GetMapping("/signup")
    public String signup(Model model){
        model.addAttribute("name","Rajkamal");
        return "signup";
    }
    @GetMapping("/todo")
    public String todo(Model model){
        model.addAttribute("name","Rajkamal");
        return "todo";
    }
    /*@GetMapping("/social")
    public String social(Model model){
        model.addAttribute("name","Rajkamal");
        return "social";
    }*/

}
