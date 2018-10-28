package com.yan.springMVC;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
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
}
