package com.course.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.course.entity.UsersEntity;
import com.course.model.UserEntity;
import com.course.model.UserVo;
import com.course.repository.UsersRepository;

@Service
public class LoginService {
	
	@Autowired
	private UsersRepository usersRepository;
	
	public boolean checkLogin(UserVo userVo) {
		
		UsersEntity user = usersRepository.findByUsername(userVo.getUsername());
		
		if(user == null) {
				return false;
			}
		return user.getPassword().equals(userVo.getPassword());
	}
	
	public boolean registerUser(UserVo userVo) {

	    UsersEntity existUser = usersRepository.findByUsername(userVo.getUsername());
	    
	    if(existUser != null) {
	    	return false; //帳號已存在
	    }
	    
	    UsersEntity user = new UsersEntity();
	    
	    user.setUsername(userVo.getUsername());
	    user.setPassword(userVo.getPassword());
	    user.setEmail(userVo.getEmail());

	    usersRepository.save(user);
	    System.out.println("Service:"+ userVo);
	    return true;
	}
	

}
