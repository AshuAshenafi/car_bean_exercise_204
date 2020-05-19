package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/homepage")
    public String loadHomePage(Model model){
        model.addAttribute("car", new Car());
        return "informationpage";
    }
    @RequestMapping("/confirmpage")
    public String loadConfirmPage(@ModelAttribute Car car, Model model) {
        model.addAttribute("car", car);
        return "confirmationpage";
    }
}
