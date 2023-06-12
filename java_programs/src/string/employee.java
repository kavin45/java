package string;

import java.util.Objects;

public class employee {
      private int emp_id;
      private String name;
      private int age;
      private long aadhar;
	public employee(int emp_id, String name, int age, long aadhar) {
		super();
		this.emp_id = emp_id;
		this.name = name;
		this.age = age;
		this.aadhar = aadhar;
	}
	
	public int getEmp_id() {
		return emp_id;
	}
	
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public long getAadhar() {
		return aadhar;
	}
	public void setAadhar(long aadhar) {
		this.aadhar = aadhar;
	}
	@Override
	public String toString() {
		return "employee [emp_id=" + emp_id + ", name=" + name + ", age=" + age + ", aadhar=" + aadhar + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(aadhar, age, emp_id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		employee other = (employee) obj;
		return aadhar == other.aadhar && age == other.age && emp_id == other.emp_id && Objects.equals(name, other.name);
	}

	public static void main(String[] args) {
		employee ob1=new employee(001,"kavin",23,817354654);
		employee ob2=new employee(002,"guru",24,911335454);
		employee ob3=new employee(003,"sachin",28,234354654);
		employee ob4=new employee(004,"virat",23,976575465);
		employee ob5=new employee(005,"simbu",27,13741866);
		System.out.println(ob1.toString());
		System.out.println(ob2.toString());
		System.out.println(ob3.toString());
		System.out.println(ob4.toString());
		System.out.println(ob5.toString());
		System.out.println();
		System.out.println(ob1.hashCode());
		System.out.println(ob2.hashCode());
		System.out.println(ob3.hashCode());
		System.out.println(ob4.hashCode());
		System.out.println(ob5.hashCode());
		System.out.println();
		System.out.println(ob1.equals(ob2));
		System.out.println(ob1.equals(ob3));
		System.out.println(ob1.equals(ob4));
		System.out.println(ob1.equals(ob5));
		System.out.println(ob2.equals(ob3));
		

	}

}
