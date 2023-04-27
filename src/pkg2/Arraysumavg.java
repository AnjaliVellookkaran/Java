package pkg2;

import java.util.Scanner;

public class Arraysumavg {

	public static void main(String[] args) {
		int ar[]=new int[3];
		System.out.println("enter values");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			ar[i]=sc.nextInt();
		}
		int s=0,avg=0;
		for(int i=0;i<3;i++)
		{
			s=s+ar[i];
			avg=s/ar.length;
		}
		
			System.out.println("sum of array="+s);
			System.out.println("average of array="+avg);

	}

}
