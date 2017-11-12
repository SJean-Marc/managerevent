package com.perso.event.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/hello")
public class HomeController {
	
	@RequestMapping(value="/index", method=RequestMethod.GET)
	public String index(ModelMap model){
		model.addAttribute("message", "Voici la 1er valeur en param");
		return "hello";
	}
}
