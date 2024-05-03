package multithreading;

class MyThread6 extends Thread{

	@Override
	public void run() {
		System.out.println("Child Thread");
	}
}

public class P8 {

	public static void main(String[] args) {
		MyThread6 t= new MyThread6();
		Thread t1 = new Thread(t);
		t1.start();
		System.out.println("Main Thread");
	}
}
 
//Output 1: Child Thread 
//		   Main Thread
//
//2 . Main Thread
//	  Child Thread
//
//
//
//
//
