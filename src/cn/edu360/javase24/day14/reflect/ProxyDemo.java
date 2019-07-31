package cn.edu360.javase24.day14.reflect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyDemo {

	public static void main(String[] args) {
		//构造一个LoginService接口的动态代理对象
		LoginService o=(LoginService)Proxy.newProxyInstance(LoginService.class.getClassLoader(), new Class<?>[]{LoginService.class},new MyInvocationHandler() {
			
		});
		//然后调用动态代理对象上的方法  这些方法一定是接口中已经定义的方法 
		//但是这些方法的执行逻辑 并不在接口的实现类LoginServiceImpl中
		//而是在MyInvocationHandler的invoke方法中
		o.say();
		o.eat("三明治");
	}
	
	
}
