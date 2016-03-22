package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import nameAndAge.FileData;

@Controller
public class Controllers 
{
	@Autowired
	private FileData dao;
	
	@RequestMapping(path="names.do", method = RequestMethod.GET)
	public ModelAndView getPerson()
	{
		ModelAndView mv = new ModelAndView("display.jsp");
		mv.addObject("Names", dao.getPeople());
		return mv;
	}
	
	
}
