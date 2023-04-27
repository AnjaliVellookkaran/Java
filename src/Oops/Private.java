package Oops;

public class Private {
 private int u=10;
	public static void main(String[] args) {
		Private obj=new Private();
		System.out.println(obj.u); //private
		
		Accessmodifier obje=new Accessmodifier();
		System.out.println(obje.d); //default
		
		System.out.println(obje.c); //public
	}

}
