package phidgets;
//Add Phidgets Library | You added a file called phidget22 when configuring your project. Import gives you access to the Phidgets library code inside that file. 
import com.phidget22.*;

public class Lesson1Part2 {
	//Handle Exceptions 
    public static void main(String[] args) throws Exception{

        //Create 
        DigitalOutput redLED = new DigitalOutput();

        //Address 
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);

        //Open 
        redLED.open(1000);

        //Use your Phidgets 
        redLED.setState(true);
        Thread.sleep(1000);
        
        redLED.setState(true);
          redLED.setState(false);
        
          redLED.setState(false);
        Thread.sleep(1000);
        
        redLED.setState(true);
          Thread.sleep(1000);
          redLED.setState(false);
          
           redLED.setState(false);
            Thread.sleep(1000);
          redLED.setState(true);
           Thread.sleep(1000);
            redLED.setState(false);
      
       
}
}