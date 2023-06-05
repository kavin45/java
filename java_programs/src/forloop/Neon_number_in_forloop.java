package forloop;

public class Neon_number_in_forloop {
		
		public static void main(String args[])
		{
			Neon_number_in_forloop object=new Neon_number_in_forloop();
		     object.neon(9);
		}
		public void neon(int n)
		{
		 int num=n;
		  int sum=0;
		  int squre=n*n;
		 for(int i=0;squre>i;squre=squre/10)
		{
		int a=squre%10;
		sum=sum+a;
		}
		if(sum==num)
		{
		System.out.println("Neon");
		}
		else
		{
		System.out.println("not neon");
		}
		}
}




