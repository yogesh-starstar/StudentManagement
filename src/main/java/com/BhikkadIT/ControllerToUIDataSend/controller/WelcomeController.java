package com.BhikkadIT.ControllerToUIDataSend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
	
	public WelcomeController() {
		super();
		System.out.println("Welcome Controller Constructor");
	}

	@GetMapping("/welcome")
	public String welcomeMsg(Model model) {
		String msg = "Welcome To BikkadIT";
		model.addAttribute("MESSAGE",msg);
		return "welcome";

	}


}
