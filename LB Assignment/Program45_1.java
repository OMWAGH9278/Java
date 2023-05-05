/*
    Accept two strings and check whether first string is rotation of second

    Input : abcdefg     cdefgab
    Output: TRUE
*/

import java.util.*;

class Arithmetic
{
    public boolean checkStringEqual(String str1, String str2)
    {
        int iCnt = 0;
        if(str1.length() != str2.length())
            return false;

        for(iCnt = 0; iCnt < str1.length(); ++iCnt)
        {
            if(str1.charAt(iCnt) != str2.charAt(iCnt))
                break;
        }
        if(iCnt == str1.length())
            return true;
        else
            return false;
    }

    public String rotateString(String str, int rotations)
    {
        char crr[] = new char[str.length()]; 
        for(int i = 0; i < rotations; ++i)
        {
            for(int iCnt = 0; iCnt < str.length(); ++iCnt)
            {
                if(iCnt == str.length()-1)
                    crr[iCnt] = str.charAt(0);
                else
                    crr[iCnt] = str.charAt(iCnt+1);
            }
            System.out.println(crr);
            str = String.valueOf(crr); 
        }
        String new_str = String.valueOf(crr);
        return (new_str);
    }

    public boolean checkRotation(String str1, String str2)
    {
        if(str1.length() != str2.length())
            return false;

        int iCnt = 0;
        String rotated_string = null;
        for(iCnt = 1; iCnt <= str1.length(); ++iCnt)
        {
            rotated_string = rotateString(str2, iCnt);
            if(checkStringEqual(str1, rotated_string) == true)
                break;
            rotated_string = null;
        }
        if(iCnt != str1.length()+1)
            return true;
        else
            return false;
    }
}

class Program45_1
{
    public static void main(String a[])
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first string:");
        String str1 = scan.nextLine();
        System.out.println("Enter second string:");
        String str2 = scan.nextLine();

        Arithmetic aobj = new Arithmetic();
        if(aobj.checkRotation(str1,str2) == true)
            System.out.println("TRUE");
        else
            System.out.println("FALSE");
    }
}
