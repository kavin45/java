package concepts;

public class Kilometer_to_meter 
{
	public static void main(String args[])
	{
		Kilometer_to_meter obj=new Kilometer_to_meter ();
		obj.km_m(1.5);
		obj.m_km(500);		
	}
	public void km_m( double n)
	{
		double a=n;
		double km=a*1000;
		System.out.println("given kilometer = "+a+"  kilometer to meter = "+km);
		
		
	}
	public void m_km( double n)
	{
		double a=n;
		double m=a/1000;
		System.out.println("given meter = "+a+"  meter to kilometer = "+m);
		
		
	}


}
