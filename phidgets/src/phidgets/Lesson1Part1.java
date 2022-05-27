package phidgets;

/*
Program:Lesson1Part1          Last Date of this Revision: May 27, 2022
Purpose: The LED stays on for 2 seconds.
Author: Muhammad Hafeez, 
School: CHHS
Course: Computer Science 30 

*/



//Add Phidgets Library | You added a file called phidget22 when configuring your project. Import gives you access to the Phidgets library code inside that file. 
import com.phidget22.*;


public class Lesson1Part1 {
  //Handle Exceptions 
  public static void main(String[] args) throws Exception{

      //Create 
      DigitalOutput redLED = new DigitalOutput();

      //Address 
      redLED.setHubPort(1);
      redLED.setIsHubPortDevice(true);

      //Open 
      redLED.open(1000);

      //Use your Phidgets 
      redLED.setState(true);
      Thread.sleep(2000);
      
      redLED.setState(false);
       
}
}