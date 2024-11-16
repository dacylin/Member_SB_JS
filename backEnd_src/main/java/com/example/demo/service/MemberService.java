package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Member;

public interface MemberService {
	Member Login(String username,String password);
	List<Member> selectAllMember();

}
