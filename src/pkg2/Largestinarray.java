package pkg2;

import java.util.Scanner;

public class Largestinarray {

	public static void main(String[] args) {
		int ar[]=new int[3];
		System.out.println("enter values");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			ar[i]=sc.nextInt();
		}
		 int l = ar[0];   
	        for (int i = 0; i <3; i++) {   
	           if(ar[i] > l)  
	               l = ar[i];
	        }
	           System.out.println("largest of numbers is "+l);
	          
	}

}
