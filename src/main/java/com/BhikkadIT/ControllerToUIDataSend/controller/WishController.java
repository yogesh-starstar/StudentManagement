package com.BhikkadIT.ControllerToUIDataSend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WishController {
	
	@GetMapping("/wish")
	public ModelAndView wish() {
		
		String msg="Happy Birthday";
		
		ModelAndView mv=new ModelAndView();
		mv.addObject("MSSG", msg);
		mv.setViewName("wish");
		return mv;
		
	}

}
