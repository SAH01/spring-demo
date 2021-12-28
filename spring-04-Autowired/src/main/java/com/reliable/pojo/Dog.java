package com.reliable.pojo;
public class Dog {
	public String dogname;

	@Override
	public String toString() {
		return "Dog{" +
				"dogname='" + dogname + '\'' +
				'}';
	}

	public String getDogname() {
		return dogname;
	}

	public void setDogname(String dogname) {
		this.dogname = dogname;
	}

	public void shout() {
		System.out.println("wang~");
	}
}