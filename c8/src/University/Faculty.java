package University;
public class Faculty extends UEmployee {
	 private String departmentName;			

public Faculty(String name, double salary, String departmentName) {
		super(name, salary); 			
					this.departmentName = departmentName;		}
		      
				public String getdivision() 
				{ 
				    
					return departmentName;
				    
				}
				       public void setdivision(String departmentName) { 		     
				    	   this.departmentName = departmentName; 
					       
				       }
				       


               public String toString()//return strings 
		        {
		            return("Name:"+super.getName()+"\nDepartmentName:"+ departmentName+ "\nSalary:"+super.getSalary());
		        }


				           
			
			}

	

