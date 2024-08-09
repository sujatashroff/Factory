
public class EmployeeFactory {

		

		public static Employee getInstance (String empType, String salaryType) {
			switch(empType) {
			
			case "Payroll_Emp"  : 
				// salaryType = "Attendance"
				return new Payroll_Emp(salaryType) ;
						
				
			
			case "Contract_Emp" : 
				// salaryType = "Assignment"
				return new Contract_Emp(salaryType) ;
				
				
				
			case "Agent" : 
				// salaryType = "No_Of_Customers"
				return new Agent(salaryType);
				
			default : return null ;	
			}
		}
}
