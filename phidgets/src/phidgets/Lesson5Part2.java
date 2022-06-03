package phidgets;
import com.phidget22.*;
/*
Program:Lesson5Part2          Last Date of this Revision: May 27, 2022
Purpose: Only print the temperature if it is above 21°C (70°F). If the temperature is below 21°C, print "Room is too cold".
Author: Muhammad Hafeez, 
School: CHHS
Course: Computer Science 30 

*/


public class Lesson5Part2 {

   public static void main(String[] args) throws Exception
   
   
   {

       //Create 
        HumiditySensor humiditySensor = new HumiditySensor();
        TemperatureSensor temperatureSensor = new TemperatureSensor();

        //Open 
        humiditySensor.open(1000);
        temperatureSensor.open(1000);
      
       
        
      

        //Use your Phidgets 
        while(true)
        {
              
      
        double temp = temperatureSensor.getTemperature();
        
            if ( temp >= 21)
            {
                System.out.println( "Temperature:" + temp );
               
            }
           
            else 
            {
                System.out.println( "Room is Cold" );
               
            } 
            Thread.sleep(150);
        }
    }  
    
    
    
    
    
    
}



/*Screen Dump 

Temperature:22.04
Temperature:22.05
*/