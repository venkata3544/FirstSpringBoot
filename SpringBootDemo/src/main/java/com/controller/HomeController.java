package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="api")
public class HomeController {
	
	
	@RequestMapping("/hello")
	@ResponseBody
	
	public String hello()
	{

	System.out.println("WELCOME TO sPRING WEB");
     return"WELCOME TO sPRING WEB";
	
	}
}
