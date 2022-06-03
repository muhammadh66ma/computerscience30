package phidgets;
import com.phidget22.*;

/*
Program:Lesson4          Last Date of this Revision: May 27, 2022
Purpose: Convert temperature data from degrees Celsius to degrees Fahrenheit
Author: Muhammad Hafeez, 
School: CHHS
Course: Computer Science 30 

*/


public class Lesson4 {

   
    
    public static void main(String[] args) throws Exception{

        //Create 
        TemperatureSensor temperatureSensor = new TemperatureSensor();

        //Open 
        temperatureSensor.open(1000);

        //Use your Phidgets 
        while (true) {
            System.out.println("Temperature: " + (temperatureSensor.getTemperature()*1.8+32) + " °F" );
            Thread.sleep(150);
        }
    }
}
  


/*Screen Dump 

Temperature: 71.582 °F
Temperature: 71.564 °F
Temperature: 71.564 °F

*/