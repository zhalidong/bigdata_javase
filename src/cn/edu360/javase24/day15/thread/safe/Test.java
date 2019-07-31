package cn.edu360.javase24.day15.thread.safe;

public class Test {
	
	public static void main(String[] args) {
		Kucun kucun = new Kucun();
		
		
		for(int i=0;i<10;i++){
			new Thread(new SellRunnable(kucun)).start();
		}
		
	}	
}	
