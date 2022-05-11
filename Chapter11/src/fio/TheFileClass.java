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

  if (f1.exists()) {// if statment for if file exists or not 
 
	  System.out.println("File already exists.");
  } else {

	  System.out.println("File does not exist.");
         }
                                            }
                          }

 /*Screen Dump 

File Location
C:\Users\54242001\Documents\\test1.txt
File already exists.






File Location
C:\Users\54242001\Documents\\test2.txt
File does not exist.



 */