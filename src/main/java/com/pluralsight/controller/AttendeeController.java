package com.pluralsight.controller;

import com.pluralsight.model.Attendee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

/**
 * Created by dev on 24/01/17.
 */
@Controller
public class AttendeeController {

    @RequestMapping(value = "/attendee", method = RequestMethod.GET)
    public String displayAttendePage(Model model ){
        Attendee attendee = new Attendee();
        model.addAttribute("attendee", attendee);
        return "attende";
    }

    @RequestMapping(value = "/attendee", method = RequestMethod.POST)
    public  String processAttendee(@Valid Attendee attendee, BindingResult result, Model m){
        System.out.println(attendee);

        if(result.hasErrors()){
            return "attendee";
        }
        return "redirect:index.html";
    }
}
