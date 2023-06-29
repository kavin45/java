package string;
import Array.Static;
import java.util.Scanner;


public class int_arr_dup_scan {
	public static void main(String[] args) {
		int_arr_dup_scan obj=new int_arr_dup_scan();
		obj.dup();
	}
  public void dup()
  {
	  Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array Size : ");
		int size = sc.nextInt();
		int a[] = new int[size];
        System.out.println("please enter " + size + " array value");
		for (int i = 0; i < a.length; i++) 
		{
			int count=0;
			int n = sc.nextInt();
			for(int j=0;j<a.length;j++)
			{
				if(a[j]==n)
				{  
					count++;
					break;
				}
			}
				if(count==0)
				{
					a[i]=n;
				}
			
		}
			System.out.println();
			System.out.println("Display the Array elements : ");
			for(int i=0;i<a.length;i++)
			{
				System.out.println((i+1)+".Element = "+a[i]);
			}
  }
}
