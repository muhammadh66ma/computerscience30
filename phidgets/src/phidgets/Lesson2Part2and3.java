package phidgets;
import com.phidget22.*;

/*
Program:Lesson2Part2 and 3          Last Date of this Revision: May 27, 2022
Purpose:  to print the state of your green button and only print when the button state changes.
Author: Muhammad Hafeez, 
School: CHHS
Course: Computer Science 30 

*/

public class Lesson2Part2and3 {


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
      boolean buttonstate=false;
     
      
      while(true){
         
          if(greenButton.getState()&&  !buttonstate)
         {
             System.out.println("Button State:TRUE ");
             
         }
          
          else if(!greenButton.getState()&&  buttonstate)
          {
              System.out.println("Button State:FALSE " );
          }
          buttonstate=greenButton.getState();
          Thread.sleep(50);
      }
  }
}


/*Screen Dump 
 *
Button State:TRUE 
Button State:FALSE 
Button State:TRUE 
Button State:FALSE 
*/