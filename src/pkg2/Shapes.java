package pkg2;

public class Shapes {

	public static void main(String[] args) 
	{
		
		Shapes obj=new Shapes();
		
		//rectangle
		obj.rectangle();
		
		//square
		int  squarevalue=obj.square();
		System.out.println("area of square="+squarevalue);
		
		//triangle
		obj.triangle(2,5);
				
		//circle
		double  circlevalue=obj.circle(2);
		System.out.println("area of circle="+circlevalue);
		
	}
		
		//1.without return type and parameters
		public void rectangle()
		{
			int l=2,b=2;
			int area=l*b;
			System.out.println("area="+area);
		}
		
		//without parameter and with return type
		public int square()
		{
			int a=6;
			int area=a*a;
			return area;
		}
		

		//with parameter and without return type
		public void triangle(int l,int b)
		{
			double triangle=0.5*l*b;
			System.out.println("area="+triangle);
		}
		
		
		//with parameter and with return type
		public double circle(int r)
		{
			double circle=3.14*r*r;
			return circle;
		}
	
		
		

}
