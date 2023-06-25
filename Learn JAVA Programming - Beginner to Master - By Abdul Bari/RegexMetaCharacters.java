
class RegexMetaCharacters
{
	public static void main(String arr[])
	{
		String str1 = "A";
		System.out.println(str1.matches("\\w"));
		String str2 = "a";
		System.out.println(str2.matches("\\w"));
		String str3 = "4";
		System.out.println(str3.matches("\\w"));
		String str = "n4";
		System.out.println(str.matches("\\w"));
		String str4 = "6";
		System.out.println(str4.matches("\\d"));
		System.out.println(str1.matches("\\d"));
		String str5 = "6";
		System.out.println(str5.matches("\\D"));
		System.out.println(str2.matches("\\D"));
		String str6 = "#";
		System.out.println(str6.matches("\\D"));
		System.out.println(str6.matches("\\W"));
		System.out.println(str6.matches("\\s"));
		String str7 = " ";
		System.out.println(str7.matches("\\s"));
		System.out.println(str7.matches("\\S"));
		System.out.println(str6.matches("\\S"));
	}
}