package cn.edu360.javase24.day15.thread.safe;

public class SellRunnable implements Runnable{
	Kucun kucun ;
	
	
	
	public SellRunnable(Kucun kucun) {
		this.kucun = kucun;
	}



	@Override
	public void run() {
			while(true){
				//加一把锁  表示锁住的逻辑同时只能让一个线程执行
				synchronized (SellRunnable.class) {
				if(kucun.num>0){
					try {
						Thread.sleep(50);
						kucun.num=kucun.num-1;
						System.out.println(kucun.num);
					} catch (InterruptedException e) {
					}
				}
				
			}	
		}
		
	}

}
