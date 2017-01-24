package com.pluralsight.controller;

import com.pluralsight.model.Attendee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
    public  String processAttendee(@ModelAttribute("attendee") Attendee attendee){
        System.out.println(attendee);
        return "redirect:index.html";
    }
}
