package com.collectionsite.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.collectionsite.service.MovieService;

@Controller
public class CollectionSiteController 
{	
	@Autowired
	MovieService movieService;
	
	@RequestMapping(value = {"/", "/index.html"}, method = RequestMethod.GET)
	public ModelAndView index()
	{
		ModelAndView mav = new ModelAndView();
		mav.addObject("movies", movieService.findMovies());
		mav.setViewName("index");
		return mav;
	}
	
	@RequestMapping(value = "/login.html", method = RequestMethod.GET)
	public ModelAndView login()
	{
		ModelAndView mav = new ModelAndView();
		mav.setViewName("login");
		return mav;
	}
}
