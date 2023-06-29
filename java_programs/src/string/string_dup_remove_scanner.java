package string;

import java.util.Scanner;

public class string_dup_remove_scanner {

	public static void main(String[] args) {
		string_dup_remove_scanner obj=new string_dup_remove_scanner();
		obj.remov();

	}
	public void remov()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array Size : ");
		int size = sc.nextInt();
		String a[] = new String[size];
        System.out.println("please enter " + size + " array value");
		for (int i = 0; i < a.length; i++) 
		{
			int count=0;
			String s=sc.next();
			for(int j=0;j<a.length;j++)
			{
				if(s.equals(a[j]))
				{
					count++;
					break;
				}
			}
			if(count==0)
			{
				a[i]=s;
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
