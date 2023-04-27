package Oops;

public class Methodthrough {

	String name;
	String empid;
	String designation;
	
	 public void method(String name,String empid,String designation)  //Method Through
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
	
	public static void main(String[] args) 
	{
	Methodthrough em=new Methodthrough();
	em.method("arjun","101","trainer");
	em.display();
	}

	

}


