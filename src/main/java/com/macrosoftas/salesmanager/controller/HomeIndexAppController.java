package com.macrosoftas.salesmanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeIndexAppController {


	
	@RequestMapping("/")
	public String viewHomePage(Model model) {

		return "index";
	}
	
	/**
	 * addAttributes() method will be the very first to run, prior to the rest of the @RequestMapping methods.
	 * @param model
	 */
	@ModelAttribute
	public void addAttributes(Model model) {
	    model.addAttribute("msg", "Welcome to the DashBoard Spring Boot !");
	}
	
	
}
