// Accept N numbers from user and return difference 
// between summation of even and odd elements

// Input : N:   6
//         Elements: 85    66    3    80    93    88
// Output : 53

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

    public int difference()
    {
        int iCnt = 0, iEvenSum = 0, iOddSum = 0;

        for(iCnt = 0; iCnt < arr.length; ++iCnt)
        {
            if((arr[iCnt] % 2) == 0)
            {
                iEvenSum = iEvenSum + arr[iCnt];
            }
            else if((arr[iCnt] % 2) != 0)
            {
                iOddSum = iOddSum + arr[iCnt];
            }
            else
            {}
        }

        return (iEvenSum - iOddSum);
    }
}

class Program32_1

{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter size of array: ");
        int iSize = sobj.nextInt();

        Arithmetic aobj = new Arithmetic(iSize);
        aobj.accept();
        aobj.display();

        int iRet = aobj.difference();
        System.out.println("Difference = "+iRet);
    }
}