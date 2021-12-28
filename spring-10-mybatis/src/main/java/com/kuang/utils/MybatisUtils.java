package com.kuang.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MybatisUtils {
	//从SqlSessionFactory中获得SqlSession的实例，SqlSession完全包含了SQL命令的执行方法
	private static SqlSessionFactory sqlSessionFactory;
	static {
		try {
			String resource = "mybatis-config.xml";
			//SqlSessionFactoryBuilder去创建sqlSessionFactory 创建完就不再需要它了
			//sqlSessionFactory 可以理解为数据库连接池
			//sqlSessionFactory 创建 sqlSession
			InputStream inputStream = Resources.getResourceAsStream(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	//获取SqlSession连接
	public static SqlSession getSession(){
		return sqlSessionFactory.openSession(true);
	}
}