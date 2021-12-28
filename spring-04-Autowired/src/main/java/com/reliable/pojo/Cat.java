package com.reliable.pojo;

public class Cat {
	private String catname;

	public String getCatname() {
		return catname;
	}

	public void setCatname(String catname) {
		this.catname = catname;
	}

	@Override
	public String toString() {
		return "Cat{" +
				"catname='" + catname + '\'' +
				'}';
	}

	public void shout() {
		System.out.println("miao~");
	}
}