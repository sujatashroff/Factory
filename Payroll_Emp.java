
public class Payroll_Emp implements Employee {

	
	String mSalaryType ;
	
	Payroll_Emp(String salaryType){
		
		this.mSalaryType = salaryType ;
	}
	
	
    public String getSalaryType() {
    	return this.mSalaryType ;
    }
	
	
	
	
}
