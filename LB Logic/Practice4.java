
import java.util.*;

class Arithmatic
{
    public int countDigits(int iValue)
    {
        int iCount = 0;
        while(iValue != 0)
        {
            iValue = iValue / 10;
            iCount++;
        }
        return iCount;
    }
}

class Practice4
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number :");
        int iNo = sobj.nextInt();
        sobj.close();

        Arithmatic aobj = new Arithmatic();

        int iRet = aobj.countDigits(iNo);
        System.out.println("The number of digits are : "+iRet);
    } 
}