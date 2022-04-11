package University;

 public class Staff extends UEmployee 
 { 	private String jobTitle; 
	
   //Creating string 
   public Staff(String name, double salary, String jobTitle) { 		
   super(name, salary); 		
   this.jobTitle = jobTitle; 	}// Get job title
	public String jobTitle() { //returns job title
		
	return jobTitle; 				}
				
		public void setjobTitle(String jobTitle) { 		//set job title			
		this.jobTitle=  jobTitle; 
					
				  }
		
		 public String toString()//return strings 
	        {
	            return("Name:"+super.getName()+"\njobTitle"+jobTitle + "\nSalary:"+super.getSalary());
	        }

		          
					
				
			}


