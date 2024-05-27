package Java8;


//class MyRunnable implements Runnable{
//	public void run() {
//		for(int i=0; i<=10; i++) {
//			System.out.println("Child Thread");
//		}
//	}
//}


public class Demo9 {

	public static void main(String[] args) {
		
//		MyRunnable m1 = new MyRunnable();
		
		Runnable r = ()-> {
			for(int i=0; i<10; i++) {
				System.out.println("Child Thread");
			}
		};
		Thread t= new Thread(r);
		t.start();
		for(int i=0; i<10; i++) {
			System.out.println("Main Thread");
		}
	}

}

// Lambda Expression with multiThreading Concept.