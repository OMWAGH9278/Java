
import java.util.*;

/* 
    Hello

    H   e   l   l   o
    H   e   l   l   o
    H   e   l   l   o
    H   e   l   l   o
    H   e   l   l   o
*/

class Pattern
{
    public void display(String str)
    {
        char crr[] = str.toCharArray();

        int i = 0, j = 0;

        for(i = 0; i < crr.length; i++)
        {
            for(j = 0; j < crr.length; j++)
            {
                System.out.print(crr[j]+"\t");
            }
            System.out.println();
        }
    }
}

class Program43
{
    public static void main(String a[])
    {
        Pattern pobj = new Pattern();
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string :");
        String str = sobj.nextLine();

        pobj.display(str);
    }
}