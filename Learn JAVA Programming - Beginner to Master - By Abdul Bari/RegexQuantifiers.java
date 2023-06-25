
class RegexQuantifiers 
{
    public static void main(String arr[])
    {
        String str1 = "abcdef";
        System.out.println("1."+str1.matches(".*"));
        String str2 = "";
        System.out.println("2."+str2.matches(".*"));
        String str3 = "xndh cdhd";
        System.out.println("3."+str3.matches(".*"));
        String str4 = "xndhcdhd";
        System.out.println("4."+str4.matches("[a-z]*"));
        String str5 = "xndh5cdhd";
        System.out.println("5."+str5.matches("[a-z]*"));
        String str7 = "xndhAcdhd";
        System.out.println("6."+str7.matches("[a-z]*"));
        String str6 = "xndh cdhd";
        System.out.println("7."+str6.matches("[a-z]*"));
        String str8 = "abccbbbaaabc";
        System.out.println("8."+str8.matches("[abc]+"));
        String str9 = "";
        System.out.println("9."+str9.matches("[abc]+"));
        String str10 = "abc";
        System.out.println("10."+str10.matches("[abc]{3}"));
        String str11 = "ac";
        System.out.println("11."+str11.matches("[abc]{3}"));
        String str12 = "abbc";
        System.out.println("12."+str12.matches("[abc]{3}"));
        String str13 = "abbc";
        System.out.println("13."+str13.matches("[abc]{3,7}"));
        String str14 = "abbcabc";
        System.out.println("14."+str14.matches("[abc]{3,7}"));
        String str15 = "abbcabcb";
        System.out.println("15."+str15.matches("[abc]{3,7}"));
        String str16 = "john@gmail.com";
        System.out.println("16."+str16.matches(".+gmail.+"));
        String str17 = "john@gmail.com";
        System.out.println("17."+str17.matches("[a-zA-Z0-9]+@gmail.+"));
        String str18 = "john@gmail.com";
        System.out.println("18."+str18.matches("\\w+@gmail.+"));
        String str19 = "joh-n@gmail.com";
        System.out.println("19."+str19.matches("\\w+@gmail.+"));
    }
}
