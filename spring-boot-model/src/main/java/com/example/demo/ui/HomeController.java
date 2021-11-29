package com.example.demo.ui;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping(value = "/home.do")
	public String home(Model model) {
		System.out.println("-------------------------");
		return "home";
	}
	@GetMapping(value = "/index.do")
	public String index(Model model) {
		System.out.println("-------------------------");
		return "index";
	}
}
