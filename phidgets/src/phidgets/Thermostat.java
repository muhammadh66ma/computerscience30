package phidgets;



import com.phidget22.*;
import java.util.Scanner;

public class Thermostat 
{


   public static void main(String[] args) throws Exception
   
   {

       //Create 
        DigitalInput redButton = new DigitalInput();
        DigitalOutput redLED = new DigitalOutput();
        DigitalInput greenButton = new DigitalInput();
        DigitalOutput greenLED = new DigitalOutput();
        HumiditySensor humiditySensor = new HumiditySensor();
        TemperatureSensor temperatureSensor = new TemperatureSensor();

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
        humiditySensor.open(1000);
        temperatureSensor.open(1000);
      
       
        double temp, setTemp = 21;
        double printTemp = 10;
        boolean redState = false;
        boolean greenState = false;
      

        //Use your Phidgets 
         while(true)
        {
          
           temp = temperatureSensor.getTemperature();
                 
           if(temp <(setTemp+2) && temp > (setTemp-2) )
           {
            
                 greenLED.setState(true);
                 redLED.setState(false);
           } 
            
           else 
            
           {
                 
               redLED.setState(true);
               greenLED.setState(false);
           }
               
                
            
                 
           //change temp
            if (redButton.getState() && !redState)
              {    
                   redLED.setState(true);
                   setTemp--;
                   System.out.println("Temperature:"+ setTemp);
                  
              }   
             
             else if (greenButton.getState() && !greenState)
             {
                  greenLED.setState(true);
                  setTemp++;
                  System.out.println("Temperature:"+  setTemp);
                 
             }
            //track button state
                redState = redButton.getState();
                greenState= greenButton.getState();  
                Thread.sleep(500);
        }
         
                 



   }
}





/* Screen Dump
Temperature:22.0
Temperature:23.0
Temperature:22.0
Temperature:21.0
Temperature:22.0
Temperature:21.0


*/


