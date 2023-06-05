package concepts;

public class Bank_Run_constructor {
	public static void main(String args[])
	{
		Bank_constructor lajeem=new Bank_constructor();
		Bank_constructor kavin=new Bank_constructor("kavin",95462164);
		Bank_constructor senthil=new Bank_constructor(321,"senthil",55000,766543);
		Bank_constructor ragul=new Bank_constructor(542,"ragul","0001g",875753,150000);
		
		lajeem.dispaly();
		kavin.dispaly();
		senthil.dispaly();
		ragul.dispaly();
		lajeem.setname("dinesh");
		lajeem.dispaly();
		kavin.getbalance();
		senthil.getbalance();
		ragul.getbalance();
		kavin.loan();
		senthil.loan();
		ragul.loan();
		kavin.credit_card();
		senthil.credit_card();
		ragul.credit_card();
		
		
		
	}

}
