package com.yang.main;

import java.util.List;

import com.yang.dao.UserDao;
import com.yang.entiy.User;

public class Main {

	public static void main(String[] args) {
		UserDao dao = new UserDao();
		List<User> list = dao.getUserList();
		
		for(User user : list) {
			System.out.println("이름: "+user.getName() + ", 나이: " + user.getAge() + ", 점수: " + user.getScore());
		}
		
		
	}
	
}
