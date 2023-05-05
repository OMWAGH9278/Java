// Accept string from user and return difference between frequency of small and capital characters

// Input : "MarvellouS"
// Output : 6 (8-2)

import java.util.*;

class StringDemo
{
    public int countDiff(String str)
    {
        int iSmallCnt = 0, iCapitalCnt = 0, iCnt = 0;
        for(iCnt = 0; iCnt < str.length(); iCnt++)
        {
            if((str.charAt(iCnt) >= 'a') && (str.charAt(iCnt) <= 'z'))
                iSmallCnt++;
            else if((str.charAt(iCnt) >= 'A') && (str.charAt(iCnt) <= 'Z'))
                iCapitalCnt++;
            else{}
        }
        return (iSmallCnt-iCapitalCnt);
    }
}

class Program31_3
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        String str = sobj.nextLine();

        StringDemo obj = new StringDemo();

        int iRet = obj.countDiff(str);
        System.out.println("Difference: "+iRet);
    }
}