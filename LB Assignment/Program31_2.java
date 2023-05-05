// Accept string from user and display number of small letters

// Input : "Marvellous"
// Output : 9

import java.util.*;

class StringDemo
{
    public int countSmall(String str)
    {
        int iSmallCnt = 0, iCnt = 0;
        char crr[] = str.toCharArray();
        for(iCnt = 0; iCnt < crr.length; iCnt++)
        {
            if((crr[iCnt] >= ('a')) && (crr[iCnt] <= ('z')))
            {
                System.out.print(crr[iCnt]);
                iSmallCnt++;
            }
        }
        return iSmallCnt;
    }
}

class Program31_2
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        String str = sobj.nextLine();

        StringDemo obj = new StringDemo();

        int iRet = obj.countSmall(str);
        System.out.println("Number of small characters in string is "+iRet);
    }
}