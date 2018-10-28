package com.yan.springMVC;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// Step1: use the @Controller to create a controller 
@Controller
public class HomeController {
	// Step 2: Create a controller method 
	@RequestMapping("/")
	public String showPage () {
		return "home";
	}
	
	
}
