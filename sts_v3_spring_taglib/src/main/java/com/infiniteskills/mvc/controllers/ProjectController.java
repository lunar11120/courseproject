package com.infiniteskills.mvc.controllers;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.infiniteskills.mvc.data.model.Project;
import com.infiniteskills.mvc.data.model.ProjectService;
import com.infiniteskills.mvc.data.model.StudentManager;

@Controller
@RequestMapping("/project")
public class ProjectController {
	
	@Autowired
	private ProjectService projectService;
	
	@Autowired
	private StudentManager stu;

	
	@RequestMapping(value="/find")
	public String find(Model model) {
		model.addAttribute("projects",this.projectService.findAll());
		return "projects";
	}
	
	@RequestMapping(value="/student")
	public String findStudent(Model model) {
		//List<Student> modelstudent = new LinkedList<Student>();
		//modelstudent = StudentManager.createStudent();
		
		model.addAttribute("students",this.stu.createStudent());
		return "student";
	}
	
	@RequestMapping(value="/{projectId}")
	public String findProject(Model model , @PathVariable("projectId") long projectId) {
		model.addAttribute("project", this.projectService.find(projectId));
		return "project";
	}

	@RequestMapping(value="/add",method=RequestMethod.GET)
	public String addProject(HttpSession session){
		session.setAttribute("token", "Juckkapun");
		System.out.println("invoking addProject");
		return "project_add";
	}

//	@RequestMapping(value="/add", method=RequestMethod.POST)
//	public String saveProject(HttpServletRequest request ,HttpSession session){
//		System.out.println(session.getAttribute("token"));
//		System.out.println(request.getParameter("name"));
//		System.out.println("invoking saveProject");
//		return "project_add";
//	}
//	
//	//Other @Requestparameter	
//	@RequestMapping(value="/add", method=RequestMethod.POST)
//	public String saveProject(@RequestParam("name") String name ,@RequestParam("sponsor") String sponsor01 ,HttpSession session){
//		System.out.println(session.getAttribute("token"));
//		System.out.println(name);
//		System.out.println(sponsor01);
//		System.out.println("invoking saveProject");
//		return "project_add";
//	}
//	
//	
//	//Data blinding Request get ALL
//	@RequestMapping(value="/add", method=RequestMethod.POST)
//	public String saveProject(@ModelAttribute Project project){
//		System.out.println(project);
//		System.out.println("invoking saveProject");
//		return "project_add";
//	}
//	
//	
//	@RequestMapping(value="/add", method=RequestMethod.POST,params={"type=multi"})
//	public String saveMultiYearProject(){
//		System.out.println("invoking Multi Years Project");
//		return "project_add";
//	}
//	
//	@RequestMapping(value="/add", method=RequestMethod.POST, params={"type=multi","special"})
//	public String saveSpecialProject(){
//		System.out.println("invoking Specual AMJUNG Project");
//		return "project_add";
//	}



}
