package exception;

import java.util.InputMismatchException;
import java.util.Scanner;


public class run_time {
	public static void main(String[] args) {
		run_time obj=new run_time();
		obj.run();
	}
	public void run()
	{
		try
		{
		Scanner s=new Scanner(System.in);
		System.out.println("enter first number");
		int a=s.nextInt();
		System.out.println("enter second  number");
		int b=s.nextInt();
		int c;
		c=a/b;
		System.out.println("divide = "+c);
			int d[]=null;
			//System.out.println(d[0]);//nullpointer exception
			//String q[]= {"abc"};
			//System.out.println(q[8]);//indexoutofbound exception
		  //  String r="abc";  
		  //  int i=Integer.parseInt(r);//NumberFormatException  
		 // creating an object
            Object o = new Object();
           
            // type casting the object o to string which
            // give the classcasted exception because we
            // type cast an parent type to its child type.
            String y = (String)o;
           
            System.out.println(s);//classcastexception
		}
		catch(ClassCastException e)
		{
			System.err.println("classcast exception occured");
		}
		catch(ArithmeticException e)
		{
			System.err.println("arithematic exception occured");
		}
		catch(InputMismatchException e)
		{
			System.err.println("Input mismatch exception occured");
		}
	    catch(IndexOutOfBoundsException e)
		{
	    	System.err.println("index out of bound exception occured");
		}
		catch(NumberFormatException e)
		{
			System.err.println("number format exception occured");
		}
	
		catch(NullPointerException e)
		{
			System.err.println("null pointer exception occured");
		}
		catch(Exception e)
		{
			System.err.println("error occured");
	    }
	finally
	{
		System.out.println("end program");
	}
	}

}
