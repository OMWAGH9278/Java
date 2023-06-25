
class RegularExpression
{
	public static void main(String arr[])
	{
		String str1 = "a";
		System.out.println(str1.matches("."));
		String str2 = "abc";
		System.out.println(str2.matches("."));
		String str3 = "p";
		System.out.println(str1.matches("[abc]"));
		System.out.println(str3.matches("[abc]"));
		System.out.println(str3.matches("[^abc]"));
		System.out.println(str3.matches("[a-z0-9]"));
		String str4 = "%";
		System.out.println(str4.matches("[a-z0-9]"));
		String str5 = "A";
		System.out.println(str5.matches("[a-z][0-9]"));
		String str6 = "a7";
		System.out.println(str6.matches("[a-z][0-9]"));
		System.out.println(str3.matches("[a-z][0-9]"));
		String str7 = "c";
		System.out.println(str7.matches("a|b"));
		System.out.println(str1.matches("a|b"));
		String str8 = "acb";
		System.out.println(str8.matches("abc"));
		System.out.println(str2.matches("abc"));
	}
}