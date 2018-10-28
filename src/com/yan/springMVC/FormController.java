package com.yan.springMVC;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/studentFrom")
public class FormController {
	
	//define a controller method to show the initial form 
	@RequestMapping("/showForm")
	public String showForm () {
		return "form";
	}
	
	//define a controller method to process the form
	@RequestMapping("/processForm") 
	public String processForm() {
		return "formResult";
	} 
	
	
	// ===== METHOD 1: use the request.getParameter =====
	
	// define a controller that make used of request and model object 
	// return the form data in upper case 
	@RequestMapping("/processFormUpper") 
	public String processFormUpper(HttpServletRequest request, Model model) {
		
		// extract the studentName field from the form 
		String name = request.getParameter("studentName"); 
		
		// convert the name to all upper case 
		name = name.toUpperCase();
		
		// create the result 
		String upper = "after toUpper " + name;
		
		String lower = "CAP " + name;
		
		lower = lower.toLowerCase();
		
		// add the message to model 
		
		// model.addAttribute("#name of the attritube ", #value of the attritube)
		model.addAttribute("toUpperResult", upper);
		
		// adding multiple attritube 
		model.addAttribute("toLowerResult", lower);
		
		return "formResult";
		
	} 
	
	
	// ===== METHOD 2: use the @RequestParam =====
	
	// define a controller that make used of request and model object 
	// return the form data in upper case 
	@RequestMapping("/processFormUpperAnnotation") 
	public String processFormUpperAnnotation(@RequestParam("studentName") String name, //extract the studentName from the from as a parameter 
			Model model) {
		
		// convert the name to all upper case 
		name = name.toUpperCase();
		
		// create the result 
		String upper = "after toUpper using @param :" + name;
		
		String lower = "CAP " + name;
		
		lower = lower.toLowerCase();
		
		// add the message to model 
		
		// model.addAttribute("#name of the attritube ", #value of the attritube)
		model.addAttribute("toUpperResult", upper);
		
		// adding multiple attritube 
		model.addAttribute("toLowerResult", lower);
		
		return "formResult";
		
	} 
	
	
}
