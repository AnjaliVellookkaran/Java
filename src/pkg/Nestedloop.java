package pkg;

public class Nestedloop {

	public static void main(String[] args) {
//* * * * *
//* * * * *
//* * * * *
		 for(int i=1;i<=5;i++)
		 {
			 for(int j=1;j<=5;j++)
			 {
			 System.out.print("* ");
			 }
			 System.out.println(); 
			
}
//1 1
//1 2
//1 3
//2 1
//2 2
//2 3
for(int i=1;i<=3;i++)
{
	for(int j=1;j<=3;j++)
	{
		System.out.println(i+" "+j);
	}
}
//*
//**
//***
//****
for(int i=1;i<=8;i++)
{
	for(int j=1;j<=i;j++)
	{
		System.out.print("*");
	}
	System.out.println();
}
	
	}
}