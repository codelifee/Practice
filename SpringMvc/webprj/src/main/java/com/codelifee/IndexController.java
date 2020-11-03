package com.codelifee;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class IndexController implements Controller {
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		System.out.println("Hello");
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("data", "Hello Spring MVC~");
		mv.setViewName("index.jsp");
		
		return mv;
	}
}