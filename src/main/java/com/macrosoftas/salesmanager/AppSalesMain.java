package com.macrosoftas.salesmanager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppSalesMain {
	
	private static final Logger logger = LoggerFactory.getLogger(AppSalesMain.class);
	
	
	public static void main(String[] args) {
		
		logger.debug("Start  Application  ...");
		SpringApplication.run(AppSalesMain.class, args);
	}
}
