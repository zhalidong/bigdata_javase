package cn.edu360.javase24.day04.function;

import java.util.ArrayList;

/**
 * 写一个工具类listutils里面定义这几个工具方法
 * @author Administrator
 *
 */
public class ListUtils {
	
	//方法1：为传入的一个整数list进行排序 sort
	public static void sort(ArrayList<Integer> list){
		for(int i=0;i<list.size()-1;i++){
			for(int j=0;j<list.size()-i-1;j++){
				if (list.get(j)>list.get(j+1)) {
					Integer tmp = list.get(j);
					list.set(j, list.get(j+1));
					list.set(j+1, tmp);
					
				}
			}
		}
		
	}
	
	//方法2：从传入的一个整数list中找到其中的最大值 并返回 getmax
	public static int getMax(ArrayList<Integer> list){
		int tmp = list.get(0);
		for(int i=1;i<list.size();i++){
			if (list.get(i)>tmp) {
				tmp=list.get(i);
			}
		}
		return tmp;
	}
	
	
	//方法3：从传入的一个整数list中找到其中的最小值 并返回 getmin
	public static int getMin(ArrayList<Integer> list){
		int tmp = list.get(0);
		for(int i=1;i<list.size();i++){
			if (list.get(i)<tmp) {
				tmp=list.get(i);
			}
		}
		return tmp;
	}
	
	//方法4：从传入的一个整数list中求出平均值 并返回 getavg
	public static float getAvg(ArrayList<Integer> list){
		int sum = 0;
		for(int i=0;i<list.size();i++){
			sum+=list.get(i);
		}
		
		float avg = (float)sum/list.size();
		
		return avg;
	}
	
	
	
	
	
}
