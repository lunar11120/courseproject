package com.infiniteskills.mvc.data.model;

import java.util.LinkedList;
import java.util.List;

public class StudentManager {
	
	public List<Student> createStudent(){
		
		List<Student> s01 = new LinkedList<Student>();
		
		Student no01 = new Student();
		no01.setId(201);
		no01.setName("Vorrapong");
		no01.setAge(16);
		

		Student no02 = new Student();
		no02.setId(202);
		no02.setName("Nucharee");
		no02.setAge(18);
		
		Student no03 = new Student();
		no03.setId(204);
		no03.setName("Ayikapor");
		no03.setAge(19);
		
		//Add 2 student to List
		s01.add(no01);
		s01.add(no02);
		s01.add(no03);
		
		return s01;
	}

}
