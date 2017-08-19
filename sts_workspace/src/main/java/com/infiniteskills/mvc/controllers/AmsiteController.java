package com.infiniteskills.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AmsiteController {
	
	@RequestMapping("/amsite")
	public String gotoAmsite() {
		return "amindex";
		
	}
	
	@RequestMapping("/customerpage")
	public String gotoCustomer() {
		return "customerpage";
		
	}

}
