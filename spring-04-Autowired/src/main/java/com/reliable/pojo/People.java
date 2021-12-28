package com.reliable.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class People {
	//如果显式定义了Autowired的required属性为false，说明这个对象可以为NULL
	@Autowired
	private Cat cat;
	@Autowired
	@Qualifier("dog1")
	private Dog dog;
	private String str;
	public Cat getCat() {
		return cat;
	}

	public void setCat(Cat cat) {
		this.cat = cat;
	}

	public Dog getDog() {
		return dog;
	}

	public void setDog(Dog dog) {
		this.dog = dog;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	@Override
	public String toString() {
		return "People{" +
				"cat=" + cat.toString() +
				", dog=" + dog.toString() +
				", str='" + str + '\'' +
				'}';
	}
}
