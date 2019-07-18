package com.collectionsite.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.collectionsite.dao.UserRepository;
import com.collectionsite.model.User;

@Service
@Transactional
public class UserServiceImpl implements UserService
{
	@Autowired
	UserRepository userRepository;
	
	@Override
	public void createUser(User user) 
	{
		userRepository.create(user);
	}
}
