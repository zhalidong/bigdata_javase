package cn.edu360.javase24.day08.sortutil1;

import java.util.ArrayList;
//排序工具类
public class SortUtil {
	//BijiaoQi是一个比较接口
	public static void sort(ArrayList<User> uList,BijiaoQi bijiaoQi){
		for(int i=0;i<uList.size()-1;i++){
			for(int j=0;j<uList.size()-i-1;j++){
				//给第j个对象和第j+1对象给用户	用户告诉我  j是否比j+1大
				//用户的比较规则定义在BijiaoQi接口中
				boolean daxiao =  bijiaoQi.bijiao(uList.get(j),uList.get(j+1));
				if(daxiao){
					//调换位置
					User tmp = uList.get(j);
					uList.set(j, uList.get(j+1));
					uList.set(j+1, tmp);
					}
				}
			}
	}
}
