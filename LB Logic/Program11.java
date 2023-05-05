
import java.util.*;

class Numbers
{
    public void evenFactorsDisplay(int iNo)
    {
        int iCnt = 0;
                                  // iCnt = iCnt + 2
        for(iCnt = 2; iCnt <= iNo/2; iCnt += 2)  // Time Complexity = n/4
        {
            if(((iNo % iCnt) == 0))
            {
                System.out.println("Even Factor is : "+iCnt);
            }
        }
    }
}

class Program11
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