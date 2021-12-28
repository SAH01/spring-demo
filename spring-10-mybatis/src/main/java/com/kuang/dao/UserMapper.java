package com.kuang.dao;

import com.kuang.pojo.User;

import java.util.List;

public interface UserMapper {
	public List<User> selectUser();
}