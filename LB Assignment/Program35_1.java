// Accept two strings from user and concat N characters 
// of second string after first string
// Value of N should be accepted from user

// Note: If third parameter is greater than the size of second
//       string then concat whole string after first string.

// Input : "Marvellous Infosystems"
//         "Logic Building"
//         5
// Output : "Marvellous Infosystems Logic"

import java.util.*;

class StringDemo
{
    public String strNCatX(String src, String dest, int concat_size)
    {
        if(concat_size > dest.length())
        {
            concat_size = dest.length();
        }

        char crr_dest[] = dest.toCharArray();
        char crr[] = new char[concat_size];
        for(int iCnt = 0; iCnt < crr.length; ++iCnt)
        {
            crr[iCnt] = crr_dest[iCnt];
        }
        dest = String.valueOf(crr);

        String str = src+" "+dest;
        return str;
    }
}

class Program35_1
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter first string:");
        String src = sobj.nextLine();
        System.out.println("Enter second string:");
        String dest = sobj.nextLine();
        System.out.println("Enter number of characters to concat:");
        int concat_size = sobj.nextInt();

        StringDemo obj = new StringDemo();
        String sRet = obj.strNCatX(src, dest, concat_size);
        System.out.println("--"+sRet+"--");
    }
}