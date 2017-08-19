package com.infiniteskills.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.infiniteskills.mvc.data.model.Project;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String goHome(Model model){
		
		Project project = new Project();
		project.setName("Amjung MVC Test01");
		project.setSponsor("Infinite Skill WebSite");
		project.setDescription("This project is my first Spring MVC project for Practice.");
		project.setProjectId((long)1230005533);
		
		model.addAttribute("currentProject" , project);
		return "home";
	}
}
