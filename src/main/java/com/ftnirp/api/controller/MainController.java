package com.ftnirp.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("/map")
	public String map() {
		return "map";
	}
	
	
	@RequestMapping("/about")
	public String showAbout() {
		return "about";
	}
	
	
	@RequestMapping("/team")
	public String showTeam() {
		return "team";
	}
	
	
	@RequestMapping("/works")
	public String showWorks() {
		return "works";
	}
	
	
	@RequestMapping("/news")
	public String showNews() {
		return "news";
	}
	
}
