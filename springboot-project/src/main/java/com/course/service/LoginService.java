package com.course.service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
	public boolean checkLogin(String username, String password) {
		if(username.equals("aaa")&& password.equals("111")) {
			return true;
		}else {
			return false;
		}
	}
	
//	public boolean registeUser(UserVo userVo) {
//		System.out.println("Service:"+userVo);
//		UsersEntity entity = new UsersEntity;
//	}
}
