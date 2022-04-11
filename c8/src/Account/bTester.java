package Account;

public class bTester {

	public static void main(String[] args) 
	{
		
		//Retriving and displaying info
		PersonalAcct bank = new PersonalAcct(6900,"Muhammad", "Hafeez", "Alberta","Calgary", "Covemeadow", "T1X 1S3");
		BusinessAcct B =  new BusinessAcct(99999, "Mr.Abdulkadir","Abdalla", "Alberta", "Fort Mac","Apple wood", "T3X 4G8");
		
		System.out.println(bank.toString() + "\n");
		
		System.out.println(B.toString());
		
	
		
		}
}

/*Screen Dump 
Muhammad Hafeez
Alberta
Calgary, Covemeadow  T1X 1S3
Current balance is $6,900.00

Mr.Abdulkadir Abdalla
Alberta
Fort Mac, Apple wood  T3X 4G8
Current balance is $99,999.00
*/