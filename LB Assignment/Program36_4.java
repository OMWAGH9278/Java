// Display below pattern

// Input : iRow = 4     iCol = 5

/* Output:  4   4   4   4   4
            3   3   3   3   3
            2   2   2   2   2
            1   1   1   1   1
*/
import java.util.*;

class Pattern
{
    public void pattern(int iRow, int iCol)
    {
        int iNo = iRow;
        for(int i = 1; i <= iRow; ++i)
        {
            for(int j = 1; j <= iCol; ++j)
            {
                System.out.print(iNo+"\t");
            }
            iNo--;
            System.out.println();
        }
    }
}

class Program36_4
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