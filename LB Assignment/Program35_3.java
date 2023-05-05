// Accept two strings from user and 
// check whether first N characters are equal
// Value of N should be accepted from user

// Note: If third parameter is greater than the size of
//       string then consider whole string

// Input : "Marvellous Infosystems"
//         "Marvellous Logic Building"
//         10
// Output : TRUE

import java.util.*;

class StringDemo
{
    public boolean checkNCharOfStringsEqual(String src, String dest, int chars_to_check)
    {
        if(chars_to_check > src.length())
        {
            chars_to_check = src.length();
        }
        int iCnt = 0;

        for(iCnt = 0; iCnt < chars_to_check; ++iCnt)
        {
            if(src.charAt(iCnt) != dest.charAt(iCnt))
            {
                break;
            }
        }

        if(iCnt == chars_to_check)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class Program35_3
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter first string:");
        String src = sobj.nextLine();
        System.out.println("Enter second string:");
        String dest = sobj.nextLine();
        System.out.println("Enter number of characters to check:");
        int chars_to_check = sobj.nextInt();

        StringDemo obj = new StringDemo();

        if(obj.checkNCharOfStringsEqual(src,dest,chars_to_check) == true)
        {
            System.out.println("TRUE");
        }
        else
        {
            System.out.println("FALSE");
        }
    }
}