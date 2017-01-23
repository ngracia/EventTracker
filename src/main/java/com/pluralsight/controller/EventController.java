package com.pluralsight.controller;

import com.pluralsight.model.Event;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by dev on 23/01/17.
 */
@Controller
public class EventController {

    @RequestMapping(value = "/event", method = RequestMethod.GET)
    public String displayEventPage(Model model){
        Event event = new Event();
        event.setName("Java user group");
        model.addAttribute("event", event);
        return "event";
    }
}
