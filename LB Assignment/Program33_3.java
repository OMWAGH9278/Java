// Accept number from user and return count of digits between 3 and 7

// Input : 2395
// Output : 1

// Input : 1018
// Output : 0

// Input : 4521
// Output : 2

// Input : 9922
// Output : 0

import java.util.*;

class Digit
{
    public int countRange(int iNo)
    {
        int iRangeCnt = 0, iDigit = 0;
        
        while(iNo != 0)
        {
            iDigit = iNo % 10;
            if((iDigit > 3) && (iDigit < 7))
            {
                iRangeCnt++;
            }
            iNo = iNo / 10;
        }

        return (iRangeCnt);
    }
}

class Program33_3
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number: ");
        int iValue = sobj.nextInt();

        Digit dobj = new Digit();
        int iRet = dobj.countRange(iValue);
        System.out.println("Number of digits between 3 and 7 are: "+iRet);
    }
}