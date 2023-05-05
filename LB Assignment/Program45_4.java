/*
    Accept string and a character and display string without that character

    Input : IndiaisDemoIndia
            i
    Output: IndasDemoInda
*/

import java.util.*;

class Arithmetic
{
    public void displayStringWithoutChar(String str, char ch)
    {
        for(int i = 0; i < str.length(); ++i)
        {
            if(str.charAt(i) == ch)
                continue;
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }
}
                
class Program45_4
{
    public static void main(String a[])
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter string:");
        String str = scan.nextLine();
        System.out.println("Enter character to remove:");
        char ch = scan.next().charAt(0);

        Arithmetic aobj = new Arithmetic();

        aobj.displayStringWithoutChar(str,ch);
    }
}
