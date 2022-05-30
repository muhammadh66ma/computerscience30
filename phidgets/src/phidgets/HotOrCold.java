package phidgets;

import com.phidget22.DigitalOutput;
import com.phidget22.HumiditySensor;
import com.phidget22.TemperatureSensor;

public class HotOrCold {



 public static void main(String[] args) throws Exception
   
   
   {
        DigitalOutput greenLED = new DigitalOutput();
        DigitalOutput redLED = new DigitalOutput();

        //Address 
        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true);
         redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);

        //Open 
        greenLED.open(1000);
        redLED.open(1000);
       //Create 
        HumiditySensor humiditySensor = new HumiditySensor();
        TemperatureSensor temperatureSensor = new TemperatureSensor();

        //Open 
        humiditySensor.open(1000);
        temperatureSensor.open(1000);
    
   
       while(true)
        {
         double temp = temperatureSensor.getTemperature();
         
         if (temp >= 20 && temp <= 24)
            {
                greenLED.setState(true);
                redLED.setState(false);
                System.out.println( "Temperature:" + temp );
            }
         else 
         {
                greenLED.setState(false);
                redLED.setState(true);
                System.out.println( "Temperature:" + temp );
         }
           
             Thread.sleep(500);
        }
   
   
   
   
   
   
     }    
    
    
 }

/*Screen Dump 
Temperature:22.08
Temperature:22.06


*/