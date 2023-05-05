
import java.util.*;

class ArrayX
{
    protected int arr[];

    public ArrayX(int iSize)
    {
        arr = new int[iSize];
    }

    protected void accept()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please enter "+arr.length+" elements :");
        for(int iCnt = 0; iCnt < arr.length; iCnt++)
        {
            System.out.println("Enter the element no : "+(iCnt+1));
            arr[iCnt] = sobj.nextInt();
        }
    }

    protected void display()
    {
        System.out.println("Elements of array are :");

        for(int iCnt = 0; iCnt < arr.length; iCnt++)
        {
            System.out.print(arr[iCnt]+"\t");
        }
        System.out.println();
    }
}

class MarvellousX extends ArrayX
{
    public MarvellousX(int iSize)
    {
        super(iSize);
    }

    public boolean checkPalindrome()
    {
        int iStart = 0;
        int iEnd = arr.length-1;
        boolean bFlag = true;

        while(iStart < iEnd)
        {
            if(arr[iStart] != arr[iEnd])
            {
                bFlag = false;
                break;
            }
            iStart++;
            iEnd--;
        }
        return bFlag;
    }
}

class Program23
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the size of array that you want to create :");
        int iSize = sobj.nextInt();

        MarvellousX mobj = new MarvellousX(iSize);

        mobj.accept();
        mobj.display();

        System.out.println();

        boolean bRet = mobj.checkPalindrome();
        if(bRet == true)
        {
            System.out.println("Array is a Palindrome");
        }
        else
        {
            System.out.println("Array is not a Palindrome");
        }
    }
}