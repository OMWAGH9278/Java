// Display below pattern

// Input : iRow = 3     iCol = 4

/* Output:  *   #   *   #
            *   #   *   #
            *   #   *   #
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
                if((j % 2) == 0)
                {
                    System.out.print("*\t");
                }
                else
                {
                    System.out.print("#\t");
                }
            }
            System.out.println();
        }
    }
}

class Program37_4
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