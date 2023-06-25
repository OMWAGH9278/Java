
public class StringPractice2
{
	public static void main(String arr[])
	{
		String str = "Mr. Shahrukh Khan";
		System.out.println(str.startsWith("Mr."));
		String str1 = "Mr. Shahrukh Khan";
		System.out.println(str1.startsWith("Shah",4));
		String str2 = "Mr. Shahrukh Khan";
		System.out.println(str2.endsWith("Khan"));
		String str3 = "Mr. Shahrukh Khan";
		System.out.println(str3.charAt(7));
		for(int i=0;i<str.length();++i)
			System.out.print(str3.charAt(i));
		System.out.println();
		String str4 = "www.udemy.co.in";
		System.out.println(str4.indexOf("."));
		System.out.println(str4.indexOf("udemy"));
		System.out.println(str4.indexOf(".",4));
		System.out.println(str4.indexOf("?"));
		System.out.println(str4.lastIndexOf("."));
		System.out.println(str4.lastIndexOf("udemy"));
	}
}