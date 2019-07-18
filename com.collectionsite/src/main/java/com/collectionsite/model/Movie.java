package com.collectionsite.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "movie")
public class Movie 
{
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "release_year")
	private String releaseYear;
	
	@Column(name = "type")
	private String type;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "media")
	private String media;
	
	@ManyToOne
	@JoinColumn(name = "users_username")
	private User usersUsername;
	
	@OneToMany(mappedBy = "movie", cascade = CascadeType.ALL)
	private Set<MovieActor> movieActors = new HashSet<>();
	
	public int getId() 
	{
		return id;
	}
	
	public void setId(int id) 
	{
		this.id = id;
	}
	
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public String getReleaseYear() 
	{
		return releaseYear;
	}
	
	public void setReleaseYear(String releaseYear) 
	{
		this.releaseYear = releaseYear;
	}
	
	public String getType() 
	{
		return type;
	}
	
	public void setType(String type) 
	{
		this.type = type;
	}
	
	public String getDescription() 
	{
		return description;
	}
	
	public void setDescription(String description) 
	{
		this.description = description;
	}
	
	public String getMedia() 
	{
		return media;
	}
	
	public void setMedia(String media) 
	{
		this.media = media;
	} 

	public User getUsersUsername() 
	{
		return usersUsername;
	}

	public void setUsersUsername(User usersUsername) 
	{
		this.usersUsername = usersUsername;
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
		return "Movie [id=" + id + ", name=" + name + ", releaseYear=" + releaseYear + ", type=" + type
				+ ", description=" + description + ", media=" + media + ", usersUsername=" + usersUsername + "]";
	}	
}
