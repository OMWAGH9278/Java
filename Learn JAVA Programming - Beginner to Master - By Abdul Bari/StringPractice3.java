
class StringPractice3
{
	public static void main(String arr[])
	{
		String str1 = "Pyramid";
		String str2 = "Pyramid";
		System.out.println(str1.equals(str2));
		String str3 = "pyramid";
		System.out.println(str3.equalsIgnoreCase(str2));
		System.out.println(str2==str3);
		String str4 = new String("Pyramid");
		System.out.println(str1==str4);
		System.out.println(str1.equals(str4));
		System.out.println(str1.compareTo(str4));
		System.out.println(str3.compareTo(str4));
		String str5 = "china wall";
		String str6 = "china all";
		System.out.println(str5.compareTo(str6));
		String str7 = "The great wall of china";
		System.out.println(str7.contains("wall"));
		String str8 = "The great wall";
		String str9 = " of china";
		System.out.println(str8.concat(str9));
		System.out.println(str8 + str9);
		System.out.println(String.valueOf(125));
	}
}