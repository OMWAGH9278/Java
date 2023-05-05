import java.util.Scanner;

class Array
{
    public int iSize;
    public int arr[];

    public Array(int iNo)
    {
        iSize = iNo;
        arr = new int[iSize];
    }

    public void initializeArray()
    {
        Scanner sobj2 = new Scanner(System.in);

        System.out.println("Enter elements of array :");

        int iCnt = 0;
        while(iCnt < iSize)
        {
            arr[iCnt] = sobj2.nextInt();
            iCnt++;
        }
    }

    public float averageArray()
    {
        int iCnt = 0;
        float iAverage = 0.0f;

        while(iCnt < iSize)
        {
            iAverage = iAverage + ((float)arr[iCnt] / (float)iSize);
            iCnt++;
        }

        return iAverage;
    }
}

class Assignment25_8
{
    public static void main(String a[])
    {
        Scanner sobj1 = new Scanner(System.in);

        System.out.println("Enter size of array :");
        int iValue = sobj1.nextInt();

        Array aobj = new Array(iValue);

        aobj.initializeArray();
        float iRet = aobj.averageArray();
        
        System.out.println("Average of all numbers of array is : "+iRet);
    }
}