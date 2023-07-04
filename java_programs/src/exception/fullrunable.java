package exception;

 class One implements Runnable
{
	public synchronized void run() {
			try {
				for (int i = 0; i <=5; i++) {
					System.out.println(" Hello " );
					Thread.sleep(500);
				}
			}
			catch (InterruptedException e) {

				System.out.println("Currently executing thread is interrupted");
			}
			
		}
		
}

 class Two implements Runnable
{
      public synchronized void run() {
	try {
		for (int i = 0; i <=5; i++) {
			System.out.println(" Hai ");
			Thread.sleep(500);
		}
	}
	catch (InterruptedException e) {

		System.out.println("Currently executing thread is interrupted");
	}
	
}

}

public class fullrunable 
{
	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new One());
		Thread t2 = new Thread(new Two());
		t1.start();
		t2.start();
		
		
	}
}
