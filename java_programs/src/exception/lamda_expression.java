package exception;

public class lamda_expression {
	
		public static void main(String[] args) throws InterruptedException {
			Runnable R = () ->
			{
					try {
						for (int i = 0; i <=5; i++) {
							System.out.println(" Hello " );
							Thread.sleep(500);
						}
					}
					catch (InterruptedException e) {

						System.out.println("Currently executing thread is interrupted");
					}
			};
					
		//	R.run();
		
		Runnable s = () ->
		{
		try {
			for (int i = 0; i <=5; i++) {
				System.out.println(" Hai ");
				Thread.sleep(500);
			}
		}
		catch (InterruptedException e) {

			System.out.println("Currently executing thread is interrupted");
		}
		
	};

//s.run();

		Thread t1 = new Thread(R);
		Thread t2 = new Thread(s);
		t1.start();
	t2.start();
		
		}
}
