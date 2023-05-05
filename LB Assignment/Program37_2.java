// Display below pattern

// Input : iRow = 4     iCol = 3

/* Output:  1   2   3
            1   2   3
            1   2   3
            1   2   3
*/
import java.util.*;

class Pattern
{
    public void pattern(int iRow, int iCol)
    {
        int ino = 1;
        for(int i = 1; i <= iRow; ++i)
        {
            for(int j = 1; j <= iCol; ++j)
            {
                System.out.print(ino+"\t");
                ino++;
            }
            ino = 1;
            System.out.println();
        }
    }
}

class Program37_2
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