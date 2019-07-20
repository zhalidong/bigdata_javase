package cn.edu360.javase24.day06.hashmapdemo;

import java.util.HashSet;

/**
 * 我给你一个字符串 "a,b,c,d,e,f,g,h,b,b,b,c,x,x,y,x,b"
写一个程序将这个字符串中的字母去重，将去重后的字母打印出来:
a
b
c
d
e
f
g
h
x
y
 * 
 * @author Administrator
 *
 */

public class 练习1 {
	
	public static void main(String[] args) {
		
		String str = "a,b,c,d,e,f,g,h,b,b,b,c,x,x,y,x,b";
		String[] words = str.split(",");
		
		HashSet<String> set = new HashSet<>();
		
		
		//把拆分后的数组		添加到set
		for(String tmp:words){
			set.add(tmp);
		}
		
		//打印出来
		for(String tmp:set){
			System.out.println(tmp);
		}
		
	}
	
}
