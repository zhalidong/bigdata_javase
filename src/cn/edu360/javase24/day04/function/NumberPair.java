package cn.edu360.javase24.day04.function;

import java.util.ArrayList;

public class NumberPair {
	public int a;
	public int b;
	
	public int sum(){
		int sum=this.a+this.b;
		return sum;
	}
	
	//用来对一个list排序
	public void sort(ArrayList<Integer> list){
		for(int i=0;i<list.size()-i;i++){
			for(int j=0;j<list.size()-i-1;j++){
				if (list.get(j)>list.get(j+1)) {
					int tmp = list.get(j);
					list.set(j, list.get(j+1));
					list.set(j, tmp);
					
				}
			}
		}
	}
	
	//用来打印一个list
	public void print(ArrayList<Integer> list){
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
	}
	
	
	
}
