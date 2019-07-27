package cn.edu360.javase24.day11.reflect;

public class Person {
	
	public void say(){
		System.out.println("说话了...");
	}
	public void eat(){
		System.out.println("吃饭了...");
	}
	
	public void eat(String food){
		System.out.println("吃饭了..."+food);
	}
	
	public void makeFriend(String name){
		System.out.println("我有男朋友了，名字叫:"+name);
	}
	
	
}
