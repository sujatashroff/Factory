
public class FactoryPatternExample {

	public static void main(String[] args) {
		
		Employee Payroll_Emp = EmployeeFactory.getInstance("Payroll_Emp", "Attendance") ;
		System.out.println("Employee Type : On Payroll " + Payroll_Emp + "   " + Payroll_Emp.toString2()) ;
		
		System.out.println(" ");
		System.out.println(" ");
	
		Employee Contract_Emp = EmployeeFactory.getInstance("Contract_Emp", "Assignment") ;
		System.out.println("Employee Type : Contract " + Contract_Emp + "   " + Contract_Emp.toString2()) ;
		
		System.out.println(" ");
		System.out.println(" ");
		
		Employee Agent = EmployeeFactory.getInstance("Agent", "No_Of_Customers") ;
		System.out.println("Employee Type : Agent " + Agent + "  " + Agent.toString2()) ;
		
		System.out.println(" ");
		System.out.println(" ");
		
	}
}
