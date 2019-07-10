package cn.edu360.javase24.day02.array;
/**
 * 数组  倒叙打印遍历
 * 数组 有一个常用的属性 length
 * @author Administrator
 *
 */
public class ArrayDemo2 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		//造数据
		for(int i=0;i<arr.length;i++){
			arr[i]=i;
		}
		
		//打印数据
		for(int i=arr.length-1;i>=0;i--){
			System.out.println(arr[i]);
		}
		
		
		int i=0;
		while(i<arr.length){
			System.out.println(arr[i]);
			i++;
		}
		
	}
}
