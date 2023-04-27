package Javaprgrms;

public class Palindrome {

	public static void main(String[] args) {
		 int r,s=0,temp;    
		 int n=567;//number to be checked 
		 temp=n; 
		 
		  while(n>0)
		  {    
		   r=n%10;  //getting remainder  
		   s=(s*10)+r;    //reverse 
		   n=n/10;    
		  } 
		  
		  if(temp==s)    
		   System.out.println(temp+" is a palindrome number");    
		  else    
		   System.out.println(temp+" is not a palindrome number");    
		}  
	

	
}
