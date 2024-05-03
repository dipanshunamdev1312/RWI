package multithreading;
class MyThread9 extends Thread {
	
}
public class P9 {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		MyThread9 t = new MyThread9();
		System.out.println(t.getName());
		Thread.currentThread().setName("Dipanshu Namdev");
		System.out.println(Thread.currentThread().getName());
		System.out.println(10/0);
	}

}
