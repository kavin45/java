package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class student_list implements Comparable<student_list> {
	String name;
	int mark;

	public student_list(String name, int mark) {
		super();
		this.name = name;
		this.mark = mark;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

	@Override
	public String toString() {
		return "student_list [name=" + name + ", mark=" + mark + "]";
	}

	public static void main(String[] args) {
		List<student_list> list = new ArrayList<student_list>();
		list.add(new student_list("Krishna", 97));
		list.add(new student_list("hari", 65));
		list.add(new student_list("mathan", 87));
		list.add(new student_list("peter", 44));
		list.add(new student_list("jhon", 56));
		System.out.println("Before sorting: ");
		for (student_list e : list) {
			System.out.println(e);
		}

		Collections.sort(list);

		System.out.println("After sorting: ");
		for (student_list e : list) {
			System.out.println(e);
		}
	}

	/*
	 * public int compareTo(student_list o) { return
	 * this.getName().compareTo(o.getName()); }
	 */
	@Override
	public int compareTo(student_list o) {

		if (this.getMark() > o.getMark()) {
			return 1;
		} else if (this.getMark() < o.getMark()) {
			return -1;
		} else
			return 0;

	}

}
