import java.util.*;

public class Area
{
	public static float areaOfTriangle(int base, int height)
	{
		float area = ((1/2f)*base*height);
		return (area);
	}
	public static void main(String a[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter base of triangle : ");
		int base = in.nextInt();
		System.out.println("Enter height of triangle : ");
		int height= in.nextInt();
		float area = areaOfTriangle(base,height);
		System.out.println("Area of triangle is : "+area);
		in.close();
	}
}
		