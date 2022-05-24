package phidgets;
import com.phidget22.*;





public class Lesson3Part3 {

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

         
        redButton.open(1000);
        redLED.open(1000);
        greenButton.open(1000);
        greenLED.open(1000);

        int clicked = 0;
        while(true)
        {
            
              if(redButton.getState())
               
                    
              {
                     clicked++;
                     System.out.println("BUTTON IS PRESSED:" + clicked);
              }

                     Thread.sleep(150);
        }
    }
}
