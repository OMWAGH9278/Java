// Display below pattern

// Input : iRow = 4     iCol = 4

/* Output: A    B   C   D
           A    B   C   D
           A    B   C   D
           A    B   C   D 
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
                ch++;
            }
            ch = 'A';
            System.out.println();
        }
    }
}

class Program36_1
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