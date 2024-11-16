package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.MemberMapper;
import com.example.demo.model.Member;
import com.example.demo.service.MemberService;

@Service
public class MemberServiceImpl implements MemberService{
	@Autowired
	MemberMapper mp;

	@Override
	public Member Login(String username, String password) {
		Member m=null;
		List<Member> l=mp.findByUsernameAndPassword(username, password);
		
		if(l.size()!=0)
		{
			m=l.get(0);
		}
		
		return m;
	}
	
	@Override
	public List<Member> selectAllMember() {
		return mp.findAll();
	}

}
