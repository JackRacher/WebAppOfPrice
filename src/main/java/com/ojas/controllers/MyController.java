package com.ojas.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

	@RequestMapping("myHome")
	public ModelAndView myhome() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("wish", "Welcome Pruthvi RAJ");
		mv.setViewName("myhome");
		return mv;
	}
	
//	@RequestMapping(value = "myhome", method = RequestMethod.POST)
//	public ModelAndView disp(HttpServletRequest request) {
//		String user = request.getParameter("user");
//		String upass = request.getParameter("upass");
//		ModelAndView mv = new ModelAndView();
//		if(user.equalsIgnoreCase("java") && upass.equalsIgnoreCase("ojas")) {
//			mv.addObject("st", "Valid User");
//		}
//		else {
//			mv.addObject("st", "Invalid User");
//		}
//		mv.setViewName("mypage");
//		return mv;
//	}
	
	@RequestMapping(value = "myhome", method = RequestMethod.POST)
	public ModelAndView disp(@RequestParam("user") String user, @RequestParam("upass") String upass ) {
		ModelAndView mv = new ModelAndView();
		if(user.equalsIgnoreCase("java") && upass.equalsIgnoreCase("ojas")) {
			mv.addObject("st", "Valid User");
		}
		else {
			mv.addObject("st", "Invalid User");
		}
		mv.setViewName("mypage");
		return mv;
	}
}
