// Accept N numbers from user and accept range and 
// display all elements from that range

// Input : N:        6
//         Start:    60
//         End:      90
//         Elements: 85    66    3    76    93    88
// Output : 66  76  88

// Input : N:        6
//         Start:    30
//         End:      50
//         Elements: 85    66    3    76    93    88
// Output : 

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

    public void displayRange(int iStart, int iEnd)
    {
        int iCnt = 0;
        System.out.println("Elements of array in range are: ");
        for(iCnt = 0; iCnt < arr.length; ++iCnt)
        {
            if((arr[iCnt] > iStart) && (arr[iCnt] < iEnd))
            {
                System.out.print(arr[iCnt]+"\t");
            }
        }
        System.out.println();
    }
}

class Program34_4

{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter size of array: ");
        int iSize = sobj.nextInt();

        Arithmetic aobj = new Arithmetic(iSize);
        aobj.accept();
        aobj.display();

        System.out.println("Enter start range:");
        int iStart = sobj.nextInt();
        System.out.println("Enter end range:");
        int iEnd = sobj.nextInt();

        aobj.displayRange(iStart, iEnd);
    }
}