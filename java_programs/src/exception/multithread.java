package exception;

public class multithread extends Thread {
	
	public void run() { // Run Method
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println("New thread created = " + i);
				Thread.sleep(500);
			}
		}
		catch (InterruptedException e) {

			System.out.println("Currently executing thread is interrupted");
		}
		System.out.println("Currently executing thread run is terminated");
	}

	public static void main(String args[]) throws InterruptedException {

		multithread t1 = new multithread();
		multithread t2 = new multithread();
		t1.start();
		Thread.sleep(500);
		t2.start();
        t1.join();
		t2.join();
		System.out.println("completed");

	}
}