/*
    Accept marks of N students and display class of each student

    Less than 35-       Fail
    Less than 50-       Pass class
    Less than 60-       Second class
    Less than 70-       First class
    Greater than 70-    First class with distinction 

    Input : 67.3    45.8    88.9    77.5    55.2
    Output: 67.3    First class
            45.8    Pass class
            88.9    First class with distinction
            77.5    First class with distinction
            55.2    Second class
*/

import java.util.*;

class ArrayX
{
    public float array[];

    public ArrayX(int size)
    {
        array = new float[size];
    }

    public void accept()
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter elements of array:");
        for(int iCnt = 0; iCnt < array.length; ++iCnt)
            array[iCnt] = scan.nextFloat();
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

    public void displayClass()
    {
        System.out.println("Class of each student is :");
        for(int iCnt = 0; iCnt < array.length; ++iCnt)
        {
            if(array[iCnt] <= 35.0)
                System.out.println("\t"+array[iCnt]+"\tFail");
            else if(array[iCnt] <= 50.0)
                System.out.println("\t"+array[iCnt]+"\tPass class");
            else if(array[iCnt] <= 60.0)
                System.out.println("\t"+array[iCnt]+"\tSecond class");
            else if(array[iCnt] <= 70.0)
                System.out.println("\t"+array[iCnt]+"\tFirst class");
            else
                System.out.println("\t"+array[iCnt]+"\tFirst class with distinction");
        }
    }
}

class Program43_4
{
    public static void main(String a[])
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int array_size = scan.nextInt();

        Arithmetic myarray = new Arithmetic(array_size);
        myarray.accept();

        myarray.displayClass();
    }
}
