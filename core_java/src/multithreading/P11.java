package multithreading;
class MyThread11 extends Thread {
	
}
public class P11 {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getPriority()); // 5
//		Thread.currentThread().setPriority(17); RE : IlligalArgumentException
		Thread.currentThread().setPriority(7);// line 1 
		System.out.println(Thread.currentThread().getPriority());//7
		
		MyThread11 t = new MyThread11();
		System.out.println(Thread.currentThread().getPriority());//7
		
	}

}


