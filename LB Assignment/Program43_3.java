/*
    Accept array of characters from user and return number of capital characters

    Input : b   N   j   B   R   b   A   d   G   G
    Output: 6
*/

import java.util.*;

class ArrayX
{
    public char array[];

    public ArrayX(int size)
    {
        array = new char[size];
    }

    public void accept()
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter elements of array:");
        for(int iCnt = 0; iCnt < array.length; ++iCnt)
            array[iCnt] = scan.next().charAt(0);
    }

    public void display()
    {
        System.out.println("Elements of array are:");

        for(int iCnt = 0; iCnt < array.length; ++iCnt)
            System.out.print(array[iCnt]+"\t");
        
        System.out.println();
    }
}

class Arithmetic extends ArrayX
{
    public Arithmetic(int size)
    {
        super(size);
    }

    public int capitalChars()
    {
        int iCapitalCnt = 0;
        for(int iCnt = 0; iCnt < array.length; ++iCnt)
        {
            if((array[iCnt] >= 'A') && (array[iCnt] <= 'Z'))
                iCapitalCnt++;
        }
        return iCapitalCnt;
    }
}

class Program43_3
{
    public static void main(String a[])
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int array_size = scan.nextInt();

        Arithmetic myarray = new Arithmetic(array_size);
        myarray.accept();
        myarray.display();

        int iRet = myarray.capitalChars();
        System.out.println("Total capital characters are: "+iRet);
    }
}
