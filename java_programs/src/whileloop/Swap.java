package whileloop;

public class Swap {

	public static void main(String args[])
	{
		Swap obj=new Swap();
		obj.check(2,5);
		
	}
	public void check(int a,int b)
	{
		 System.out.println("first = "+a);
		 System.out.println("second = "+b);;
        a=a*b; //2*5=10
        
        
        b=a/b; //10/5=2
        a=a/b; //10/2=5
        System.out.println("swaped given answer ");
       System.out.println("first = "+a);
       System.out.println("second = "+b);

		
	}
}
