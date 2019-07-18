package com.collectionsite.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.collectionsite.model.Movie;
import com.collectionsite.service.MovieService;

@Controller
@RequestMapping("/movie")
public class MovieController
{
	@Autowired
	MovieService movieService;
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ModelAndView getMovie(@PathVariable("id") int id)
	{
		Movie movie = movieService.findMovie(id);	
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("movie", movie);	
		mav.setViewName("movieInfos");
		return mav;
	}
}
