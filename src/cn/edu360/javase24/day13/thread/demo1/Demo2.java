package cn.edu360.javase24.day13.thread.demo1;

public class Demo2 implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<10;i++){
		System.out.println("哦..."+i);
		}
	}
}
