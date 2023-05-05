
import java.util.*;

class Digits
{
    private int countDigits(int iNo)
    {
        int iDigitCnt = 0;

        while(iNo != 0)
        {
            iNo = iNo / 10;
            iDigitCnt++;
        }
        return iDigitCnt;
    }

    private int power(int base, int index)
    {
        int iAns = 1;

        for(int iCnt = 1; iCnt <= index; iCnt++)
        {
            iAns = iAns * base;
        }
        return iAns;
    }

    public boolean checkAmstrong(int iNo)
    {
        int iDigit = 0, iDigitSum = 0;
        int temp = iNo;
        int iDigitCnt = countDigits(iNo);
        int iRet = 0;

        while(temp != 0)
        {
            iDigit = temp % 10;

            iRet = power(iDigit,iDigitCnt);
            iDigitSum = iDigitSum + iRet;
            
            temp = temp / 10;
        }

        if(iDigitSum == iNo)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class Program14
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please enter first number :");
        int iNo = sobj.nextInt();
        sobj.close();

        Digits dobj = new Digits();

        boolean bRet = dobj.checkAmstrong(iNo);
        
        if(bRet == true)
        {
            System.out.println(iNo+" is a Amstrong number");
        }
        else
        {
            System.out.println(iNo+" is not a Amstrong number");
        }
    }
}