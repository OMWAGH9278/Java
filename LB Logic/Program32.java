
import java.util.*;

class Program32
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter your string :");
        String str = sobj.nextLine();

        char crr[] = str.toCharArray();

        System.out.println(crr);
        System.out.print("Character array is : ");
        for(int i = 0; i < crr.length; i++)
        {
            System.out.print(crr[i]);
        }
    }
}