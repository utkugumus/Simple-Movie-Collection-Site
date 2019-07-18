package com.collectionsite.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.collectionsite.dao.MovieRepository;
import com.collectionsite.model.Movie;

@Service
public class MovieServiceImpl implements MovieService
{
	@Autowired
	MovieRepository movieRepository;

	@Override
	public List<Movie> findMovies() 
	{
		return movieRepository.findAll();
	}

	@Override
	public Movie findMovie(int id) 
	{
		return movieRepository.findById(id);
	}

	@Override
	public void createMovie(Movie movie) 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateMovie(Movie movie) 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteMovie(int id) 
	{
		movieRepository.delete(id);
	}	
}
