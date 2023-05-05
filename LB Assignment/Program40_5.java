// Display below pattern

// Input : iRow = 4     iCol = 4

/* Output:  1   2   3   4   5
            1   2           5
            1       3       5
            1           4   5
            1   2   3   4   5
*/

import java.util.*;

class Pattern
{
    public void pattern(int iRow, int iCol)
    {
        for(int i = 0; i <= iRow; ++i)
        {
            for(int j = 0; j <= iCol; ++j)
            {
                if((i == 0) || ( j == 0) || (i == iRow) 
                        || ( j == iCol) || (i == j))
                    System.out.print(j+1+"\t");
                else
                    System.out.print(" \t");
            }
            System.out.println();
        }
    }
}

class Program40_5
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