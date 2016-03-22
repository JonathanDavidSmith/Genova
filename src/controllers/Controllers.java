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
	@RequestMapping(path="averageAge.do", method = RequestMethod.GET)
	public ModelAndView calculateAverageAge()
	{
		ModelAndView mv = new ModelAndView("average.jsp");
		mv.addObject("Average", dao.calculateAverageAge());
		return mv;
	}
	@RequestMapping(path="alphabetical.do", method = RequestMethod.GET)
	public ModelAndView alphabetical()
	{
		ModelAndView mv = new ModelAndView("alphabetical.jsp");
		mv.addObject("alphabetical", dao.alphabetical());
		return mv;
	}
//	When implemented, This will allow the number of duplicated first names to be seen.  
//	Utilizing the duplicates() method in FileData.java.
//	The method has not yet been completed, hence the commented out code. 
	
	@RequestMapping(path="duplicates.do", method = RequestMethod.GET)
	public ModelAndView duplicates()
	{
		ModelAndView mv = new ModelAndView("duplicates.jsp");
		mv.addObject("duplicates", dao.duplicates());
		return mv;
	}
	
	
}
