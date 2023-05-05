/*
    Accept two arrays from user and concat them to form new array

    Input : 12  57  28  3
            99  23  54  58  6   67
    Output: 12  57  28  3   99  23  54  58  6   67
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

    public int[] concatArray(Arithmetic next_array)
    {
        int new_array[] = new int[array.length + next_array.array.length];

        for(int iCnt = 0; iCnt < new_array.length; ++iCnt)
        {
            if(iCnt < array.length)
                new_array[iCnt] = array[iCnt];
            else 
            {
                new_array[iCnt] = next_array.array[iCnt-array.length];
            }
        }

        return new_array;
    }

    public void displayArray(int arr[])
    {
        System.out.println("Elements of new array are:");
        for(int iCnt = 0; iCnt < arr.length; ++iCnt)
            System.out.print(arr[iCnt]+"\t");
        System.out.println();
    }
}

class Program41_4
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

        int new_array[];
        new_array = first_array.concatArray(second_array);
        first_array.displayArray(new_array);
    }
}