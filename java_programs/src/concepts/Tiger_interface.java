package concepts;

public class Tiger_interface implements Interface_mammal{
	
	
		public void eat()
		{
			System.out.println("eat");
		}
		public void sleep()
		{
			System.out.println("sleep");
		}
		public static void main(String args[])
		{
			Interface_mammal t=new Tiger_interface();
			t.sleep();
			t.eat();
	}
	

}
