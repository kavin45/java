package string;

import java.util.Comparator;

public class name_sort_bike implements Comparator {
	public int compare(Object o1, Object o2) {
		bike b1=(bike)o1;
		bike b2=(bike)o2;
	
	  return b1.getName().compareTo(b2.getName()); 
	  }

}
