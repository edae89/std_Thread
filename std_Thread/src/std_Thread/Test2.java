package std_Thread;

public class Test2 extends Thread {
	
	int seq;
	public Test2(int seq) {
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
		for(int i=0; i<10; i++) {
			Thread t = new Test2(i);
			t.start();
		}
		System.out.println("main end");
	}

}
//정리: thread는 순서에 상관없이 동시에 실행된다.
//		또한 모든 thread가 종료되기 전에 main메소드가 종료되었다. 이를 위해 필요한 메소드가 join