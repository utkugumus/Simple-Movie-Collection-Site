package com.collectionsite.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.collectionsite.model.Actor;

@Repository
public class ActorRepositoryImpl implements ActorRepository
{
	@PersistenceContext
	EntityManager entityManager;
	
	@Override
	public void create(Actor actor) 
	{
		entityManager.persist(actor);
	}
}
