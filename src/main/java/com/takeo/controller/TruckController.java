package com.takeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/truck")
public class TruckController {
	
	@GetMapping("/list") 
    public String listCargo(Model model) { 
        model.addAttribute("name", "sabita-truck"); 
        return "truck"; 
    }

}
