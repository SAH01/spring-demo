package com.reliable.pojo;

public class User1 {
	private String name;
	public User1(String name){
		System.out.println("User1的有参构造！");
		this.name=name;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void show(){
		System.out.println("name:" + name);
	}
}
