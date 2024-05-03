package multithreading;


	class MyRunnable1 implements Runnable{
		public void run() {
			for(int i=0; i<10; i++) {//Job of Thread
				System.out.println("Child Thread");//executed by child Thread
			}
		}
	}
	
	public class P7 {
		public static void main(String[] args) {
		MyRunnable1 r = new MyRunnable1();
		Thread t = new Thread();//r is target Runnable
		t.start();
		for(int i=0; i<10; i++) {
			System.out.println("Main Thread");//executed by main Thread
		}

	}

}
