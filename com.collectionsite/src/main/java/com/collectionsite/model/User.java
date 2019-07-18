package com.collectionsite.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name ="users")
public class User 
{
	@Id
	@Column(name = "username")
	private String username;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "enabled")
	private boolean enabled;
	
	@OneToMany(mappedBy = "usersUsername")
	private Set<Movie> movies = new HashSet<>();
	
	@OneToOne(mappedBy = "username")
	private Authorities authorities;
	
	public String getUsername() 
	{
		return username;
	}
	
	public void setUsername(String username) 
	{
		this.username = username;
	}
	
	public String getPassword() 
	{
		return password;
	}
	
	public void setPassword(String password) 
	{
		this.password = password;
	}
	
	public boolean isEnabled() 
	{
		return enabled;
	}
	
	public void setEnabled(boolean enabled) 
	{
		this.enabled = enabled;
	}
	
	public Set<Movie> getMovies() 
	{
		return movies;
	}
	
	public void setMovies(Set<Movie> movies) 
	{
		this.movies = movies;
	}
	
	public Authorities getAuthorities() 
	{
		return authorities;
	}

	public void setAuthorities(Authorities authorities) 
	{
		this.authorities = authorities;
	}
	
	@Override
	public String toString() 
	{
		return "User [username=" + username + ", password=" + password + ", enabled=" + enabled + "]";
	}
}
