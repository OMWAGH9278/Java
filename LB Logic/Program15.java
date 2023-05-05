
import java.util.*;

class Digits
{
    public boolean checkAmstrong(int iNo)
    {
        int iDigitCount = 0;
        int iTemp = iNo;
        int iDigit = 0;
        int iCnt = 0, iPower = 1, iSum = 0;

        while(iTemp != 0)  // Logic to count no. of digits
        {
            iDigitCount++;
            iTemp = iTemp / 10;
        }

        iTemp = iNo;

        while(iTemp != 0)
        {
            iDigit = iTemp % 10;

            for(iCnt = 0; iCnt < iDigitCount; iCnt++)  // Logic to calculate power
            {
                iPower = iPower * iDigit;
            }

            iSum = iSum + iPower;
            iPower = 1;  // *******

            iTemp = iTemp / 10;
        }

        if(iSum == iNo)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class Program15
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