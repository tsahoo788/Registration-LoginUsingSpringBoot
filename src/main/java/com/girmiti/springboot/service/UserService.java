package com.girmiti.springboot.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.girmiti.springboot.entity.User;
import com.girmiti.springboot.web.dto.UserRegistrationDto;


public interface UserService extends UserDetailsService{
	public User save(UserRegistrationDto registrationDto);
}
