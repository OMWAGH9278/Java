// Accept number from user and return product of its digits

// Input : 2395
// Output : 270

// Input : 1018
// Output : 8

// Input : 9440
// Output : 144

// Input : 922432
// Output : 864

import java.util.*;

class Digit
{
    public int multiply(int iNo)
    {
        int iMult = 1, iDigit = 0;
        
        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iNo = iNo / 10;
            if(iDigit == 0)
            {
                continue;
            }
            iMult = iMult*iDigit;
        }

        return (iMult);
    }
}

class Program33_4
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number: ");
        int iValue = sobj.nextInt();

        Digit dobj = new Digit();
        int iRet = dobj.multiply(iValue);
        System.out.println("Product of digits is: "+iRet);
    }
}