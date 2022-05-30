package phidgets;
import com.phidget22.*;

/*
Program:Lesson1Part1          Last Date of this Revision: May 27, 2022
Purpose: The LED turns off when the button is pressed and turns on when the button is released.
Author: Muhammad Hafeez, 
School: CHHS
Course: Computer Science 30 

*/


public class Lesson3Part1 {

    //Handle Exceptions 
    public static void main(String[] args) throws Exception{
        
    DigitalInput redButton = new DigitalInput();
            DigitalOutput redLED = new DigitalOutput();
            DigitalInput greenButton = new DigitalInput();
            DigitalOutput greenLED = new DigitalOutput();

            //Address 
            redButton.setHubPort(0);
            redButton.setIsHubPortDevice(true);
            redLED.setHubPort(1);
            redLED.setIsHubPortDevice(true);
            greenButton.setHubPort(5);
            greenButton.setIsHubPortDevice(true);
            greenLED.setHubPort(4);
            greenLED.setIsHubPortDevice(true);

            //Open 
            redButton.open(1000);
            redLED.open(1000);
            greenButton.open(1000);
            greenLED.open(1000);

        //Use your Phidgets 
        while(true)
        {

            if( redButton.getState())
            {
                redLED.setState(false);
            } 
            else 
            {
                redLED.setState(true);
            }

            if(greenButton.getState())
            {
                greenLED.setState(false);
            } 
            else 
            {
                greenLED.setState(true);
            }

            Thread.sleep(150);
        }
    }
}