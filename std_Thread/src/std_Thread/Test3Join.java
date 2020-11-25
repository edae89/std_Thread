package std_Thread;

import java.util.ArrayList;

//join메소드를 활용하여 모든 thread가 종료된 후에 main메소드를 종료시키자.
public class Test3Join extends Thread{
	
	int seq;
	
	public Test3Join(int seq) {
		this.seq = seq;
	}
	
	public void run() {
		System.out.println(this.seq+" thread start.");
		try {
			Thread.sleep(1000);
		}catch(Exception e) {
			
		}
		System.out.println(this.seq+" thread end.");
	}
	

	public static void main(String[] args) {
		ArrayList<Thread> threads = new ArrayList<>();
		for(int i=0; i<10; i++){
			Thread t = new Test3Join(i);
			t.start();
			threads.add(t);
		}
		
		for(int i=0; i<threads.size(); i++) {
			Thread t = threads.get(i);
			try {
				t.join();
			}catch(Exception e) {
				
			}
		}
		System.out.println("main end.");
	}

}
