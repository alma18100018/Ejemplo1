package com.Alma.Ejamplo1MVC.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Demo {
	
	@GetMapping("/demo/")
	public String Index()
	{
		return "demo/index";
	}

}
