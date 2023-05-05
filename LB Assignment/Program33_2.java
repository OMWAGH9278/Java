// Accept number from user and return count of odd digits

// Input : 2395
// Output : 3

// Input : 1018
// Output : 2

// Input : -1018
// Output : 2

// Input : 8462
// Output : 0

import java.util.*;

class Digit
{
    public int countOdd(int iNo)
    {
        int iOddCnt = 0, iDigit = 0;
        
        while(iNo != 0)
        {
            iDigit = iNo % 10;
            if((iDigit % 2) != 0)
            {
                iOddCnt++;
            }
            iNo = iNo / 10;
        }

        return (iOddCnt);
    }
}

class Program33_2
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number: ");
        int iValue = sobj.nextInt();

        Digit dobj = new Digit();
        int iRet = dobj.countOdd(iValue);
        System.out.println("Number of odd digits are: "+iRet);
    }
}