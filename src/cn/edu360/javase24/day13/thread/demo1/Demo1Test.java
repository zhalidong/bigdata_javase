package cn.edu360.javase24.day13.thread.demo1;

import org.junit.Test;
/**
 * 写多线程的四部曲
 * 1.将需要用多线程方式执行的逻辑  写入一个runnable实现类中
 * 2.创建出这个runnable实现类的对象
 * 3.利用这个runnable对象构造出n个thread线程
 * 4.将这n个thread启动(thread.start())
 * 
 * 
 * @author Administrator
 *
 */
public class Demo1Test {
	
	public static void main(String[] args) {
		Demo1 demo1 = new Demo1("张三");
		Demo2 demo2 = new Demo2();
//		demo1.run(); 	//这样调  只是用单线程执行以下方法
		
		
		//构造一个线程 指定要执行的逻辑
		Thread thread1 = new Thread(demo1);
		Thread thread2 = new Thread(demo1);
		Thread thread3 = new Thread(demo1);
		Thread thread4 = new Thread(demo2);
		Thread thread5 = new Thread(demo2);
		
		//启动线程 将这5个线程以多线程的方式同时运行
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
		
	}
	
}
