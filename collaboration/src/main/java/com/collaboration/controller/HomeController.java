package com.collaboration.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String index()
	{
		System.out.println(" I am from controller");
		return "index";
	}
}
