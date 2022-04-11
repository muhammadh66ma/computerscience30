package PuckBothParts;
public class Puck extends Disk{
    private double weight;
    private boolean standard;
    private boolean youth;
    
    public Puck(double r, double t, double w) { 
		super(r, t);
		weight = w;
		// TODO Auto-generated constructor stub
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
    public String toString() { return "Weight:\t" + weight + "\nRadius:\t" + super.getRadius() + "\nThickness:\t" + super.getThickness() + "\nVolume:\t" + super.volume() + "\nArea:\t" + super.area();
    
    }
    public void stanard(boolean We) {
		this.standard = We;
    }
    
    	 public void youth(boolean We) {
    			this.youth = We;
    }
    
    public boolean equals(Object We) {
    	Puck x = (Puck)We;
    	if (x.getWeight()== weight) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }

public String getDivision(Object p) 
{
	Puck testPuck = (Puck)p; 
	
	
	if (testPuck.getWeight() >= 5 && testPuck.getWeight() <= 5.5) 
	{
		return("The puck is standard division");
	} 
	else if (testPuck.getWeight() >= 4 && testPuck.getWeight() <= 4.5)  
	{
		return("The puck is youth division");
	} 
	else 
	{
		return("the puck is a non-standard weight");
	}
}
    public int comparedTo( Object p) {
    	
    	Puck testPuck = (Puck)p; 
    	
    	if(getWeight() > testPuck.getWeight()) {
    		return 1;
    	}
    
    	else if(getWeight() < testPuck.getWeight()) {
    		return -1;
    	}
    	else {
    		return 0;
    	}
    }
    
}