package multithreading;
 class MyThread1 extends Thread{
	public void run() {
		System.out.println("No-arg");
	}
	
	public void run(int i) {
		System.out.println("int-arg"); // overloaded method
	}
}
public class P2 {

	public static void main(String[] args) {
		MyThread1 t = new MyThread1();
		t.start();

	}

}

