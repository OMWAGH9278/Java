/*
    Accept array of integers
    Display below pattern 

    Input : 8   9   7   6   4   2   4
    Output: 
            *   *   *   *   *   *   *   *
            *   *   *   *   *   *   *   *   *
            *   *   *   *   *   *   *   
            *   *   *   *   *   *
            *   *   *   *
            *   *
            *   *   *   *
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

    public void pattern()
    {
        for(int i = 0; i < array.length; ++i)
        {
            for(int j = 1; j <= array[i]; ++j)
                System.out.print("*\t");
            System.out.println();
        }
    }
}

class Program44_5
{
    public static void main(String a[])
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int array_size = scan.nextInt();

        Arithmetic myarray = new Arithmetic(array_size);
        myarray.accept();

        myarray.pattern();
    }
}
