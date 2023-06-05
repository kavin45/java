package concepts;

public class Bank_run {
	public static void main(String args[])
	{
		Bank_Encapsulation b1=new Bank_Encapsulation();
		b1.set_bal(500);
		b1.set_bal(250);
		b1.debit(700);
		System.out.println(b1.get_bal());//b1.get_bal();


	

	}

}
