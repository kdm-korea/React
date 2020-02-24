package com.services.webservice.controller.SignInUp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Controller
public class LoginController {

	@GetMapping("/")
	public String main() {
		return "index";
	}
	
	@GetMapping("/logout")
	public String logout() {
		
		return "redirect:/";
	}
	
	// 접근 거부 페이지
	@GetMapping("/user/denied")
	public String dispDenied() {
		return "/denied";
	}

	// 어드민 페이지
	@GetMapping("/admin")
	public String dispAdmin() {
		return "/admin";
	}
}