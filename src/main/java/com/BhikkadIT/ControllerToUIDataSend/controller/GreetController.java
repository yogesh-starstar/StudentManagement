package com.BhikkadIT.ControllerToUIDataSend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetController {
	
	@GetMapping("/greet")
	public String greet(Model model) {
	
		String msg="Good Evening";
		model.addAttribute("MSG", msg);
		return "greet";
		
	}
	

}
