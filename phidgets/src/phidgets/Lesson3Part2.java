package phidgets;
import com.phidget22.*;

/*
Program:Lesson3Part2          Last Date of this Revision: May 27, 2022
Purpose: The green button controls the red LED and the red button controls the green LED.
Author: Muhammad Hafeez, 
School: CHHS
Course: Computer Science 30 

*/

public class Lesson3Part2 {


  public static void main(String[] args) throws Exception{

      DigitalInput redButton = new DigitalInput();
      DigitalOutput redLED = new DigitalOutput();
      DigitalInput greenButton = new DigitalInput();
      DigitalOutput greenLED = new DigitalOutput();

       
      redButton.setHubPort(0);
      redButton.setIsHubPortDevice(true);
      redLED.setHubPort(1);
      redLED.setIsHubPortDevice(true);
      greenButton.setHubPort(5);
      greenButton.setIsHubPortDevice(true);
      greenLED.setHubPort(4);
      greenLED.setIsHubPortDevice(true);

       
      redButton.open(1000);
      redLED.open(1000);
      greenButton.open(1000);
      greenLED.open(1000);

      while(true){

          if( redButton.getState()){
              greenLED.setState(true);
          } else {
              greenLED.setState(false);
          }

          if(greenButton.getState()){
              redLED.setState(true);
          } else {
              redLED.setState(false);
          }

          Thread.sleep(150);
      }
}
}