import java.util.Scanner;

class Array
{
    public int iSize;
    public int arr[];

    public Array(int a)
    {
        iSize = a;
        arr = new int[iSize];
    }

    public void initializeArray()
    {
        Scanner sobj2 = new Scanner(System.in);

        System.out.println("Enter elements of array :");

        int iCnt = 0;
        while(iCnt < this.iSize)
        {
            arr[iCnt] = sobj2.nextInt();
            iCnt++;
        }
    }

    public int largestNumber()
    {
        int iCnt = 0;
        int iMax = 0;
        while(iCnt < this.iSize)
        {
            if(arr[iCnt] > iMax)
            {
                iMax = arr[iCnt];
            }
            iCnt++;
        }
        return iMax;
    }
}

class Assignment25_7
{
    public static void main(String a[])
    {
        Scanner sobj1 = new Scanner(System.in);

        System.out.println("Enter the size of Array :");
        int iNo = sobj1.nextInt();

        Array aobj = new Array(iNo);

        aobj.initializeArray();
        int iRet = aobj.largestNumber();

        System.out.println("Largest number from array is : "+iRet);
    }
}