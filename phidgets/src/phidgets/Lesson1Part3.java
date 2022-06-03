package phidgets;
import com.phidget22.*;

/*
Program:Lesson1Part3         Last Date of this Revision: May 27, 2022
Purpose: The green LED flashes.
Author: Muhammad Hafeez, 
School: CHHS
Course: Computer Science 30 

*/



public class Lesson1Part3 {

	    //Handle Exceptions 
	    public static void main(String[] args) throws Exception{

	        //Create 
	        DigitalOutput greenLED = new DigitalOutput();

	        //Address 
	        greenLED.setHubPort(4);
	        greenLED.setIsHubPortDevice(true);

	        //Open 
	        greenLED.open(1000);

	        //Use your Phidgets 
	        greenLED.setState(true);
	        Thread.sleep(2000);
	        
	        greenLED.setState(false);
	         
	}
	}
