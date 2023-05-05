// Accept number from user and return count of even digits

// Input : 2395
// Output : 1

// Input : 1018
// Output : 2

// Input : -1018
// Output : 2

// Input : 8462
// Output : 4

import java.util.*;

class Digit
{
    public int countEven(int iNo)
    {
        int iEvenCnt = 0, iDigit = 0;
        
        while(iNo != 0)
        {
            iDigit = iNo % 10;
            if((iDigit % 2) == 0)
            {
                iEvenCnt++;
            }
            iNo = iNo / 10;
        }

        return (iEvenCnt);
    }
}

class Program33_1
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number: ");
        int iValue = sobj.nextInt();

        Digit dobj = new Digit();
        int iRet = dobj.countEven(iValue);
        System.out.println("Number of even digits are: "+iRet);
    }
}