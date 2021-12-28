package com.reliable.config;
import com.reliable.y.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
//YConfig 也会被Spring托管
@Configuration
//@Configuration 代表这是一个配置类，就和之前看的beans.xml是一样的
@ComponentScan("com.reliable")
public class YConfig {
	/*
	1.这里注册了一个bean，相当于一组bean标签
	2.方法的名字相当于之前bean标签里的id
	3.方法的返回值相当于bean标签中的class
	 */
	@Bean
	public User getUser(){
		return new User();  //要注入到bean的对象
	}
}
