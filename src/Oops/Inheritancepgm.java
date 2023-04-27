package Oops;

class Member
{
	String name;
	int age;
	long phoneno;
	String addresss;
	long salary;
	public void printdetails() 
	{
		 System.out.println("name="+name);
		 System.out.println("age="+age);
		 System.out.println("phoneno="+phoneno);
		 System.out.println("salary="+salary);
	}
}
class Employees extends Member
{
	String specialization;
}
class manager extends Member
{
	String department;
}
public class Inheritancepgm {

	public static void main(String[] args) {
		
		Employees ob=new Employees();
		ob.name="ishu";
		ob.age=23;
		ob.addresss="abvhv";
		ob.salary=5576;
		 System.out.println(ob.specialization="developer");
		 ob.printdetails();
		 manager obj=new manager();
		 obj.name="djdj";
		 obj.age=37;
		 obj.printdetails();
	}

}
