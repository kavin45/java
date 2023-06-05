package concepts;

public class Yamaha_overridding extends Bike_over_ridding 
	{
	static	public void gear() {
			System.out.println("Yamaha has 4 gear");
		}
	//static	public void engine()
		//{
		//	System.out.println("Yamaha has 2stroke engine");
		//}
	static	public void speed() {
			System.out.println("Yamaha has 150km speed");
		}
	static	public void weight()
		{
			System.out.println("Yamaha has 175kg weight");
		}
		/*public void tyre() {
			System.out.println("Yamaha has tube tyre");
		}
		public void breake() {
			System.out.println("Yamaha doesnt have disc breake");
		}*/
		public static void main(String args[])
		{
			Bike_over_ridding  y1=new Yamaha_overridding();//upcasting
			y1.gear();
			y1.engine();
			y1.speed();
			y1.weight();
			//y1.tyre();
			//y1.breake();
			
		}
	}


