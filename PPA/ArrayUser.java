import java.util.Scanner;

class ArrayUser
{
    public static void main(String arg[])
    {
        int iCnt = 0;
        int iSum = 0;
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the size of Array : ");
        int iSize = sobj.nextInt();

        int arr[] = new int[iSize];

        System.out.println("Number of elements in the array are : "+arr.length);

        System.out.println("Enter the elements of array : ");
        for(iCnt = 0; iCnt < arr.length; iCnt++)
        {
            arr[iCnt] = sobj.nextInt();
        }

        System.out.println("Elements of the array are : ");
        for(iCnt = 0; iCnt < arr.length; iCnt++)
        {
            System.out.println(arr[iCnt]);
        }

        for(iCnt = 0; iCnt < arr.length; iCnt++)
        {
            iSum = iSum + arr[iCnt];
        }
        
        System.out.println("Addition of array is : "+iSum);
    }
}