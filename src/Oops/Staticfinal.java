package Oops;

public class Staticfinal {
	String name;
	static String companyname="Luminar";
	final double pi=3.14;
	public static void main(String[] args) {
	 	
		Staticfinal obj=new Staticfinal();
		System.out.println(obj.name="anju");
		System.out.println(companyname);
		System.out.println(companyname="Infosys"); //static
		System.out.println(obj.pi); //final 
	}

}
