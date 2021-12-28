package com.reliable.demo2;
import com.reliable.demo1.Rent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInvocationHandler implements InvocationHandler {
	private Object target;
	//代理谁，设置被代理的真实角色
	public void setTarget(Object target) {
		this.target = target;
	}

	//生成代理类，重点是第二个参数，获取要代理的抽象角色！之前都是一个角色，现在可以代理一类角色
	public Object getProxy(){
		return Proxy.newProxyInstance(this.getClass().getClassLoader(),
				target.getClass().getInterfaces(),this);
	}
	// proxy : 代理类 method : 代理类的调用处理程序的方法对象.
	// 处理代理实例上的方法调用并返回结果，代理者要做什么
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		seeHouse();
		//核心：本质利用反射实现！target 是被代理的类
		Object result = method.invoke(target, args);
		fare();
		return result;
	}
	//看房
	public void seeHouse(){
		System.out.println("带房客看房");
	}
	//收中介费
	public void fare(){
		System.out.println("收中介费");
	}
}