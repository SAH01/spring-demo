package com.reliable.y;

public class Client {
	public static void main(String[] args) {
		Host host = new Host();
		//代理角色一般会比真实角色多一些操作
		Proxy proxy = new Proxy(host);
		proxy.rent();
		proxy.seeHouse();
		proxy.fare();
		proxy.makeht();
	}
}
