package concepts;
//method overloading or static poly or compile time
public class Method_overloading {
	
	static  void sum(int x, int y) 
	  { 
	    int s = x + y; 
	    System.out.println("Sum of two numbers: " +s); 
	  } 
  static	void sum(int x, int y, int z) 
	{ 
	   int s = x + y + z; 
	   System.out.println("Sum of three numbers: " +s); 
	  } 
 static	void sum(double x,double y)
	{
		double s= x + y;
		 System.out.println("Sum of two numbers: " +s); 
		
	}
	void sum(int x,double y)
	{
		double s= x + y;
		 System.out.println("Sum of two numbers: " +s); 
		
	}
	public static void main(String[] args) 
	{ 
	  Method_overloading obj = new Method_overloading(); 
	   sum(20, 10); 
	   sum(5.5,6.5);
	   sum(10, 20, 30); 
	   obj.sum(5,6.5);
	   
	  } 
	}


