// Display below pattern

// Input : iRow = 4     iCol = 4

/* Output:  *   *   *   #   
            *   *   #   *
            *   #   *   *
            #   *   *   *
*/

import java.util.*;

class Pattern
{
    public void pattern(int iRow, int iCol)
    {
        for(int i = 1; i <= iRow; ++i)
        {
            for(int j = 1; j <= iCol; ++j)
            {
                if(i+j <= iCol)
                    System.out.print("*\t");
                else if(i+j >= iCol+2)
                    System.out.print("@\t");
                else
                    System.out.print("#\t");
            }
            System.out.println();
        }
    }
}

class Program40_2
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter rows:");
        int iRow = sobj.nextInt();
        System.out.println("Enter columns:");
        int iCol = sobj.nextInt();

        Pattern pobj = new Pattern();
        pobj.pattern(iRow, iCol);
    }
}