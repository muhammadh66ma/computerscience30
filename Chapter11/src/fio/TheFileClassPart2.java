package fio;



import java.io.*;
import java.util.Scanner;

public class TheFileClassPart2 {

 public static void main(String[] args) {
      File textFile = new File("C:\\Users\\54242001\\Documents\\n1.txt");// reads the certain file 
         if (textFile.exists()) {                         // if statment for if file exists  then displays it
             System.out.println("File exists.");
       } else {
         try {
        textFile.createNewFile();
         System.out.println("New file created.");
           } catch (IOException e) {
               System.out.println("File could not be created.");
   System.err.println("IOException: " + e.getMessage());
    
           }
          }
          Scanner SC=new Scanner(System.in);
  		
  		//Asks user to type d to delete file
  		System.out.println("\n Type d to delete the file. Type any other character to keep the file: ");
  		
  		
  		char input=SC.next().charAt(0); // allows 1 character to be stored ex: d
  		
  		
  		if(input=='d')
  {
   
  		if(textFile.delete())//if file is deleted successfully
         
  		{
            System.out.println("File deleted successfully");
         
  		}
         
  		else
         
  		{
             
  		System.out.println("Failed to delete the file");
         
  		}  
         }

  		else   //if CH is not d

  		{
    
  			System.out.println("File kept because you did not type D");

  		}


           }
              }



/*Screen Dump 


File exists.
Type d to delete the file. Type any other character to keep the file: 
d
File deleted successfully


File exists.
Type d to delete the file. Type any other character to keep the file: 
k
File kept because you did not type D
*/
