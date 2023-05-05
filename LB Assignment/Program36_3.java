// Display below pattern

// Input : iRow = 3     iCol = 5

/* Output: A    A   A   A   A
           B    B   B   B   B
           C    C   C   C   C
*/
import java.util.*;

class Pattern
{
    public void pattern(int iRow, int iCol)
    {
        char ch = 'A';
        for(int i = 1; i <= iRow; ++i)
        {
            for(int j = 1; j <= iCol; ++j)
            {
                System.out.print(ch+"\t");
            }
            ch++;
            System.out.println();
        }
    }
}

class Program36_3
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