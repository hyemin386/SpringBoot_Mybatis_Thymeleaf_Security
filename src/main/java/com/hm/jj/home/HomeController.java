package com.hm.jj.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/admin")
	public void admin() {
		System.out.println("Admin User");
	}
	
	@GetMapping("/member")
	public void member() {
		System.out.println("member User");
	}
}
