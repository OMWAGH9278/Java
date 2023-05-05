// Display below pattern

// Input : iRow = 4     iCol = 4

/* Output:  1   1   1   1
            2   2   2   2
            3   3   3   3
            4   4   4   4
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
                System.out.print(i+"\t");
            }
            System.out.println();
        }
    }
}

class Program37_5
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