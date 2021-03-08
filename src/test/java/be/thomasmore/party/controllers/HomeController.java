package be.thomasmore.party.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller

public class HomeController {
    private final String appNameHome = "It’s PartyTime!!";
    private final String appNameVenue = "Lets’s Party!";

    @GetMapping({"/","/home"})
    public String home(Model model){
        model.addAttribute("appName",appNameHome);
        return "home";
    }

    @GetMapping("/about")
    public String about(Model model){
        model.addAttribute("appName",appNameHome);
        return "about";
    }
    @GetMapping({"/venuedetails","/venuedetails/{venueName}"})
    public String venuedetails(Model model,
                               @PathVariable(required = false)  String venueName){
        model.addAttribute("venuneName",(venueName!=null) ? venueName : "--no venue chosen--" );
        model.addAttribute("appName",appNameVenue);
        return venueName;
    }

    @GetMapping("/venuelist")
    public String venuelist(Model model){

        model.addAttribute("appName",appNameVenue);
        return "venuelist";
    }

}
