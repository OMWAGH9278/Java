
import java.util.*;

class Arithmatic
{
    public int iValue1;  // Characteristics
    public int iValue2;  // Characteristics

    public Arithmatic(int i, int j)  // Parametrised Constructor
    {
        iValue1 = i;
        iValue2 = j;
    }

    public int Addition()  // Behaviour
    {
        int iSum = 0;
        iSum = iValue1 + iValue2;
        return iSum;
    }
}

class Program6
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo1 = 0, iNo2 = 0, iAns = 0;

        System.out.println("Enter first number :");
        iNo1 = sobj.nextInt();
        System.out.println("Enter second number :");
        iNo2 = sobj.nextInt();
        sobj.close();

        Arithmatic aobj = new Arithmatic(iNo1,iNo2);

        iAns = aobj.Addition();

        System.out.println("Addition is :"+iAns);
    }
}