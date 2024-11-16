package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Member;
import com.example.demo.service.impl.MemberServiceImpl;

@RestController
public class MemberAPI {
	@Autowired
	MemberServiceImpl msi;
	
	@CrossOrigin
	@GetMapping("selectAllMember")
	public List<Member> findAll()
	{
		return msi.selectAllMember();
	}

}