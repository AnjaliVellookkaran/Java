package Oops;

public class Accessmodifier {

		private int u=18;
		protected int q=10;
		public int c=60;
		int d=79;
	
	public static void main(String[] args) {
		 
		Accessmodifier obj=new Accessmodifier();

		System.out.println(obj.c); //public
		System.out.println(obj.d); //default
		
		System.out.println(obj.u); //private
		System.out.println(obj.q); //protected
}
}