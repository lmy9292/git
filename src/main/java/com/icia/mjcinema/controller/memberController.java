package com.icia.mjcinema.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.icia.mjcinema.service.memberService;

@Controller
public class memberController {

	@Autowired
	private memberService memberservice;
	
	private ModelAndView mav;
	
	@Autowired
	private HttpSession session;
		
	@RequestMapping (value="/Members/MemberJoinForm.jsp")
	public String member() {
		return "memberjoin";
	}
	
	
	
	
}
