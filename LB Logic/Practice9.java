
/*
    Row = 4
    Col = 4

    *   $   $   $
    *   *   $   $
    *   *   *   $
    *   *   *   *

*/

import java.util.*;

class Arithmatic
{
    public void display(int rows, int columns)
    {
        if(rows != columns)
        {
            System.out.println("Rows and Columns must be EQUAL");
            return;
        }

        for(int i = 1; i <= rows; i++)
        {
            for(int j = 1; j <= columns; j++)
            {
                if(i < j)
                {
                    System.out.print("$\t");
                }
                else
                {
                    System.out.print("*\t");
                }
            }  
            System.out.println(); 
        }
    }
}

class Practice9
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter rows :");
        int iRow = sobj.nextInt();
        System.out.println("Enter columns :");
        int iColumn = sobj.nextInt();
        sobj.close();

        Arithmatic aobj = new Arithmatic();

        aobj.display(iRow,iColumn);
    } 
}