package com.collectionsite.dao;

import java.util.List;

import com.collectionsite.model.Movie;

public interface MovieRepository 
{
	public List<Movie> findAll();
	public Movie findById(int id);
	void create(Movie movie);
	Movie update(Movie movie);
	void delete(int id);
}
