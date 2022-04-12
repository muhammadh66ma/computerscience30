package PuckBothParts;


//Calling method from circle to use 
public class Disk extends Circle {
	private double thickness;
		

	public Disk(double r, double t) {
		super(r);
		thickness = t;
	}


	//set thickness
	public void setThickness(double newThickness) {
	 	thickness = newThickness;
	}


     //return thickness
	public double getThickness() {
	 	return(thickness);
	}
	
       //  get volume, return volume 
	public double volume() {
		double v;
		
		v = super.area() * thickness;
		return(v);
	}

	
	//get thickness and radius from user 
	public boolean equals(Object obj) {
		Disk testObj = (Disk)obj;
		
	 	if (testObj.getRadius() == super.getRadius() && 
	 		testObj.getThickness() == thickness) {
			return(true);
		} else {
			return(false);
		}
	}


         // ouputs radius and thickness
	public String toString() {
		String diskString;

		diskString = "The disk has radius " + super.getRadius() +
					 " and thickness " + thickness + ".";
	 	return(diskString);
	}
}