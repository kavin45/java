package concepts;

public class Dollar_to_rupee {
	public static void main(String args[])
	{
		Dollar_to_rupee obj=new Dollar_to_rupee();
		obj.rupee(56);
	
	}
   public void rupee(double n)
   {
	   double a=n;
	   double rupee=a*82.125;
	   System.out.println("us dollars =  " +a  );
	   System.out.println("US to Indian rupee = "+rupee);
   }
}
