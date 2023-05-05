
import java.util.*;

class Arithmatic
{
    public int Multiplication(int iValue1, int iValue2)
    {
        return iValue1 * iValue2;
    }
}

class Practice1
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter first number :");
        int iNo1 = sobj.nextInt();

        System.out.println("Enter second number :");
        int iNo2 = sobj.nextInt();
        sobj.close();

        Arithmatic aobj = new Arithmatic();

        int iRet = aobj.Multiplication(iNo1, iNo2);
        System.out.println("Multiplication of numbers is : "+iRet);
    } 
}