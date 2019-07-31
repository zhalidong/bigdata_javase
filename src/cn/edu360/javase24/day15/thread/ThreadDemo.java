package cn.edu360.javase24.day15.thread;

public class ThreadDemo {
	
	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0;i<10;i++){
					System.out.println("我爱你祖国"+i);
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0;i<10;i++){
					System.out.println("我爱毛主席"+i);
				}
			}
		});
		
		t1.start();
		t2.start();
		for(int i=0;i<10;i++){
			System.out.println("我爱周总理"+i);
		}
		
		
		
	}
	
}
