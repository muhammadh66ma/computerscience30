package phidgets;
import com.phidget22.*;


public class Lesson4Part1 {

   
    
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
  