package Oops;

public class Employee {
	String name;
	String empid;
	String designation;

	public void display()  //object Through
	{
		System.out.println("name="+name);
		System.out.println("empid="+empid);
		System.out.println("designation="+designation);
	}
	
	
	public static void main(String[] args) 
	{
		
		Employee emp=new Employee();
		emp.name="anjali";
		emp.empid="101";
		emp.designation="tester";
		emp.display();
		
	}

}
