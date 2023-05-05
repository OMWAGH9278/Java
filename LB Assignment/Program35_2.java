// Accept two strings from user and check if their contents are equal

// Input : "Marvellous Infosystems"
//         "Marvellous Infosystems"
// Output : TRUE

import java.util.*;

class StringDemo
{
    public boolean checkStringsEqual(String src, String dest)
    {
        int iCnt = 0;
        for(iCnt = 0; iCnt < src.length(); ++iCnt)
        {
            if(src.charAt(iCnt) != dest.charAt(iCnt))
            {
                break;
            }
        }
        if(iCnt != src.length())
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}

class Program35_2
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter first string:");
        String src = sobj.nextLine();
        System.out.println("Enter second string:");
        String dest = sobj.nextLine();

        StringDemo obj = new StringDemo();

        if(obj.checkStringsEqual(src,dest) == true)
        {
            System.out.println("TRUE");
        }
        else
        {
            System.out.println("FALSE");
        }
    }
}