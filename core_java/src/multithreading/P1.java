package multithreading;

class MyThread extends Thread {//define a thread
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("child thread"); //job of thread
		}
	}//Executed by child thread
}

public class P1 {

	public static void main(String[] args) {//main Thread
		MyThread t = new MyThread();// Thread instantiation
		t.start(); // starting of a Thread.
		for(int i=0; i<10; i++) {
			System.out.println("Main Thread");
		}//executed by main Thread

	}

}


