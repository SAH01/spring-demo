package com.reliable.y;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
//@Component 说明这个被被Spring接管，注册到了容器中
@Component
public class User {
	private String name;
	@Override
	public String toString() {
		return "com.reliable.y.User{" +
				"name='" + name + '\'' +
				'}';
	}

	public String getName() {
		return name;
	}
	@Value("靠谱杨")
	public void setName(String name) {
		this.name = name;
	}
}
