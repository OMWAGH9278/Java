/*
    Accept array from user and replace each element with summation of its digits

    Input : 89    687   56    549   87    9
    Output: 17    21    11    18    15    9
*/

import java.util.*;

class ArrayX
{
    public int array[];

    public ArrayX(int size)
    {
        array = new int[size];
    }

    public void accept()
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter elements of array:");
        for(int iCnt = 0; iCnt < array.length; ++iCnt)
            array[iCnt] = scan.nextInt();
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

    public int summation(int iNo)
    {
        int digit = 0, iSum = 0;
        while(iNo != 0)
        {
            digit = iNo % 10;
            iNo = iNo / 10;
            iSum = iSum + digit;
        }
        return iSum;
    }

    public void sumArray()
    {
        for(int iCnt = 0; iCnt < array.length; ++iCnt)
            array[iCnt] = summation(array[iCnt]);
    }
}

class Program43_2
{
    public static void main(String a[])
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int array_size = scan.nextInt();

        Arithmetic myarray = new Arithmetic(array_size);
        myarray.accept();
        myarray.display();
        myarray.sumArray();
        System.out.println("Summation array is:");
        myarray.display();
    }
}
