package cn.edu360.javase24.day15.thread;

public class ThreadDemo2 extends Thread{

	@Override
	public void run() {
		for(int i=0;i<10;i++){
			System.out.println(i);
		}
	}
}
