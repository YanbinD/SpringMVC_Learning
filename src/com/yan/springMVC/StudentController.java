package com.yan.springMVC;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.yan.springMVC.beans.Student;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	
	//STEP 3-1
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		
		// 1. create a new student object 
		Student theStudent = new Student();
		
		// 2. add the student object to the model attritube 
		theModel.addAttribute("student", theStudent);
		
		return "student-form";
	}
	

	// ===== USE the spring form tag =====
	@RequestMapping("/processFormTag") 
	public String processFormTag(@ModelAttribute("student") Student theStudent) {
		
		System.out.println("the student is :" + theStudent.getFirstName() + " " + theStudent.getLastName());
		return "student-confirmation";
	} 
	
		
}
