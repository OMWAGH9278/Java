
import java.util.*;

class Numbers
{
    public void evenFactorsDisplay(int iNo)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= iNo/2; iCnt++)
        {
            if(((iNo % iCnt) == 0) && ((iCnt % 2) == 0))  // Time Complexity = n/2
            {
                System.out.println("Even Factor is : "+iCnt);
            }
        }
    }
}

class Program10
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please enter number :");
        int iNo = sobj.nextInt();
        sobj.close();

        Numbers nobj = new Numbers();

        nobj.evenFactorsDisplay(iNo);
    }
}