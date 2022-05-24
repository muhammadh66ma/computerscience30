package phidgets;
import com.phidget22.*;

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