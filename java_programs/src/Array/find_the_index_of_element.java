package Array;

import java.util.Scanner;

public class find_the_index_of_element {
	public static void main(String args[])
	{
		index();
	}
	static void index()
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the array Size : ");
	int n = sc.nextInt();
	int a[] = new int[n];
    boolean flag=false;
	System.out.println("please enter " + n + " array value");
	for (int i = 0; i < a.length; i++) {
		a[i] = sc.nextInt();
	}
	
		System.out.println();
		System.out.println("Display the Array elements : ");
		for(int i=0;i<a.length;i++)
		{
			System.out.println((i+1)+".Element = "+a[i]);
		}
		System.out.println("enter array element : ");
		int c=sc.nextInt();
		sc.close();
		int i;
		for( i=0;i<a.length;i++)
		{
			if (a[i] == c) {
				System.out.println(c+" element is in the array of the index : " + i);
				flag = true;
			}
		}
			if (flag == false) {
				System.out.println(c+" element is not in the array of the index : ");
			}

	
		}


}
