package string;

import java.util.Comparator;

public class price_sort_bike implements Comparator{
	public int compare(Object o1, Object o2) {
		bike b1=(bike)o1;
		bike b2=(bike)o2;
		 
		 if( b1.getPrice()> b2.getPrice()) {
			 return 1;
		 }
		 else if( b1.getPrice()< b2.getPrice()) {
			 return -1;
		 }
		 else 
			 return 0;
			 }

}
