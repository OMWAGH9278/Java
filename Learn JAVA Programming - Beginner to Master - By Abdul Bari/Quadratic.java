import java.util.Scanner;
import java.lang.Math;

class Quadratic
{
	public static void main(String arr[])
	{
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c= in.nextInt();
		double r1 = ((-b) - (Math.sqrt((b*b) - (4*a*c))))/(2*a);
		double r2 = ((-b) + (Math.sqrt((b*b) - (4*a*c))))/(2*a);
		System.out.println("Roots of quadratic equation are : r1 = "+r1+" and r2 = "+r2);
		in.close(); 
	}
}
