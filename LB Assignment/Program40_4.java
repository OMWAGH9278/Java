// Display below pattern

// Input : iRow = 6     iCol = 6

/* Output:  *   *   *   *   *   *   
            *   #   #   #   *   *
            *   #   #   *   $   *
            *   #   *   $   $   *
            *   *   $   $   $   *
            *   *   *   *   *   *
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
                if((i+j == iCol+1) || (i == 1) || (j == 1)
                        || (i == iRow) || (j == iCol))
                    System.out.print("*\t");
                else if((i >= 2) && (i <= iRow-2) && (i+j <= iCol) 
                        && (j >= 2) && (j <= iCol-2))
                    System.out.print("#\t");
                else
                    System.out.print("$\t");
            }
            System.out.println();
        }
    }
}

class Program40_4
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