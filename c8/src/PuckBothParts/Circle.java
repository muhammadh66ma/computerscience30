package PuckBothParts;
    public class Circle {

	
	
			
		private static final double PI = 3.14;
		private double radius;

		//Circle constructor
		 public Circle(double r) 
		 {
		 radius = r;
		 } 
			 
			 
			 
	       //a method for setting the radius
		 public void setRadius(double newRadius) 
		 {
			 radius = newRadius;
		 }
			 
		 //a method that calculates and returns area
		 public double area() 
			{
			 double circleArea;
			circleArea = PI * radius * radius;
			return(circleArea);
			 }

			 //a method for getting the radius
			 public double getRadius() 
			 {
				 return(radius);
			 }
		}

	
	


