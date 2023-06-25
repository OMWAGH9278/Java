
class RegexStudentChallengeII
{
    public static void main(String arr[])
    {
        int binary = 10011010;
        int hexa = 0X251a2cf;
        String date = "12/03/1999";

        String binarystr = String.valueOf(binary);
        String binaryhexa = String.valueOf(hexa);

        System.out.println(binarystr.matches("[0-1]+"));
        System.out.println(binaryhexa.matches("[0-9a-fA-F]+"));
        System.out.println(date.matches("[0-3][0-9]/[0-1][1-9]/[0-9]{4}"));
    }
}