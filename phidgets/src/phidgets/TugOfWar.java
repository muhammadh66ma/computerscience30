package phidgets;
import com.phidget22.*;

/*
Program:TugofWar        Last Date of this Revision: May 27, 2022
Purpose: 
Each player is assigned a button (red or green) and has to press the button 10 times before the other player can. When there is a winner it should flash both LEDS once then the winners LED 5 times.
Author: Muhammad Hafeez, 
School: CHHS
Course: Computer Science 30 

*/




public class TugOfWar {


       public static void main(String[] args) throws Exception
       {

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

            boolean playerred=false;
            boolean playergreen=false;
            
            int redcount = 0;
            int greencount = 0;
            
            int clicked = 0;
            int clicked1 = 0;
            
            while(redcount<10 && greencount<10 )
            {
            
                if(redButton.getState()&& !playerred)
                {
                     redLED.setState(true);
                     redcount++;
                     clicked++;
                     System.out.println("Red button is pressed \t = " + clicked);
                }
                else if(!redButton.getState())
                {
                   
                    redLED.setState(false);
                    
                }
                
                     if(greenButton.getState()&&  !playergreen)
                     {
                            greenLED.setState(true);
                            greencount++;
                            clicked1++;
                            System.out.println("Green button is pressed \t = " + clicked1);
                            
                     }
                     
                     else if(!greenButton.getState())
                     {
                   
                            greenLED.setState(false);
                        
                     }
                   
                     playergreen=greenButton.getState();
                     playerred=redButton.getState();
                     Thread.sleep(150);
              
             }
            
            //flash all lights
             greenLED.setState(false);
             redLED.setState(false);
             Thread.sleep(500);
             
             greenLED.setState(true);
             redLED.setState(true);
             Thread.sleep(500);
             //display winner
            if(redcount == 10)
            {
                     while(redcount>5)
                     {
                     redLED.setState(true);   
                     Thread.sleep(500);
                     redLED.setState(false);   
                     Thread.sleep(500);
                     redcount--;
                     System.out.println("Red is the winner");
                     }
            }   
             
            else if(greencount == 10)
            {
                     
                     while(greencount>5)
                     {
                        greenLED.setState(true);   
                        Thread.sleep(500);
                        greenLED.setState(false);   
                        Thread.sleep(500);
                        greencount--;
                        System.out.println("Green is the winner"); 
                     }
                    
            }
                
            
    
    
    } 
}



/*Screen Dump 

Green button is pressed 	 = 1
Red button is pressed 	 = 1
Green button is pressed 	 = 2
Red button is pressed 	 = 2
Green button is pressed 	 = 3
Green button is pressed 	 = 4
Green button is pressed 	 = 5
Green button is pressed 	 = 6
Green button is pressed 	 = 7
Red button is pressed 	 = 3
Green button is pressed 	 = 8
Green button is pressed 	 = 9
Green button is pressed 	 = 10
Green is the winner
*/