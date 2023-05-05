
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
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please enter "+arr.length+" elements :");
        for(int iCnt = 0; iCnt < arr.length; iCnt++)
        {
            System.out.println("Enter the element no : "+(iCnt+1));
            arr[iCnt] = sobj.nextInt();
        }
    }

    public void display()
    {
        System.out.println("Elements of array are :");

        for(int iCnt = 0; iCnt < arr.length; iCnt++)
        {
            System.out.print(arr[iCnt]+"\t");
        }
        System.out.println();
    }
}

class Program18
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the size of array that you want to allocate :");
        int iSize = sobj.nextInt();

        ArrayX obj = new ArrayX(iSize);
        obj.accept();
        obj.display();
    }
}