package com.infiniteskills.mvc.controllers;

import org.apache.log4j.lf5.util.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/resource")
public class ResourceController {

	@RequestMapping("/add")
	public String add(Model model){
		model.addAttribute("resource" ,new Resource());
		return "resource_add";
	}
	
	@RequestMapping("/save")
	public String save(){
		System.out.println("Invoking the save() method.");
		return "resource_add";
	}
}
