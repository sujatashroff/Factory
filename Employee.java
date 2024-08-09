
public interface Employee {

	String getSalaryType();
	
	
	
	default String toString2() {
		return "Type Of Salary : " + this.getSalaryType() ;
	}
}

