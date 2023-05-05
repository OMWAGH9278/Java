// Accept number from user and return product of its digits

// Input : 2395
// Output : -15

// Input : 1018
// Output : 6

// Input : 8440
// Output : 16

// Input : 5733
// Output : -18

import java.util.*;

class Digit
{
    public int countDiffSummation(int iNo)
    {
        int iEvenSum = 0, iOddSum = 0, iDigit = 0;
        
        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iNo = iNo / 10;
            if((iDigit % 2) == 0)
            {
                iEvenSum = iEvenSum + iDigit;
            } 
            else
            {
                iOddSum = iOddSum + iDigit;
            }           
        }

        return (iEvenSum - iOddSum);
    }
}

class Program33_5
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number: ");
        int iValue = sobj.nextInt();

        Digit dobj = new Digit();
        int iRet = dobj.countDiffSummation(iValue);
        System.out.println("Difference of even odd summation is: "+iRet);
    }
}