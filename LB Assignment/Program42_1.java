/*
    Accept two arrays from user and display difference of summation of each array

    Input : 2   9   7   5   2   3   
            9   3   5   5
    Output: 6
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

    public int diffSummation(int arr[])
    {
        int iSumArray = 0, iSumArr = 0;

        for(int iCnt = 0; (iCnt < array.length) || ((iCnt < arr.length)); ++iCnt)
        {
            if(array.length > arr.length)
            {
                if(iCnt >= arr.length)
                    iSumArray = iSumArray + array[iCnt];
                else 
                {
                    iSumArray = iSumArray + array[iCnt];
                    iSumArr = iSumArr + arr[iCnt];
                }
            }
            else if(array.length == arr.length)
            {
                iSumArray = iSumArray + array[iCnt];
                iSumArr = iSumArr + arr[iCnt];
            }
            else
            {
                if(iCnt >= array.length)
                    iSumArr = iSumArr + arr[iCnt];
                else 
                {
                    iSumArray = iSumArray + array[iCnt];
                    iSumArr = iSumArr + arr[iCnt];
                }
            }
        }
        return (iSumArray-iSumArr);
    }
}

class Program42_1
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

        int difference_of_summation = first_array.diffSummation(second_array.array);
        System.out.print(difference_of_summation);
    }
}