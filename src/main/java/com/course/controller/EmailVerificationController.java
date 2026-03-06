package com.course.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.course.entity.UsersEntity;
import com.course.repository.UsersRepository;

@Controller
public class EmailVerificationController {
	
	@Autowired
	private UsersRepository usersRepository;
	
	@GetMapping("/verify")
	public String verifyEmail(@RequestParam("token") String token) {
		
		UsersEntity user = usersRepository.findByVerificationToken(token);
		
		if(user == null) {
			return "verify-fail";
		}
		
		// 檢查 token 是否過期
		if(user.getTokenExpireTime().isBefore(LocalDateTime.now())) {
			return "token-expired";
		}
		
		user.setVerified(true);
		user.setVerificationToken(null);
		user.setTokenExpireTime(null);
		
		usersRepository.save(user);
		
		return "verify-success";
	}
	
	
}
