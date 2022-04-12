package PuckBothParts;
public class Hokey {

	public static void main(String[] args) 
	{
		
		Puck yPuck = new Puck(1.5, 1.0, 4.5);
		Puck sPuck = new Puck(2.0, 1.5, 5.5);
		

		
		
		if (yPuck.equals(sPuck)) // if the two pucks are equal then printing the pucks are equal
		{
			System.out.println("The pucks are equal.");
		}
		else 
		{
			System.out.println("The pucks are not equal.");
	
			
		}// calls string to say which is heavier and which are equal 
		System.out.println(yPuck.toString());
	  
      if (yPuck.comparedTo(sPuck) == 1) { 
    	  System.out.println("ypuck is heavier than sPuck");
      }
      else if (yPuck.comparedTo(sPuck) == -1) {
    	  System.out.println("sPuck is heavier than yPuck");
      }
      else {
    	  System.out.println("Pucks are equal");
      }
	
   }
}

/*Screen Dump 

The pucks are not equal.
Weight:	4.5
Radius:	1.5
Thickness:	1.0
Volume:	7.0649999999999995
Area:	7.0649999999999995
sPuck is heavier than yPuck

*/



