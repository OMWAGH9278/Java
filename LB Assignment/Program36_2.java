// Display below pattern

// Input : iRow = 4     iCol = 4

/* Output: A    B   C   D
           a    b   c   d
           A    B   C   D
           a    b   c   d 
*/
import java.util.*;

class Pattern
{
    public void pattern(int iRow, int iCol)
    {
        char ch = '\0';
        for(int i = 1; i <= iRow; ++i)
        {
            if((i % 2) == 0)
            {
                ch = 'A';
            }
            else
            {
                ch = 'a';
            }
            for(int j = 1; j <= iCol; ++j)
            {
                System.out.print(ch+"\t");
                ch++;
            }
            System.out.println();
        }
    }
}

class Program36_2
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