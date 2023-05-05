// Accept string from user and check for vowels

// Input : "marvellous"
// Output : TRUE

// Input : "Demo"
// Output : TRUE

// Input : "xyz"
// Output : FALSE

import java.util.*;

class StringDemo
{
    public boolean checkVowel(String str)
    {
        int iCnt = 0;
        for(iCnt = 0; iCnt < str.length(); iCnt++)
        {
            if((str.charAt(iCnt) == 'a') || (str.charAt(iCnt) == 'e') || (str.charAt(iCnt) == 'i') || (str.charAt(iCnt) == 'o') || (str.charAt(iCnt) == 'u') || 
               (str.charAt(iCnt) == 'A') || (str.charAt(iCnt) == 'E') || (str.charAt(iCnt) == 'I') || (str.charAt(iCnt) == 'O') || (str.charAt(iCnt) == 'U'))
            {   
                break;  
            }
            else{}
        }
        if(iCnt != str.length())
            return true;
        else
            return false;
    }
}

class Program31_4
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        String str = sobj.nextLine();

        StringDemo obj = new StringDemo();

        if(obj.checkVowel(str) == true)
            System.out.println("TRUE");
        else
            System.out.println("FALSE");
    }
}