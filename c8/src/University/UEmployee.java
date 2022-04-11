package University;
public class UEmployee
{

   private String name; 
   private double salary;
    
   // creates string name and salary
   public UEmployee(String name, double salary) {
	  this.name = name;
	  this.salary = salary;

   }
	  //Returns them
   public String getName() { 

  return name;
  }
  public double getSalary() {

  return salary;
 }

    //Set name, Set salary
    public void setName(String name) {
    this.name=name;}

    public void setSalary(double salary) {
 this.salary=salary;
   }
    }
   
