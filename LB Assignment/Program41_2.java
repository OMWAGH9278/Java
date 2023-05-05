/*
    Accept two arrays from user and display even contents of arrays

    Input : 2   9   6   5   2   3   
            45  6   12  18  23  4
    Output: 2   6   2   
            6   12  18  4
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

    public void displayEven()
    {
        System.out.println("Even elements of "+str+" array are:");
        for(int iCnt = 0; iCnt < array.length; ++iCnt)
        {
            if((array[iCnt] % 2) == 0)
                System.out.print(array[iCnt]+"\t");
        }
        System.out.println();   
    }
}

class Program41_2
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

        first_array.displayEven();
        second_array.displayEven();
    }
}