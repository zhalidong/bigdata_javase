package cn.edu360.javase24.day08.sortutil2;

import java.util.ArrayList;

//泛型 :没有具体指定哪个类型
public class SortUtil<T>{
	
	public void sort(ArrayList<T> list,BijiaoQi<T> bijiaoqi){
		for(int i=0;i<list.size()-1;i++){
			for(int j=0;j<list.size()-i-1;j++){
				boolean da = bijiaoqi.bijiao(list.get(j), list.get(j+1));
				if (da) {
					T tmp = list.get(j);
					list.set(j, list.get(j+1));
					list.set(j+1, tmp);
				}
				
			}
		}
		
		
		
	}
	
	
}
