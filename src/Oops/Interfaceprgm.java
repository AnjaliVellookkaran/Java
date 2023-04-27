package Oops;
 interface banks //can't create object for interface
 {
	 public void withdraw(); //cannot implement
	 public void interest(); //only declaring method 
	 
 }
 class Federal implements banks
 {
	 @Override
	 public void withdraw()
	 
	 {
		 System.out.println("Federal withdraw");
	 }
	 @Override
	 public void interest()
	 
	 {
		 System.out.println("Federal interest");
	 }		
 }
public class Interfaceprgm {

	public static void main(String[] args) {
	Federal obj=new Federal();
	obj.interest();
	obj.withdraw();
	}

}
