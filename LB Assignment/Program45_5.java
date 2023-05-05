/*
    Accept string and a character and display string without that character

    Input : (a+(f-g)*2(a-d))
    Output: True

    Input : (a+(f-g)*2(a-d)
    Output: False
*/

import java.util.*;

class Arithmetic
{
    public int totalOccurances(String str, char ch)
    {
        int iOcc = 0;
        for(int i = 0; i < str.length(); ++i)
        {
            if(str.charAt(i) == ch)
                iOcc++;
        }
        return (iOcc);
    }

    public boolean checkBalancedParanthesised(String str)
    {
        int ch1 = totalOccurances(str,'('); 
        int ch2 = totalOccurances(str,')');

        if(ch1 == ch2)
            return true;
        else
            return false;
    }
}
                
class Program45_5
{
    public static void main(String a[])
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter string:");
        String str = scan.nextLine();

        Arithmetic aobj = new Arithmetic();

        if(aobj.checkBalancedParanthesised(str) == true)
            System.out.println("True");
        else
            System.out.println("False");
    }
}
