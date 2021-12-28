package com.reliable.service;

import com.reliable.dao.UserDao;
import com.reliable.dao.UserDaoImpl;
import com.reliable.dao.UserDaoMysqlImpl;

public class UserServiceImpl implements UserService {
	private UserDao userDao;

	//利用set实现动态实现值的注入
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	public void getUser() {
		userDao.getUser();
	}
}
