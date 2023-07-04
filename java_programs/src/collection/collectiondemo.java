package collection;

import java.util.ArrayList;
import java.util.List;

public class collectiondemo {
@SuppressWarnings({ "unchecked", "removal", "rawtypes" })
public static void main(String[] args) {
	List l=new ArrayList();
	Integer i=new Integer(7);
	l.add(i);//add element 
	l.add("hai");
	l.add(true);
	l.add(5.5);
	l.add('c');
	System.out.println(l);
	l.addAll(l);//add elemnts to array list
	System.out.println(l);
	
	System.out.println(l.contains(i));//Returns true if this list contains the specified element.
	System.out.println(l.get(1));//Returns the element at the specified position in this list.
	System.out.println(l.indexOf(true));//Returns the index of the first occurrence of the specified element in this list
	System.out.println(l.remove(1));//remove specified index element
	System.out.println(l);
	System.out.println(l.set(1,"hello"));//add specified index element
	System.out.println(l);
	Object a[] = l.toArray();//convert array to object

	for(Object j: a) {
		System.out.println(j);
	}
	l.clear();//Removes all of the elements from this list.
	System.out.println(l.isEmpty());//Returns true if this list contains no elements.

	System.out.println(l);
}
}
