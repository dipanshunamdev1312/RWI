package multithreading;
class MyThread3 extends Thread{
	public void start()
	{
		System.out.println("Start Method");
		}
	public void run() {
		System.out.println("run method");
	}
}


public class P4 {

	public static void main(String[] args) {
		MyThread3 t = new MyThread3();
		t.start();
		System.out.println("main thread");

	}

}
