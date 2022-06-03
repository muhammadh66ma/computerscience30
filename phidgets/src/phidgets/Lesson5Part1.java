package phidgets;
import com.phidget22.*;
/*
Program:Lesson5Part1          Last Date of this Revision: May 27, 2022
Purpose: Only prints the humidity if it is above 30%. If it is bellow 30% print “Humidity is low”.
Author: Muhammad Hafeez, 
School: CHHS
Course: Computer Science 30 

*/


public class Lesson5Part1 
{


    public static void main(String[] args) throws Exception
    {

        //Create 
        HumiditySensor humiditySensor = new HumiditySensor();
        TemperatureSensor temperatureSensor = new TemperatureSensor();

        //Open 
        humiditySensor.open(1000);
        temperatureSensor.open(1000);
      
        double temp = temperatureSensor.getTemperature();
        
      

        //Use your Phidgets 
        while(true)
        {
              
        double humidity = humiditySensor.getHumidity();
        
            if (humidity >= 30)
            {
                System.out.println("Humidity: "+humidity );
               
            }
           
            else 
            {
                System.out.println("Humidity is low " );
               
            } 
            Thread.sleep(150);
        }
    }
}



/*Screen Dump 

Humidity: 30.34
Humidity: 30.36

*/
  