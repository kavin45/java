package Array;
import java.util.Scanner;

public class binary_search {
	public static void main(String args[])
	{
		binary_search obj=new binary_search();
		Static.size();
		Static.element();
		Static.display();
		Bubble_sort.acending();
		obj.binary();
	}
	public void binary()
	
	{
		Scanner s=new Scanner(System.in);
		System.out.println();
		System.out.println("Enter the number find : ");
		int n=s.nextInt();
		int b[]=Static.a;
		int lower=0;
		int higher=b.length;
		int middle=lower+higher/2;
		while(lower<higher)
		{
			if(b[middle]==n)
			{
				System.out.println(middle+" : index element in = "+b[middle]);
				break;
			}
			if(b[middle]<n)
			{
				lower=middle+1;
				middle=(lower+higher)/2;
			}
			if(b[middle]>n)
			{
				higher=middle-1;
				middle=(lower+higher)/2;
			}
			
		}

	}

}
