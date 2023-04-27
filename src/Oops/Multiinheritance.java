package Oops;
class Parents {
	 int a=10;
	public void display() {
		System.out.println("display");
	}

}
class Childs extends Parents
{
	 public void show()
	 {
		 System.out.println("childshow");
		 
	 }
	 public void grandchildshow()
	 {
		 System.out.println("grandchildshow");
		 
	 }	

}
class Grandchild extends Childs
{
	
public class Multiinheritance {

	public static void main(String[] args) {
		Childs c=new Childs();
		System.out.println(c.a);
		c.display();
		c.grandchildshow();
		c.show();
	}

	}
}


