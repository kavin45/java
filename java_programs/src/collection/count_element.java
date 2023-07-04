package collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class count_element {
	public static void main(String[] args) {
		count_element obj=new count_element();
		obj.count();
	}

	public void count() {
		List<String> list = Arrays.asList("B","A","A","C","B","A");
		
		 Set<String> w = new LinkedHashSet<>(list);
		 
	        for (String s: w) {
	            System.out.println(s + ": " + Collections.frequency(list, s));
	        }
	}

}
