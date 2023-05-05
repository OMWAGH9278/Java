/*
    Accept array from user and return array of reverse of each element

    Input : 89    687   56    549   87    9
    Output: 98    786   65    945   78    9
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

    public int revElement(int iNo)
    {
        int digit = 0, irev = 0;
        while(iNo != 0)
        {
            digit = iNo % 10;
            irev = (irev*10) + digit;
            iNo = iNo / 10;
        }
        return (irev);
    }

    public void reverseArray()
    {
        for(int iCnt = 0; iCnt < array.length; ++iCnt)
            array[iCnt] = revElement(array[iCnt]);
    }
}

class Program43_1
{
    public static void main(String a[])
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int array_size = scan.nextInt();

        Arithmetic myarray = new Arithmetic(array_size);
        myarray.accept();
        myarray.display();
        myarray.reverseArray();
        System.out.println("Array is reversed");
        myarray.display();
    }
}
