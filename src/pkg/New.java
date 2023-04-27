package pkg;

public class New {

	public static void main(String[] args) {
		
		int a1=23;
		int b1=45;
		System.out.println(a1==b1);
		
		int a=55;
		int b=70;
		System.out.println(a<50 && a<b);
		
		//swap without third variable
		int a2=20;
		int b2=30;
		
		a2= a2 + b2; // a2 now becomes 50
	    b2 = a2 - b2; // b2 becomes 20
		a2 = a2 - b2; // a2 becomes 30
		System.out.println("a2="+a2);
		System.out.println("b2="+b2);
		   
		int a3=17;
		int r=(a3%10);//reminder of 17%10=7
		System.out.println("second digit="+r);
		 
	}
}
