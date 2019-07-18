package com.collectionsite.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "actors_has_movie")
public class MovieActor implements Serializable
{
	private static final long serialVersionUID = 1L;

	@Id
    @ManyToOne
    @JoinColumn(name = "movie_id")
	private Movie movie;
	
	@Id
    @ManyToOne
    @JoinColumn(name = "actors_id")
	private Actor actor;
	
	@Column(name = "role")
	private String role;

	public Movie getMovie() 
	{
		return movie;
	}

	public void setMovie(Movie movie) 
	{
		this.movie = movie;
	}

	public Actor getActor() 
	{
		return actor;
	}

	public void setActor(Actor actor) 
	{
		this.actor = actor;
	}

	public String getRole() 
	{
		return role;
	}

	public void setRole(String role) 
	{
		this.role = role;
	}	
}
