package Simple;
import concepts.My_info;
import java.lang.String;
public class Run  {

	public static void main(String args[])
	{
	   
		My_info obj=new My_info();
		obj.Location();
	    obj.work_location();
		System.out.println("Atm pin number = "+obj.atm_pin);
		System.out.println("My age = "+obj.age);
		System.out.println("My account balance = "+obj.bank_balance);
	}
	}



