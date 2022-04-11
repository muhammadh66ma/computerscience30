package University;

import java.util.Scanner;

public class University {


	public static void main(String args[]){
		
	
		Scanner input = new Scanner(System.in);
		
		//print the available options for the user to choose from
		System.out.println(" \n 1.Faculty member 2.Staff member :");
		
        String sel=input.next();
        if(sel.equals("1")) {
        	
        	
        	Faculty new1 = new Faculty("Khan ", 2131, "Computers");
        	Faculty new2 = new Faculty("\nMonic ", 21333, "Math");
        	Faculty new3 = new Faculty("\nKeilo", 21312, "Science");
        	
    		System.out.println(new1);
    		System.out.println(new2);
    		System.out.println(new3);
    		
        }
    		else if(sel.equals("2")) {
    			
    			Staff s1 = new Staff("James ", 2131, "Princple");
    			Staff s2 = new Staff("Leo", 6999, "Teacher");
    			Staff s3 = new Staff("Makenzie", 9598, "Janitor");
    			
            
            	
        		System.out.println(s1);
        		System.out.println(s2);
        		System.out.println(s3);
        		
        	
    		}        	
        	
        	
        	
        	
        }
    
	
	}
	
	

