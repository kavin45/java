package collection;

import java.util.HashMap;
import java.util.Map;

public class map {

	public static void main(String[] args) {
		map obj=new map();
		obj.mapping();
	}

	public void mapping() {
		 Map<Integer, String> n = new HashMap<Integer, String>();
		 n.put(1,"steve");
		 n.put(2,"peter");
		 n.put(3,"jhon");
		 n.put(4,"mike");
		 n.put(5,"harry");
		 System.out.println("details : "+n);
	        // Replacing the values
	        n.replace(1,"Nick");
	        n.replace(4,"lara");
	        System.out.println("New Map: " +n);
	        // Remove elements from the map
	         n.remove(4,"lara");
	        System.out.println("After Removed Value: " +n);
		    // Access keys of the map
	        System.out.println("Keys: " + n.keySet());

	        // Access values of the map
	        System.out.println("Values: " + n.values());

	        // Access entries of the map
	        System.out.println("Entries: " + n.entrySet());

	}
	

}
