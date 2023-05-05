// Accept N numbers from user and display elements divisible by 5

// Input : N:   6
//         Elements: 85    66    3    80    93    88
// Output : 85    85

import java.util.*;

class ArrayX
{
    public int arr[];

    public ArrayX(int iSize)
    {
        arr = new int[iSize];
    }

    public void accept()
    {
        int iCnt = 0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter elements of array: ");
        for(iCnt = 0; iCnt < arr.length; ++iCnt)
        {
            arr[iCnt] = sobj.nextInt();
        }
    }

    public void display()
    {
        int iCnt = 0;
        System.out.println("Elements of array are: ");
        for(iCnt = 0; iCnt < arr.length; ++iCnt)
        {
            System.out.print(arr[iCnt]+"\t");
        }
        System.out.println();
    }
}

class Arithmetic extends ArrayX
{
    public Arithmetic(int iSize)
    {
        super(iSize);
    }

    public void displayDivisibleBy5()
    {
        int iCnt = 0;

        System.out.println("Elements divisible by 5 are: ");

        for(iCnt = 0; iCnt < arr.length; ++iCnt)
        {
            if((arr[iCnt] % 5) == 0)
            {
                System.out.println(arr[iCnt]+"\t");
            }
        }
        System.out.println();
    }
}

class Program32_2

{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter size of array: ");
        int iSize = sobj.nextInt();

        Arithmetic aobj = new Arithmetic(iSize);
        aobj.accept();
        aobj.display();

        aobj.displayDivisibleBy5();
    }
}