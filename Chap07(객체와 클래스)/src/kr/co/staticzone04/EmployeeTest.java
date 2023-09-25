package kr.co.staticzone04;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee employeeLee = new Employee();
		employeeLee.setEmployeeName("이순신");
		
		Employee employeeShin = new Employee();
		employeeShin.setEmployeeName("신사임당");
		
		System.out.println(employeeLee.getEmployeeName() + ", " + employeeLee.getEmployeeId());
		System.out.println(employeeShin.getEmployeeName() + ", " + employeeShin.getEmployeeId());
		System.out.println(Employee.serialNum);
		
		/*
			이순신, 1001
			신사임당, 1002
			1002
		 */
	}
}
