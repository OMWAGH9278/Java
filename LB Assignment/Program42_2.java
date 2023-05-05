/*
    Accept two arrays from user and display minimum of each array

    Input : 2   9   7   5   2   3   
            9   3   5   5
    Output: 2   3
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

    public int minimum()
    {
        int iMin = array[0];
        for(int iCnt = 0; iCnt < array.length; ++iCnt)
        {
            if(array[iCnt] < iMin)
                iMin = array[iCnt];
        }
        return (iMin);
    }
}

class Program42_2
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

        int minimum_element = first_array.minimum();
        System.out.print(minimum_element+"\t");
        minimum_element = second_array.minimum();
        System.out.println(minimum_element);
    }
}