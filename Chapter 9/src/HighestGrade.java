
import java.util.ArrayList;
import java.util.Scanner;

/*
Program: Highest Grade          Last Date of this Revision: June 7, 2022
Purpose: Allows user to input grades and displays the highest at the end
Author: Muhammad Hafeez, 
School: CHHS
Course: Computer Science 30 

*/


public class HighestGrade {

	public static void main(String[] args){
		Scanner scan =  new Scanner(System.in);
		
		ArrayList<Integer> scores = new ArrayList<Integer>();
		
		
		System.out.println("Enter five grades between 0 and 100.");
		
		int greatest = -1;
		int i = 5;
		while(scores.size()<5){
			
			int input = scan.nextInt();
			
			if(input <= 100 && input >= 0){
				scores.add(input);
				
				if(input >= greatest)
					greatest = input;
				i--;
				
				if(i != 0)
					System.out.println("Enter "+i+" more grades.");
			}
			
			else{
				System.out.println("Error: Make sure the grade is between 0 and 100!\nEnter a new grade!");
			}
		}
		
		      
		        System.out.println("\nHighest grade: "+greatest);
		
	}
}






/*Screen Dump 

Enter five grades between 0 and 100.
80
Enter 4 more grades.
64
Enter 3 more grades.
52
Enter 2 more grades.
85
Enter 1 more grades.
92

Highest grade: 92

*/