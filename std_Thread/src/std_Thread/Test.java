package std_Thread;
	//Thread 클래스를 상속한 후, start메소드를 통해 run메소드를 실행 
public class Test extends Thread{
	
	public void run() {
		System.out.println("thread run");
	}
	
	public static void main(String[] args) {
		Test t = new Test();
		t.start();
		
	}

}
