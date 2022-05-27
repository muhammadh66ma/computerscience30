package phidgets;
import com.phidget22.*;

/*
Program:Lesson1Part1          Last Date of this Revision: May 27, 2022
Purpose:  The loop repeats every 10ms, 1000ms, 5000ms​
Author: Muhammad Hafeez, 
School: CHHS
Course: Computer Science 30 

*/



public class Lesson2Part1 {

    //Handle Exceptions 
    public static void main(String[] args) throws Exception{
        
        //Create 
        DigitalInput greenButton = new DigitalInput();

        //Address 
        greenButton.setHubPort(5);
        greenButton.setIsHubPortDevice(true);

        //Open 
        greenButton.open(1000);

        //Use your Phidgets 
        while(true){
            System.out.println("Button State: " + greenButton.getState());
            Thread.sleep(5000);
            
        }
    }
}
  