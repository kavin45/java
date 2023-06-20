package string;
import java.util.Scanner;

import java.util.Arrays;
import java.util.Comparator;

public class bike {//implements Comparable<bike>{
	private String name;
	private String model;
	private String engine;
	private String speed ;
	private String mileage;
	private int price;
	

	public bike(String name, String model, String engine, String speed, String mileage, int price) {
		super();
		this.name = name;
		this.model = model;
		this.engine = engine;
		this.speed = speed;
		this.mileage = mileage;
		this.price = price;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public String getEngine() {
		return engine;
	}


	public void setEngine(String engine) {
		this.engine = engine;
	}


	public String getSpeed() {
		return speed;
	}


	public void setSpeed(String speed) {
		this.speed = speed;
	}


	public String getMileage() {
		return mileage;
	}


	public void setMileage(String mileage) {
		this.mileage = mileage;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "bike [name=" + name + ", model=" + model + ", engine=" + engine + ", speed=" + speed + ", mileage="
				+ mileage + ", price=" + price + "]";
	}


	public static void main(String[] args) {
		bike b1=new bike("Royal enfield","Classic 350","Air cooled ","120km","32km",193000);
		bike b2=new bike("Honda","Highness 350","SI engine ","120km","38km",200000);
		bike b3=new bike("Yamaha","Mt15","liquid cooled ","130km","50km",197000);
		bike b4=new bike("KTM","Duke 200","liquid cooled ","157km","30km",225000);
		bike box[]= {b1,b2,b3,b4};
		System.out.println("before sorting");
		for(bike i :box)
		{
			System.out.println(i);
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("pls enter you option ");
		int n = sc.nextInt();
		Comparator c= null;
		switch( n) {
		case 1: {
			c = new mileage_sort_bike();
			break;}
		case 2: {
			c = new price_sort_bike();
			break;
		}
		case 3: {
			c = new name_sort_bike();
			break;
			}
		default : {
			System.out.println("pls enter valid option");
		}
		}
		Arrays.sort( box,c );
		System.out.println("after sorting");
		for( bike b: box) {
			System.out.println(b);
		}
	}
	
	// sorting by mileage
		
		//   public int compareTo(bike o) {
		  
		//  return this.getMileage().compareTo(o.getMileage()); }
		 
	//sort by price
		/* public int compareTo(bike o) {
			 
			 if( this.getPrice()> o.getPrice()) {
				 return 1;
			 }
			 else if( this.getPrice()< o.getPrice()) {
				 return -1;
			 }
			 else 
				 return 0;
				 }
				 */

}
