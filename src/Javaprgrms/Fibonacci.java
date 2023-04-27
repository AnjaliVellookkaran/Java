package Javaprgrms;

public class Fibonacci {

	public static void main(String[] args) {
		int k1=0,k2=1,c=10;
		int k3,i;
		System.out.print(k1+" "+k2);
		for(i=2;i<c;i++)
		{
			k3=k1+k2;
			System.out.print(" "+k3);
			k1=k2;
			k2=k3;
		}

	}

}
