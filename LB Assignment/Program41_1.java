/*
    Accept two arrays from user and display contents of arrays

    Input : 2   9   7   5   2   3   
            9   3   5   5
    Output: 2   9   7   5   2   3   
            9   3   5   5
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
        {
            array[iCnt] = scan.nextInt();
        }
    }

    public void display()
    {
        System.out.println("Elements of "+str+" array are:");
        for(int iCnt = 0; iCnt < array.length; ++iCnt)
        {
            System.out.print(array[iCnt]+"\t");
        }
        System.out.println();
    }
}

class Program41_1
{
    public static void main(String a[])
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter size of first array: ");
        int first_array_size = scan.nextInt();

        ArrayX first_array = new ArrayX("First", first_array_size);
        first_array.accept();
        first_array.display();
        
        System.out.println("Enter size of second array: ");
        int second_array_size = scan.nextInt();

        ArrayX second_array = new ArrayX("Second", second_array_size);
        second_array.accept();
        second_array.display();
    }
}