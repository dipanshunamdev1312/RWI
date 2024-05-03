package multithreading;


	class MyRunnable implements Runnable{
		@Override
		public void run() {
			for(int i=0; i<10; i++) {//Job of Thread
				System.out.println("Child Thread");//executed by child Thread
			}
		}
	}
	
	public class P6 {
		public static void main(String[] args) {
		MyRunnable r = new MyRunnable();
		Thread t = new Thread(r);//r is target Runnable
		t.start();
		for(int i=0; i<10; i++) {
			System.out.println("Main Thread");//executed by main Thread
		}

	}

}
