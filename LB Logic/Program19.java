
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

    public int addition()
    {
        int iSum = 0;

        for(int iCnt = 0; iCnt < arr.length; iCnt++)
        {
            iSum = iSum + arr[iCnt];
        }

        return iSum;
    }
}

class Program19
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the size of array that you want to allocate :");
        int iSize = sobj.nextInt();

        MarvellousX mobj = new MarvellousX(iSize);

        mobj.accept();
        mobj.display();

        int iRet = mobj.addition();
        System.out.println("Addition of all elements of array is : "+iRet);
    }
}