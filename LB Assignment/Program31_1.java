// Accept string from user and display number of capital letters

// Input : "Marvellous Multi OS"
// Output : 4

import java.util.*;

class StringDemo
{
    public int countCapital(String str)
    {
        int iCnt = 0, iCapitalCnt = 0;
        for(iCnt = 0; iCnt < str.length(); ++iCnt)
        {
            if((str.charAt(iCnt) >= 'A') && (str.charAt(iCnt) <= 'Z'))
            {
                iCapitalCnt++;
            }
        }
        return iCapitalCnt;
    }
}

class Program31_1
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string:");
        String str = sobj.nextLine();

        StringDemo obj = new StringDemo();
        int iRet = obj.countCapital(str);
        System.out.println("String has "+iRet+" capital letters");
    }
}