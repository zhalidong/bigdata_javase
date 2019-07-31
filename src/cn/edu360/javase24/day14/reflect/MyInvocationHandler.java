package cn.edu360.javase24.day14.reflect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler{

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		if(method.getName().equals("eat")){
			System.out.println("我一点都不喜欢吃"+args[0]);
		}
		if(method.getName().equals("speak")){
			System.out.println("动态代理对象");
		}
		if(method.getName().equals("say")){
			if(method.getParameterTypes().length>0){
				
			}else {
				
			}
		}
		
		
		return null;
	}

}
