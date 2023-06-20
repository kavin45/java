package Array;
import java.util.Scanner;

public class find_previous_and_next_element_of_given_number {

	public static void main(String args[])
	{
		find_previous_and_next_element_of_given_number obj=new find_previous_and_next_element_of_given_number();
		Static.size();
		Static.element();
		Static.display();
		obj.next();
	}
	public void next()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("please enter a number : ");
		int x=s.nextInt();
		boolean flag=false;
		for(int i=0;i<Static.a.length;i++)
		{ 
				 if(Static.a[i]==x)
				{
					 flag=true;
					 if(i!=0 && i!=Static.a[Static.a.length-1])
					 {
						 
							System.out.println("prevoius number : " +Static.a[i-1]);
							System.out.println("next number : "+Static.a[i+1]);
					 }
					 else if(i==0)
					 {
						 System.out.println("only next element present here : "+Static.a[i+1]);
					 }
					 else if(i==Static.a[Static.a.length-1])
					 {
						 System.out.println("only prevoius element present here : "+Static.a[i-1]);
						 
			     }
				}
		}
				  if(flag==false)
				{
					 System.out.println("element not present in index : "+x);
				}
				  s.close();
	
	}

}

