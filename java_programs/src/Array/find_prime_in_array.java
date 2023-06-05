package Array;

public class find_prime_in_array 
{
	public static void main(String args[])
	{
		find_prime_in_array obj=new find_prime_in_array();
		Static.size();
		Static.element();
		Static.display();
		obj.prime();
	}
	public void prime()
	{
		int b[]=Static.a;
		
		
		int i;
		int count2=0;
		for( i=0;i<b.length;i++)
		{
			int count=0;
			for(int j=2;j<=b[i]/2;j++)
			{
			if(b[i]%j==0)
			{
				count++;
			}
		    }
		    if(count==0)
		    {
			count2++;
		    }
	     }
		System.out.println();
		System.out.println("Prime numbers present : "+count2);
	int prime[]=new int[count2];
	int temp=0;
	for( i=0;i<b.length;i++)
	{
		int count3=0;
		
		for(int j=2;j<=b[i]/2;j++)
		{
			
		if(b[i]%j==0)
		{
			count3++;
		 }
	}
		if(count3==0)
	    {
			prime[temp]=b[i];
			temp++;
	    }
	}
	System.out.println();
	System.out.println("Prime numbers in array : ");
		for( i=0;i<prime.length;i++)
		{
			System.out.print(" "+prime[i]);
		}
	

}
}

