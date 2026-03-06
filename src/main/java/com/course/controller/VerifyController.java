package com.course.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.course.entity.UsersEntity;
import com.course.repository.UsersRepository;

@Controller
public class VerifyController {
	
	@Autowired
	private UsersRepository usersRepository;
	
	@GetMapping("/verify")
	public String verifyEmail(@RequestParam("token") String token) {
		
		UsersEntity user = usersRepository.findByVerificationToken(token);
		
		if(user == null) {
			return "Invalid verification token.";
		}
		
		user.setVerified(true);
		user.setVerificationToken(null);
		
		usersRepository.save(user);
		
		return "Email verified successfully!";
	}
	
	
}
