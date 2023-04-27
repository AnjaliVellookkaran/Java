package pkg;

public class Operators {

	public static void main(String[] args) {
		
		// Arithmetic operators
		int a=40;
		int b=20;
		System.out.println("a+b="+(a+b));
		System.out.println("a-b="+(a-b));
		System.out.println("a*b="+(a*b));
		System.out.println("a/b="+(a/b));//quotient
		System.out.println("a%b="+(a%b));//reminder
	
		//Assignment operator
		int c=30,d=50;
		System.out.println("c="+(c+=d));//c=c+d c=30+50=80
		System.out.println("c="+(c-=d));//c=c-d c=80-50=30
		System.out.println("c="+(c*=d));//c=c*d c=30*50=1500
		System.out.println("c="+(c/=d));//c=c/d c=1500/50=30
		
		//Relational operator
		int v1=20,v2=20;
		System.out.println(v1>v2);//false
		System.out.println(v1<v2);
		System.out.println(v1==v2);
		System.out.println(v1>=v2);
		System.out.println(v1<=v2);
		System.out.println(v1!=v2);
		
		//swapping
		int f=10;
		int g=20;
		int t;
		t=f;
		f=g;
		g=t;
		System.out.println("f="+f);
		System.out.println("g="+g);
		
		//logical operators
		String username="abc";
		String password="abc123";
		System.out.println(username=="abc" && password=="abc123");//true
		System.out.println(username=="abc1" || password=="abc123");//true
		System.out.println(!(username=="abc1"));//true
		
		//unary
		//++ increment by 1
		//-- decrement by 1
		int h=6;
		System.out.println(h++);//6
		System.out.println(h);//7
		System.out.println(++h);//8
		
		
	
	
	}

}
