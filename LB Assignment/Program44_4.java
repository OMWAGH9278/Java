/*
    Accept array of characters
    Return difference of capital and small characters 

    Input : b   N   e   B   R   b   A   I   O   G   i
    Output: 3
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

    public int smallChars()
    {
        int iSmallCnt = 0;
        for(int iCnt = 0; iCnt < array.length; ++iCnt)
        {
            if((array[iCnt] >= 'a') && (array[iCnt] <= 'z'))
                iSmallCnt++;
        }
        return iSmallCnt;
    }

    public int difference()
    {
        int iCapitalCount = capitalChars();
        int iSmallCount = smallChars();

        return (iCapitalCount - iSmallCount);
    }
}

class Program44_4
{
    public static void main(String a[])
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int array_size = scan.nextInt();

        Arithmetic myarray = new Arithmetic(array_size);
        myarray.accept();

        int iRet = myarray.difference();
        System.out.println(iRet);
    }
}
