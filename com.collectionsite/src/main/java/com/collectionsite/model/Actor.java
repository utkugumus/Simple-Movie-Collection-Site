package com.collectionsite.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "actors")
public class Actor 
{
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "full_name")
	private String fullName;
	
	@OneToMany(mappedBy = "actor", cascade = CascadeType.ALL)
	private Set<MovieActor> movieActors = new HashSet<>();
	
	public int getId() 
	{
		return id;
	}
	
	public void setId(int id) 
	{
		this.id = id;
	}
	
	public String getFullName() 
	{
		return fullName;
	}
	
	public void setFullName(String fullName) 
	{
		this.fullName = fullName;
	}

	public Set<MovieActor> getMovieActors() 
	{
		return movieActors;
	}

	public void setMovieActors(Set<MovieActor> movieActors) 
	{
		this.movieActors = movieActors;
	}

	@Override
	public String toString()
	{
		return "Actor [id=" + id + ", fullName=" + fullName + "]";
	}
}
