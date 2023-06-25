
class RegexStudentChallengeIII
{
    public static void main(String arr[])
    {
        String str = "O!m@W#a$g%h7892";
        String str2 = str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(str2);

        String str3 = "   om    mangesh  wagh  ";
        String str4 = str3.replaceAll("\\s+", " ").trim();
        System.out.println(str4);

        String str5[] = str3.trim().split("\\s+");
        System.out.println(str5.length);
    }
}