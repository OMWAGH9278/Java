
import java.util.*;

class Arithmatic
{
    public int charFrquency(String s, char cValue)
    {
        int charCount = 0;

        char crr[] = s.toCharArray();

        for(int iCnt = 0; iCnt < crr.length; iCnt++)
        {
            if(crr[iCnt] == cValue)
            {
                charCount++;
            }
        }

        return charCount;
    }
}

class Practice11
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string :");
        String str = sobj.nextLine();

        System.out.println("Enter character to find frequency :");
        char ch = sobj.next().charAt(0);
        sobj.close();

        Arithmatic aobj = new Arithmatic();

        int iRet = aobj.charFrquency(str,ch);
        
        System.out.println("Frequency of "+ch+" in input string is : "+iRet);
        
    } 
}