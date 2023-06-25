
class RegexStudentChallengeI
{
    public static void main(String arr[])
    {
        String str = "programmer@gmail.com";

        // if(str.matches("\\w+@gmail.+"))
        // {
        //     System.out.println("email id is on gmail");
        // }
        // else
        // {
        //     System.out.println("email id is not on gmail");
        // }

        // String substring[] = str.split("@");
        // System.out.println("user name : "+substring[0]);
        // System.out.println("domain name : "+substring[1]);

        int index1 = str.indexOf("@");
        int index2 = str.indexOf(".");

        String username = str.substring(0,index1);
        String domainname = str.substring(index1+1, str.length());

        System.out.println("user name : "+username);
        System.out.println("domain name : "+domainname);

        int compare = domainname.compareTo("gmail.com");

        System.out.println((compare == 0) ? "true" : "false");
    }
}