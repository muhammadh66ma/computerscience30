package University;

import java.util.Scanner;

public class University {

    
	public static void main(String args[]){
		
	
		Scanner input = new Scanner(System.in);
		
		//print the available options for the user to choose from
		System.out.println(" \n 1.Faculty member 2.Staff member :");
		
        String sel=input.next();
        if(sel.equals("1")) {
        	
        	//Assinging people their department and salary
        	Faculty new1 = new Faculty("Khan ", 2131, "Computers");
        	Faculty new2 = new Faculty("\nMonic ", 21333, "Math");
        	Faculty new3 = new Faculty("\nKeilo", 21312, "Science");
        	
    		System.out.println(new1);
    		System.out.println(new2);
    		System.out.println(new3);
    		
        }
    		//assigning staff their roles and salary 
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
	
	
/*Screen Dump 
 1.Faculty member 2.Staff member :
1
Name:Khan 
DepartmentName:Computers
Salary:2131.0
Name:
Monic 
DepartmentName:Math
Salary:21333.0
Name:
Keilo
DepartmentName:Science
Salary:21312.0



 1.Faculty member 2.Staff member :
2
Name:James 
jobTitle Princeple
Salary:2131.0
Name:Leo
jobTitle Teacher
Salary:6999.0
Name:Makenzie
jobTitle Janitor
Salary:9598.0


*/
