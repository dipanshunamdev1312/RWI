package multithreading;
class MyThread10 extends Thread {
	public void run() {
	System.out.println("run method executed by Thread : "+Thread.currentThread().getName());
	}
}
public class P10 {

	public static void main(String[] args) {
		MyThread10 t= new MyThread10();
		t.start();
		System.out.println("main method executed by Thread : "+Thread.currentThread().getName());
	}

}

