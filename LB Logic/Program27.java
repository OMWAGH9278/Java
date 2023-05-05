
import java.util.*;

class MarvellousX
{
    public void display(String s)
    {
        for(int i = 0; i < s.length(); i++)
        {
            System.out.println(s.charAt(i));
        }
    }
}

class Program27
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter your string :");
        String str = sobj.nextLine();

        MarvellousX mobj = new MarvellousX();
        mobj.display(str);
    }
}