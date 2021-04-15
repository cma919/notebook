package com.cwpark.notebook.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {
	@RequestMapping
	public String welcome(Model model) {
		model.addAttribute("greeting", "박철우 노트");
		model.addAttribute("tagline", "지금 당신의 기분은?");
		return "notebook";
	}
}
