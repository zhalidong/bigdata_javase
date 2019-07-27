package cn.edu360.javase24.day10.exception.demo;

public class ListTool {
	/**
	 * 本方法在运行时可能会发生两类异常
	 * 1.Integer.parseInt(index) 这句话可能会发生异常：数字格式异常NumberFormatException
	 * 2.arr[]可能会发生数组角标越界异常	ArrayIndexOutofBoundsException
	 * 
	 * @param arr
	 * @param index
	 * @return
	 */
	//告诉调用者这个方法有可能会产生异常 需要声明 throws
	public int getIntFromArr(int[] arr,String index)throws Exception{
		//把字符串index转成整数
		return arr[Integer.parseInt(index)];
	}
	
}
