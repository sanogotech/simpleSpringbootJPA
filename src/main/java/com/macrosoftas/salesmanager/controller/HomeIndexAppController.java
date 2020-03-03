package com.macrosoftas.salesmanager.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.macrosoftas.salesmanager.AppSalesMain;

@Controller
public class HomeIndexAppController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeIndexAppController.class);


	 @Value("${message.default.welcome}")
	    private  String welcomeMessage;

	    @Value("${message.default.goodbye}")
	    private  String goodBye;

	/*
	 * @RequestMapping("/") public String viewHomePage(Model model) {
	 * 
	 * logger.debug("Start  Home Index  ..." + welcomeMessage);
	 * 
	 * return "index"; }
	 */
	
	/**
	 * addAttributes() method will be the very first to run, prior to the rest of the @RequestMapping methods.
	 * @param model
	 */
	@ModelAttribute
	public void addAttributes(Model model) {
	    model.addAttribute("msg", "Welcome to the DashBoard Spring Boot !");
	}
	
	
}
