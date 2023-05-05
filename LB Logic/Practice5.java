
import java.util.*;

class Arithmatic
{
    public boolean checkPalindrome(int iValue)
    {
        int iDigit = 0, iRev = 0;
        int iTemp = iValue;
        while(iValue != 0)
        {
            iDigit = iValue % 10;
            iRev = (iRev*10) + iDigit;
            iValue = iValue / 10;
        }

        if(iTemp == iRev)
        {
            return true;
        }
        else
        {
            return false;
        }   
    }
}

class Practice5
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number :");
        int iNo = sobj.nextInt();
        sobj.close();

        Arithmatic aobj = new Arithmatic();

        boolean bRet = aobj.checkPalindrome(iNo);

        if(bRet == true)
        {
            System.out.println("The number is a Palindrome");
        }
        else
        {
            System.out.println("The number is not a Palindrome");
        }
    } 
}