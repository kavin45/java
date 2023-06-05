package concepts;

public class Bank_constructor 
{
	private int acc_no;
	private String name;
	private  String IFCE_code;
	private int pan_no;
	private int pincode;
	private int Bank_balance;
	

	Bank_constructor( ){
		this.acc_no=0;
		this.name=null;
		this.IFCE_code=null;
		this.pan_no=0;
		this.pincode=0;
		this.Bank_balance=0;
	}
		
		Bank_constructor(String name,int pan_no)
		{
			this.name=name;
			this.pan_no=pan_no;
			
		}
		Bank_constructor(int acc_no ,String name,int Bank_balance,int pan_no)
		{
			this.acc_no=acc_no;
			this.name=name;
			this.Bank_balance=Bank_balance;
			this.pan_no=pan_no;
		}
		Bank_constructor(int acc_no ,String name,String IFCE_code,int pan_no,int Bank_balance)
		{
			this.acc_no=acc_no;
			this.name=name;
			this.IFCE_code=IFCE_code;
			this.pan_no=pan_no;
			this.Bank_balance=Bank_balance;
		}
		void setname(String name)
		{
			this.name=name;
		}
		void setpan_no(int pan_no) {
			this.pan_no=pan_no;
		}
		void getbalance()
		{
			System.out.println("Bank balance = "+Bank_balance);
		}
		void dispaly()
		{
			System.out.println(this.name+" "+this.acc_no+" "+this.pan_no+" "+this.pincode+" "+this.IFCE_code+" "+this.Bank_balance);
		}
		void loan()
		{
			if(this.Bank_balance>=50000)
			{
				System.out.println("Eligible for loan");
			}
			else
			{
				System.out.println("not Eligible for loan");
			}
		}
			void credit_card()
			{
				if(this.Bank_balance>=100000)
				{
					System.out.println("Eligible for credit card ");
				}
				else
				{
					System.out.println("Not eligible for credit card");
				}
			
		}
		
	}
	
	

