package std_Thread;

import java.util.ArrayList;

//Thread를 extends 하지 않고 Runnable을 implements하도록 변경(interface 구현)
public class Test4Runnable implements Runnable {
	
	int seq;
	public Test4Runnable(int seq) {
		this.seq = seq;
	}
	
	@Override
	public void run() {
		System.out.println(this.seq+" thread start.");
		try {
			Thread.sleep(1000);
		}catch(Exception e) {
			
		}
		System.out.println(this.seq+" Thread end.");
		
	}
	
	public static void main(String[] args) {
		ArrayList<Thread> threads = new ArrayList<>();
		
		for(int i=0; i<10; i++) {
			Thread t = new Thread(new Test4Runnable(i));
										
			t.start();
			threads.add(t);
		}
		
		for(int i=0; i<threads.size(); i++){
			Thread t = threads.get(i);
			try {
				t.join();
				
			}catch(Exception e) {
				
			}
		}
		System.out.println("main end");
		
	}



}
