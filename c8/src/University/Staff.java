package University;

 public class Staff extends UEmployee 
 { 	private String jobTitle; 
	

   public Staff(String name, double salary, String jobTitle) { 		
   super(name, salary); 		
   this.jobTitle = jobTitle;	}
	public String jobTitle() { 
		
	return jobTitle; 				}
				
		public void setjobTitle(String jobTitle) { 					
		this.jobTitle=  jobTitle; 
					
				  }
		
		 public String toString()//return strings 
	        {
	            return("Name:"+super.getName()+"\njobTitle"+jobTitle + "\nSalary:"+super.getSalary());
	        }

		          
					
				
			}


