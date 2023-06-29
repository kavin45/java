package string;

import java.util.Scanner;
import java.util.Objects;

public class emp1_user_defined_scanner {
	 private int emp_id;
     private String name;
     private int age;
     private long aadhar;
	public emp1_user_defined_scanner(int emp_id, String name, int age, long aadhar) {
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
		emp1_user_defined_scanner other = (emp1_user_defined_scanner) obj;
		return aadhar == other.aadhar && age == other.age && emp_id == other.emp_id && Objects.equals(name, other.name);
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size : ");
		int size=sc.nextInt();
		
		emp1_user_defined_scanner o[]=new emp1_user_defined_scanner[size];
		
		System.out.println("enter employee details");
		
		for(int i=0;i<size;i++)
		{
		 int id=sc.nextInt();
		 String name=sc.next();
		 int age=sc.nextInt();
		 long adhar=sc.nextLong();
		
		 emp1_user_defined_scanner obj=new emp1_user_defined_scanner(id,name,age,adhar);
		 boolean flag=true; 
			 for(int j=0;j<size;j++)
	         {
			   if(obj.equals(o[j]))
	           {
	        	 flag=false; 
	        	 break;
	           }
	         }
			 	if(flag==true)
			 	{
			 		o[i]=obj;
			 	}
		}
		
		for(emp1_user_defined_scanner i:o)
		{
			System.out.println(i);
		}
		
	}
	
}
