
import java.util.*;

class Numbers
{
    public void evenFactorsDisplay(int iNo)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= iNo/2; iCnt++)  // Time Complexity = n/2
        {
            if((iNo % iCnt) == 0)
            {
                if((iCnt % 2) == 0)
                {
                    System.out.println("Even Factor is : "+iCnt);
                }
            }
        }
    }
}

class Program9
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