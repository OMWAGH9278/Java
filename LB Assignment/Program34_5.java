// Accept N numbers from user and return 
// product of odd elements from array

// Input : N:        6
//         Elements: 15    66    3    70    10    88
// Output : 45

// Input : N:        6
//         Elements: 44    66    72    70    10    88
// Output : 0

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

    public int productOddElements()
    {
        int iCnt = 0, iMult = 1, iOddCnt = 0;
        for(iCnt = 0; iCnt < arr.length; ++iCnt)
        {
            if((arr[iCnt] % 2) != 0)
            {
                iMult = iMult * arr[iCnt];
                iOddCnt++;
            }
        }

        if(iOddCnt == 0)
        {
            return (0);
        }
        else
        {
            return iMult;
        }
    }
}

class Program34_5

{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter size of array: ");
        int iSize = sobj.nextInt();

        Arithmetic aobj = new Arithmetic(iSize);
        aobj.accept();
        aobj.display();

        int iRet = aobj.productOddElements();
        System.out.println("Product of odd elements is: "+iRet);
    }
}