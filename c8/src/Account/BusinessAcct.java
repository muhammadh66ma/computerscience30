package Account;


import java.text.NumberFormat;

public class BusinessAcct extends Account

{ 
	
	private final int W = 10;

	public BusinessAcct (double bal, String fName, String lName, String str, String city, String st, String zip) {
	super(bal,  fName, lName, str,  city,  st,  zip);
	}
	
	
	
	public void withdraw(double x)
	{
		if(super.getBalance() >= x)
		{
			if(x >500)
			{
				super.deposit(super.getBalance()-x);
			}
			else
			{
				super.deposit(super.getBalance()-x -W);
			}
	}
	}
	
	
}
