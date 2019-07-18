package com.collectionsite.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "authorities")
public class Authorities implements Serializable
{
	private static final long serialVersionUID = 1L;

	@Column(name ="authority")
	private String authority;
	
	@Id
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "username", referencedColumnName = "username")
	private User username;

	public String getAuthority() 
	{
		return authority;
	}

	public void setAuthority(String authority) 
	{
		this.authority = authority;
	}
	
	public User getUsername() 
	{
		return username;
	}

	public void setUsername(User username) 
	{
		this.username = username;
	}

	@Override
	public String toString() 
	{
		return "Authorities [authority=" + authority + ", username=" + username + "]";
	}
}
