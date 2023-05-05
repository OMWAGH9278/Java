
import java.util.*;

/* 
    Row = 4
    Col = 4

    1   2   3   4
    5   6   7   8
    9   1   2   3
    4   5   6   7 
*/

class Pattern
{
    public void display(int iRow, int iCol)
    {
        int i = 0, j = 0;
        int iCnt = 1;

        for(i = 1; i <= iRow; i++)
        {
            for(j = 1; j <= iCol; j++,iCnt++)
            {
                System.out.print(iCnt+"\t");
            }
            System.out.println();
        }
    }
}

class Program37
{
    public static void main(String a[])
    {
        Pattern pobj = new Pattern();
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of rows :");
        int i = sobj.nextInt();
        System.out.println("Enter number of columns :");
        int j = sobj.nextInt();

        pobj.display(i, j);
    }
}