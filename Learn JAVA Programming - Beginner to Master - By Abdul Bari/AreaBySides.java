import java.util.Scanner;
import java.lang.Math;

class AreaBySides
{
	public static void main(String arg[])
	{
		float s;
		double area;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter three sides of triangle : ");
		int a=in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		s=(a+b+c)/2f;
		area =  Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("Area of triangle is : "+area);
	}
}