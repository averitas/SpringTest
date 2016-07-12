package com.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

@Controller
public class MultiActionCtlr {

	@RequestMapping("/")
	public ModelAndView deft(){
		String msg = "Welcome default controller";
		return new ModelAndView("multipage","msg",msg);
	}
	
	@RequestMapping("/add")
	public ModelAndView add(){
		String msg = "Welcome Add controller";
		return new ModelAndView("multipage","msg",msg);
	}
	
	@RequestMapping("/list")
	public ModelAndView list(){
		String msg = "Welcome List controller";
		return new ModelAndView("multipage","msg",msg);
	}
}
