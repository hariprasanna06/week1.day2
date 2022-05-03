package day2.assignment;

public class EmployeeDetails {
	public void printEmployeeName(String empName, int empId) 
	{
		System.out.println("Employee Name:" + empName +  " & Employee ID:"  + empId);
	}
	public void getEmployeeAddress(String empAddress) 
	{
		System.out.println("Employee Address:" + empAddress);
	}
	public void printEmployeeSalary(double empSalary) 
	{
		System.out.println("Employee Salary:" + empSalary);
	}
	public void printEmployeeMobileNumber(long mobNum) 
	{
		System.out.println("Employee Mobile Number:" + mobNum);
	}
	public static void main(String[] args) {
		EmployeeDetails emp = new EmployeeDetails();
		emp.printEmployeeName("Hari", 06);
		emp.getEmployeeAddress("No.12, Swathika street, T.Nagar, Chennai 33" );
		emp.printEmployeeSalary(4.5000000);
		emp.printEmployeeMobileNumber(7358277851459L);
		
	}
	

}
