import java.util.Scanner;

class Cuboid
{
	public static void main(String arr[])
	{
		Scanner in = new Scanner(System.in);
		int length = in.nextInt();
		int breadth = in.nextInt();
		int height= in.nextInt();
		int totalArea = 2*(length*breadth + breadth*height + height*length);
		int volume = length*breadth*height;
		System.out.println("totalArea of cuboid is : "+totalArea+" and volume is "+volume);
		in.close();
	}
}