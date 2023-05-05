/*
    Accept two arrays from user and return new reversed array of each array

    Input : 2   9   7   5   2   3   
            9   3   5   5
    Output: 3   2   5   7   9   2
            5   5   3   9
*/

import java.util.*;

class ArrayX
{
    public int array[];
    public int iSize;
    public String str;

    public ArrayX(String array_number, int array_size)
    {
        iSize = array_size;
        array = new int[iSize];
        str = array_number;
    }

    public void accept()
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter "+iSize+" elements of "+str+" array");

        for(int iCnt = 0; iCnt < array.length; ++iCnt)
            array[iCnt] = scan.nextInt();

    }

    public void display()
    {
        System.out.println("Elements of "+str+" array are:");
        for(int iCnt = 0; iCnt < array.length; ++iCnt)
            System.out.print(array[iCnt]+"\t");

        System.out.println();
    }
}

class Arithmetic extends ArrayX
{
    public Arithmetic(String str, int iSize)
    {
        super(str, iSize);
    }

    public int[] copyArrayRev()
    {
        int rev_array[] = new int[array.length];

        for(int i = 0, j = array.length-1; i < array.length; ++i, --j)
            rev_array[i] = array[j];

        return (rev_array);
    }

    public void displayArray(int arr[])
    {
        System.out.println("Elements of reversed "+str+" array are:");
        for(int iCnt = 0; iCnt < arr.length; ++iCnt)
            System.out.print(arr[iCnt]+"\t");

        System.out.println();
    }
}

class Program42_3
{
    public static void main(String a[])
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter size of first array: ");
        int first_array_size = scan.nextInt();
        System.out.println("Enter size of second array: ");
        int second_array_size = scan.nextInt();

        Arithmetic first_array = new Arithmetic("First", first_array_size);
        first_array.accept();
        first_array.display();
        
        Arithmetic second_array = new Arithmetic("Second", second_array_size);
        second_array.accept();
        second_array.display();

        first_array.displayArray(first_array.copyArrayRev());
        second_array.displayArray(second_array.copyArrayRev());
    }
}