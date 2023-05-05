// Display below pattern

// Input : iRow = 3     iCol = 4

/* Output:  1   2   3   4
            5   6   7   8
            9   10  11  12
*/
import java.util.*;

class Pattern
{
    public void pattern(int iRow, int iCol)
    {
        int iNo = 1;
        for(int i = 1; i <= iRow; ++i)
        {
            for(int j = 1; j <= iCol; ++j)
            {
                System.out.print(iNo+"\t");
                iNo++;
            }
            System.out.println();
        }
    }
}

class Program36_5
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