package com.services.webservice.contorller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.services.webservice.service.ApiResponse;
import com.services.webservice.service.UserService;
import com.services.webservice.service.dto.UserSignUpDto;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
public class SignRestController {

	private UserService userService;
	
	@PostMapping("/signup")
	public ApiResponse signUp(@RequestBody UserSignUpDto signUpDto) {
		return userService.signUp(signUpDto);
	}
}
