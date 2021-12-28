package com.reliable.y;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
//@Component 注解 这是一个组件
@Component
@Scope("prototype")
public class User {
	public String name;
	@Value("靠谱杨")
	public void setName(String name) {
		this.name = name;
	}
}
