
import java.util.*;

class Program31
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter your string :");
        String str = sobj.nextLine();

        char crr[] = str.toCharArray();

        System.out.println(crr);
        System.out.println("Character array is : "+crr);
    }
}