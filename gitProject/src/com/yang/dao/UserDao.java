package com.yang.dao;

import java.util.ArrayList;
import java.util.List;

import com.yang.entiy.User;

public class UserDao {

	List<User> list = null;
	
	public UserDao() {
		list = new ArrayList<>();
		list.add(new User("홍길동", 17, 60.3));
		list.add(new User("이순신",18,100.0));
		list.add(new User("강호동",15,90.3));
	}
	public List<User> getUserList() {
		return list;
		
	}
}
