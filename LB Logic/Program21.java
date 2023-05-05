
import java.util.*;

class Program21
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        int iCnt = 0;

        System.out.println("Enter the size of array :");
        int iSize = sobj.nextInt();

        int arr[] = new int[iSize];

        System.out.println("Enter the elements of array : ");

        for(iCnt = 0; iCnt < arr.length; iCnt++)
        {
            arr[iCnt] = sobj.nextInt();
        }

        int iSum = 0;
        for(iCnt = 0; iCnt < arr.length; iCnt++)
        {
            iSum = iSum + arr[iCnt];
        }

        System.out.println("Addition is : "+iSum);
    }
}