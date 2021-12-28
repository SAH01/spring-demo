package com.reliable.y;

public class Proxy implements Rent {
	private Host host;

	public Proxy(Host host) {
		this.host = host;
	}
	public Proxy(){}

	public void rent() {
		host.rent();
	}
	//看房
	public void seeHouse(){
		System.out.println("中介带客户看房子！");
	}
	//收中介费
	public void fare(){
		System.out.println("收中介费！");
	}
	//签合同
	public void makeht(){
		System.out.println("签合同！");
	}
}
