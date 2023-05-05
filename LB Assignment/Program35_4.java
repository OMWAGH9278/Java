// Accept string from user and reverse the contents 
// of that string by toggling the case

// Input : "aBCdef"
// Output : "FEDcbA"

import java.util.*;

class StringDemo
{
    private String toggle(String str)
    {
        char crr[] = str.toCharArray();
        for(int iCnt = 0; iCnt < crr.length; ++iCnt)
        {
            if((crr[iCnt] >= 'a') && (crr[iCnt] <= 'z'))
            {
                crr[iCnt] = Character.toUpperCase(crr[iCnt]);
            }
            else if((crr[iCnt] >= 'A') && (crr[iCnt] <= 'Z'))
            {
                crr[iCnt] = Character.toLowerCase(crr[iCnt]);
            }
            else
            {}
        }
        String str_toggled = String.valueOf(crr);
        return (str_toggled);
    }

    public String reverseToggleString(String str)
    {
        String str_toggled = toggle(str);
        char crr[] = str_toggled.toCharArray();
        int iStart = 0;
        int iEnd = crr.length-1;
        char cTemp;
        while(iStart < iEnd)
        {
            cTemp = crr[iStart];
            crr[iStart] = crr[iEnd];
            crr[iEnd] = cTemp;
            iStart++;
            iEnd--;
        }
        String sRev = String.valueOf(crr);
        return (sRev);
    }
}

class Program35_4
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string:");
        String str = sobj.nextLine();

        StringDemo obj = new StringDemo();
        String sRev = obj.reverseToggleString(str);
        System.out.println(sRev);
    }
}