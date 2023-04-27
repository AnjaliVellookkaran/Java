package Oops;
class parent {
	 int a=10;
	public void display() {
		System.out.println("display");
	}

}
class child extends parent
{
	 public void show()
	 {
		 System.out.println("childshow");
		 
	 }
}

public class Singlelevelinheritance {

	public static void main(String[] args) {

		child c=new child();
		System.out.println(c.a);
		c.display();
		c.show();
	}

}
