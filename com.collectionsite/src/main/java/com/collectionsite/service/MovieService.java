package com.collectionsite.service;

import java.util.List;

import com.collectionsite.model.Movie;

public interface MovieService
{
	public List<Movie> findMovies();
	public Movie findMovie(int id);
	void createMovie(Movie movie);
	void updateMovie(Movie movie);
	void deleteMovie(int id);
}
