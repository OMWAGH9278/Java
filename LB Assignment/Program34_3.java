// Accept N numbers from user and another number No from user 
// and return index of last occurence of that element in array

// Input : N:   6
//         No:  66
//         Elements: 85    66    3    66    93    88
// Output : 3

// Input : N:   6
//         No:  12
//         Elements: 85    11    3    15    11    111
// Output : -1

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

    public int indexLastOcc(int iNo)
    {
        int iCnt = 0, index = -1;

        for(iCnt = 0; iCnt < arr.length; ++iCnt)
        {
            if(arr[iCnt] == iNo)
            {
                index = iCnt;
            }
        }
        return index;
    }
}

class Program34_3

{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter size of array: ");
        int iSize = sobj.nextInt();

        Arithmetic aobj = new Arithmetic(iSize);
        aobj.accept();
        aobj.display();

        System.out.println("Enter element to check in array:");
        int iNo = sobj.nextInt();

        int iRet = aobj.indexLastOcc(iNo);
        System.out.println("Index of Last Occurence is: "+iRet);
    }
}