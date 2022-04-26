package fio;


import java.io.*;
import java.util.Scanner;
 public class TheFileClass {

	 public static void main(String[] args) 
	 { 
 

		 File f1;
		 
		 
		 System.out.println("File Location");   //Asks user for file location
		 String Rd; //String which takes in whatever the user types
		 Scanner FL = new Scanner(System.in);//collects user input 
		 Rd = FL.next(); 
		
         f1 = new File(Rd);

  if (f1.exists()) {
 
	  System.out.println("File already exists.");
  } else {

	  System.out.println("File does not exist.");
         }
                                            }
                          }

