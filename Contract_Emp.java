
public class Contract_Emp implements Employee {
	
	
	String mSalaryType ;
	
	Contract_Emp(String salaryType){
		
		this.mSalaryType = salaryType ;
	}
	
	
    public String getSalaryType() {
    	return this.mSalaryType ;
    }
	
	
}
