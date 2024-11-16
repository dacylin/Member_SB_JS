package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.demo.model.Member;

@Mapper
public interface MemberMapper {
	@Select("select * from member where username=#{username} and password=#{password}")
	List<Member> findByUsernameAndPassword(String username,String password);
	
	@Select("select * from member")
	List<Member> findAll();
	

}
