
// Display Whole Numbers

import java.util.*;

class Arithmatic
{
    public void Display(int iValue)
    {
        int iCnt = 0;
        for(iCnt = 1; iCnt <= iValue; iCnt++)
        {
            System.out.print("\t"+iCnt);
        }
    }
}

class Practice2
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter total numbers :");
        int iNo = sobj.nextInt();
        sobj.close();

        Arithmatic aobj = new Arithmatic();

        aobj.Display(iNo);
    } 
}