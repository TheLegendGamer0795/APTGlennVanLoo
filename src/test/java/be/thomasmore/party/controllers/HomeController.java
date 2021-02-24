package be.thomasmore.party.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class HomeController {
    private final String appName = "It’s PartyTime!!";

    @GetMapping({"/","/home"})
    public String home(Model model){
        model.addAttribute("appName",appName);
        return "home";
    }

    @GetMapping("/about")
    public String about(Model model){
        model.addAttribute("appName",appName);
        return "about";
    }
    @GetMapping("/venuedetails")
    public String venuedetails(Model model){
        model.addAttribute("appName",appName);
        return "venuedetails";
    }

}
