package pkg;

public class Employee {
	int empid;
	String empname;
	static String companyname="Luminar"; //static variable
	public static void main(String[] args) {
	
		Employee emp1=new Employee();
		System.out.println(emp1.empid=101);
		System.out.println(emp1.empname="arun");
		Employee emp2=new Employee();
		emp2.empid=102;
		emp1.empattendace();
		
	}
	public void empattendace()
	{
		int a=10;
		System.out.println("attendance");
	}
}