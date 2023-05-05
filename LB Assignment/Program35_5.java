// Accept string from user and check whether it is a 
// palindrome without considering its case

// Input : "1abccBA1"
// Output : TRUE

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

    private String reverse(String str)
    {
        char crr[] = str.toCharArray();
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

    public boolean checkPalindrome(String str)
    {
        char crr1[] = str.toCharArray();
        String sRev = reverse(str);
        char crr2[] = sRev.toCharArray();
        String sRevToggled = toggle(sRev);
        char crr3[] = sRevToggled.toCharArray();
        int iCnt = 0; 
        for(iCnt = 0; iCnt < crr1.length; ++iCnt)
        {
            if((crr1[iCnt] != crr2[iCnt]) && (crr1[iCnt] != crr3[iCnt]))
            {
                break;
            }
        }
        if(iCnt == crr1.length)
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
}

class Program35_5
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string:");
        String str = sobj.nextLine();

        StringDemo obj = new StringDemo();
        
        if(obj.checkPalindrome(str) == true)
        {
            System.out.println("TRUE");
        }
        else
        {
            System.out.println("FALSE");
        }
    }
}