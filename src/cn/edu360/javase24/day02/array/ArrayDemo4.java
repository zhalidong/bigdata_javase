package cn.edu360.javase24.day02.array;
/**
 * 利用数组对数据排序  冒泡排序
 * @author Administrator
 *
 */
public class ArrayDemo4 {
	public static void main(String[] args) {
		//造数据
		int[] arr = new int[5];
		arr[0]=30;
		arr[1]=60;
		arr[2]=40;
		arr[3]=50;
		arr[4]=20;
		
		//实现需求 冒泡排序
		for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr.length-i-1;j++){
				if(arr[j]>arr[j+1]){
					int tmp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=tmp;
				}
			}
		}
		
		
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		
		
		
	}
}
