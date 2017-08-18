package com.infiniteskill.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String goHome() {	
		return "home";
		} 
	
	@RequestMapping("/amsite1")
	public String goAmsite() {	
		return "Amsite page1";
		} 

}