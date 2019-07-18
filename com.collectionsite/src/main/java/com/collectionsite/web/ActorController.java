package com.collectionsite.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.collectionsite.model.Actor;
import com.collectionsite.service.ActorService;

@Controller
public class ActorController 
{
	@Autowired
	ActorService actorService;
	
	@RequestMapping(value = "/newActor", method = RequestMethod.GET)
	public ModelAndView newActorPage()
	{
		ModelAndView mav = new ModelAndView();
		mav.setViewName("newActor");
		return mav;
	}
	
	@RequestMapping(value = "/newActor", method = RequestMethod.POST)
	public ModelAndView newActor(Actor actor)
	{	
		ModelAndView mav = new ModelAndView();
		
		String errorMessage ="Kayıt başarılı bir şekilde oluşturuldu";
		
		try 
		{
			actorService.createActor(actor);
		} 
		catch (Exception e) 
		{
			errorMessage = "Kayıt bir hatadan dolayı oluşturulamadı";
		}
		finally 
		{
			mav.addObject("errorMessage", errorMessage);
			mav.setViewName("newActor");
		}	
		return mav;
	}
}
