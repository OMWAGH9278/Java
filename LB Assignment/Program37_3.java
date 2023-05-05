// Display below pattern

// Input : iRow = 3     iCol = 5

/* Output:  5   4   3   2   1
            5   4   3   2   1   
            5   4   3   2   1
*/
import java.util.*;

class Pattern
{
    public void pattern(int iRow, int iCol)
    {
        int ino = iCol;
        for(int i = 1; i <= iRow; ++i)
        {
            for(int j = 1; j <= iCol; ++j)
            {
                System.out.print(ino+"\t");
                ino--;
            }
            ino = iCol;
            System.out.println();
        }
    }
}

class Program37_3
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