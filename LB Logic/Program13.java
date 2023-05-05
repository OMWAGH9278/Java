
import java.util.*;

class Numbers
{
    public int factorsMultiplication(int iNo)
    {
        int iCnt = 0, iMult = 1;
                              
        for(iCnt = 1; iCnt <= iNo/2; iCnt++)
        {
            if((iNo % iCnt) == 0)
            {
                iMult = iMult * iCnt;
            }
        }

        return iMult;
    }
}

class Program13
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please enter first number :");
        int iNo = sobj.nextInt();
        sobj.close();

        Numbers nobj = new Numbers();

        int iRet = nobj.factorsMultiplication(iNo);
        System.out.println("Product of Factors of "+iNo+" is : "+iRet);
    }
}