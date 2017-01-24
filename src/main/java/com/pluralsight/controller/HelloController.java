package com.pluralsight.controller;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Nestor Gracia on 1/22/2017.
 */
@Controller
public class HelloController {

    @RequestMapping(value = "/greeting")
    public String sayHello(Model model){
        model.addAttribute("greeting", "Hello world");
        return "hello.jsp";
    }

    @RequestMapping(value = "/index")
    public String index(Model model){
        return "forward:index.jsp";
    }
}
