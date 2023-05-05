
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

class Program17
{
    public static void main(String a[])
    {
        ArrayX obj = new ArrayX(5);
        obj.accept();
        obj.display();
    }
}