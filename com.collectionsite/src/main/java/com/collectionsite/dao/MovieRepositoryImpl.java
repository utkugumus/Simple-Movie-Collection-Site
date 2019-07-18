package com.collectionsite.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.collectionsite.model.Movie;

@Repository
public class MovieRepositoryImpl implements MovieRepository
{
	@PersistenceContext
	EntityManager entityManager;
	
	@Override
	public List<Movie> findAll() 
	{
		return entityManager.createQuery("from Movie", Movie.class).getResultList();
	}
	
	@Override
	public Movie findById(int id) 
	{
		return entityManager.find(Movie.class, id);
	}

	@Override
	public void create(Movie movie) 
	{
		
	}

	@Override
	public Movie update(Movie movie) 
	{
		return null;
	}

	@Override
	public void delete(int id) 
	{
		entityManager.remove(entityManager.getReference(Movie.class, id));
	}	
}
