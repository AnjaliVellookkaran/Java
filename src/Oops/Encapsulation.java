package Oops;
class Employee1{
	String Name;
	String designation;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
}


public class Encapsulation {

	public static void main(String[] args) {
		Employee1 ep=new Employee1();
		ep.setName("anjali");
		ep.setDesignation("Tester");
		System.out.println(ep.getName());
		System.out.println(ep.getDesignation());

	}

}
