public class StringPractice
{
	public static void main(String arr[])
	{
		String str = new String("    notepad");
		int len = str.length();
		System.out.println(str);
		String str2 = str.toUpperCase();
		System.out.println(str2);
		String str3 = str.trim();
		System.out.println(str3);
		String str6 = str.substring(6);
		System.out.println(str6);
		String str4 = str.substring(6,8);
		System.out.println(str4);
		String str5 = str.replace('e','M');
		System.out.println(str5);	
	}
}