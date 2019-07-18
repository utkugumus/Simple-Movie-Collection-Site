package com.collectionsite.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Repository;

import com.collectionsite.model.Authorities;
import com.collectionsite.model.User;

@Repository
public class UserRepositoryImpl implements UserRepository 
{
	@PersistenceContext
	EntityManager entityManager;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	@Override
	public void create(User user) 
	{
		Authorities authorities = new Authorities();
		authorities.setAuthority("ROLE_USER");
		authorities.setUsername(user);
		
		user.setEnabled(true);
		user.setAuthorities(authorities);
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		
		entityManager.persist(user);
		entityManager.persist(authorities);
	}
}
