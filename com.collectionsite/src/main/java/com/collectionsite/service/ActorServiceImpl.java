package com.collectionsite.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.collectionsite.dao.ActorRepository;
import com.collectionsite.model.Actor;

@Service
@Transactional
public class ActorServiceImpl implements ActorService
{
	@Autowired
	ActorRepository actorRepository;
	
	@Override
	public void createActor(Actor actor) 
	{
		actorRepository.create(actor);
	}
}
