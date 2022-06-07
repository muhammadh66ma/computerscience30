import java.util.Scanner;
/*
Program:Find Name          Last Date of this Revision: June 7, 2022
Purpose: Allows user to put in names assigned to element and then search for it 
Author: Muhammad Hafeez, 
School: CHHS
Course: Computer Science 30 

*/


public class FindName {

	public static void main(String[] args) {
		
		
		final int MAX = 5;
 
		String[] hayStack = new String[MAX];

		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < hayStack.length; i++) {
			System.out.printf("Input element %d: ", i);
			hayStack[i] = input.nextLine();
		}
		
		
		System.out.print("Enter String to search: ");
		String needle;
		needle = input.nextLine();
		
		int location;
		
		location = Search.linear(hayStack, needle);
		
		if (location == -1) {
			
			System.out.println("Sorry, string not found in array.");
		
		} 
		else {
			
			System.out.println("First occurrence is element " + location);
		
		}
	}
}



/*Screen Dump 

Input element 0: Muhammad
Input element 1: James
Input element 2: jhon
Input element 3: happy
Input element 4: caleb
Enter String to search: caleb
First occurrence is element 4


*/
