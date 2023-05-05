
import java.util.*;

class Arithmatic
{
    public void Display(int iValue)
    {
        System.out.println("Factors are : ");

        for(int iCnt = 1; iCnt <= iValue/2; iCnt++)
        {
            if((iValue % iCnt) == 0)
            {
                System.out.print(iCnt+"\t");
            }
        }
    }
}

class Practice3
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number :");
        int iNo = sobj.nextInt();
        sobj.close();

        Arithmatic aobj = new Arithmatic();

        aobj.Display(iNo);
    } 
}