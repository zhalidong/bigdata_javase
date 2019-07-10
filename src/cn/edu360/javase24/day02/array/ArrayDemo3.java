package cn.edu360.javase24.day02.array;
/**
 * 求数组中最大值和最小值
 * @author Administrator
 *
 */
public class ArrayDemo3 {
	public static void main(String[] args) {
		//造数据
		int[] arr = new int[5];
		arr[0]=10;
		arr[1]=20;
		arr[2]=25;
		arr[3]=18;
		arr[4]=16;
		
		//实现需求
		//求最大值
		int tmp=arr[0];
		for(int i=1;i<arr.length;i++){
			if (arr[i]>tmp) {
				tmp=arr[i];
			}
		}
		System.out.println("最大值为"+tmp);
		
		//最小值
		tmp=arr[0];
		for(int i=1;i<arr.length;i++){
			if (arr[i]<tmp) {
				tmp=arr[i];
			}
		}
		System.out.println("最小值为"+tmp);
		
		
		
		
	}
}
