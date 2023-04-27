package Oops;

public class Employeeconstructor {


	String name;
	String empid;
	String designation;
	
	public Employeeconstructor(String name,String empid,String designation)  //constructor through
	{
		this.name=name;
		this.empid=empid;
		this.designation=designation;
	}
	
	public void display()
	{
		System.out.println("name="+name);
		System.out.println("empid="+empid);
		System.out.println("designation="+designation);
	}
	
	public static void main(String[] args) {
	
		Employeeconstructor emp=new Employeeconstructor("arjun","100","Trainer");
		emp.display();
	}

}
