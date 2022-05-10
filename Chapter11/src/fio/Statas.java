package fio;
import java.io.*;
import java.util.Scanner;
	  





public class Statas {

	

 public static void main(String[] args) {

  
    File dataFile = new File("C:\\Users\\54242001\\Documents\\mo.dat");//Tells where file is and to read from it 
    FileReader in;
    BufferedReader readFile;
    String data,name;  
    String score;  
    double score2;  
    double minScore = 100, maxScore = 0;  //assigning min and max scores to rank them 
    double avgScore;
    double totalScores = 0;
    int numScores = 0;

     
      try {

	  in = new FileReader(dataFile);
      readFile = new BufferedReader(in);
	
	     while ((name = readFile.readLine()) != null ) { 
	
	          
	  // Reads file then puts score in order 
	  score = readFile.readLine();  
	  score2 = Double.parseDouble(score); 
	  System.out.println(name + " " + score);   
      totalScores += score2;  
	  numScores += 1;     
	        
	       if(minScore > score2)   
	
	        minScore = score2;
	
	        if(maxScore < score2)  
	
	          maxScore = score2;

      }
       // For displaying the scores from highest to lowest 
      avgScore = totalScores / numScores;       
      System.out.println("Lowest score = " + minScore);
      System.out.println("Highest score = " + maxScore);
      System.out.println("Average = " + avgScore);

      readFile.close();

      in.close();

    }

     catch (FileNotFoundException e) { // Error Messages 

      System.out.println("File does not exist or could not be found.");
      System.err.println("FileNotFoundException: " + e.getMessage());

    }
    // Error message 
    catch (IOException e) { 

      System.out.println("Problem reading file.");
      System.err.println("IOException: " + e.getMessage());

    }

     

  }
}