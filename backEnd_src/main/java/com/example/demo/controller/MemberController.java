package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Member;
import com.example.demo.service.impl.MemberServiceImpl;

import jakarta.servlet.http.HttpSession;

@RestController
public class MemberController {
	@Autowired
	MemberServiceImpl msi;
	
	@PostMapping("/Login")
	public ModelAndView goLogin(String username,String password,HttpSession session)
	{
		Member m=msi.Login(username, password);
		
		if(m!=null)
		{
			session.setAttribute("M", m);
			return new ModelAndView("loginSuccess");
		}
		else
		{
			return new ModelAndView("loginError");
		}
		
	}

}
