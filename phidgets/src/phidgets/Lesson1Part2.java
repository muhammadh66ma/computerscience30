package phidgets;
import com.phidget22.*;

/*
Program:Lesson1Part1          Last Date of this Revision: May 27, 2022
Purpose: The LED flashes on and off 3 times.
Author: Muhammad Hafeez, 
School: CHHS
Course: Computer Science 30 

*/



public class Lesson1Part2 {
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
        Thread.sleep(1000);
        
        redLED.setState(true);
          redLED.setState(false);
        
          redLED.setState(false);
        Thread.sleep(1000);
        
        redLED.setState(true);
          Thread.sleep(1000);
          redLED.setState(false);
          
           redLED.setState(false);
            Thread.sleep(1000);
          redLED.setState(true);
           Thread.sleep(1000);
            redLED.setState(false);
      
       
}
}