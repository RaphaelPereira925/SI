package com.cinema.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping( "/")
public class GeralController {
	
	@GetMapping
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView("Home");
		return(mv);
	}

}
