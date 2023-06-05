package concepts;

public class Bank_Encapsulation {
private	int bal;
	//double roi;
	void set_bal(int amt)
	{
		bal=bal+amt;
		System.out.println("Succesfully Deposited");
	}
	void debit(int amt)
	{
		bal=bal-amt;
		System.out.println("Successfully Debited");
	}
	int get_bal()   //void get_bal()
	{
	    return bal; //	System.out.println("balance = " +bal);
	}
	

}
