package pkg2;

import Oops.Accessmodifier;

public class Methodpgm extends Accessmodifier {

	public static void main(String[] args) {
		Methodpgm obj=new Methodpgm();
		
		System.out.println(obj.q); //protected
		 System.out.println(obj.c); //public
		 
		//add
		obj.add();
		
		//sub
		int  subvalue=obj.sub();
		System.out.println("substraction="+subvalue);
		
		//div
		obj.div(20,5);
		
		//mul
		int  mulvalue=obj.mul(20,20);
		System.out.println("multiplication="+mulvalue);
	}

	//1.without return and parameters
	public void add()
	{
		int a=20,b=20;
		int sum=a+b;
		System.out.println("sum="+sum);
	}
	
	//without parameter and with return type
	public int sub()
	{
		int a=60,b=40;
		int sub=a-b;
		return sub;
	}
	
	
	//with parameter and without returntype
	public void div(int a,int b)
	{
		double div=a/b;
		System.out.println("div="+div);
	}
	
	
	//with parameter and with return type
	public int mul(int a,int b)
	{
		int mul=a*b;
		return mul;
	}
	
}
