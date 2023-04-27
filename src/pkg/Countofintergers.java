package pkg;

public class Countofintergers {

	public static void main(String[] args) {
		int c=0;
		int n=3456;
		while(n>0)
		{
			n=n/10;  //345  //34  //3  //0
			c++;     //1    //2   //3  //4
		}
		System.out.println("count="+c);
	}

}
