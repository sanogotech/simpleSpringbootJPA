package com.macrosoftas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeIndexAppController {


	
	@RequestMapping("/")
	public String viewHomePage(Model model) {

		return "index";
	}
	
	
}
