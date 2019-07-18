package com.collectionsite.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.collectionsite.model.User;
import com.collectionsite.service.UserService;

@Controller
public class UserController 
{
	@Autowired
	UserService userService;
	
	@RequestMapping( value = "/register", method = RequestMethod.GET)
	public ModelAndView registerPage()
	{
		ModelAndView mav = new ModelAndView();
		mav.setViewName("register");
		return mav;
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String register(User user)
	{
		userService.createUser(user);
		return "redirect:/login.html";
	}
}