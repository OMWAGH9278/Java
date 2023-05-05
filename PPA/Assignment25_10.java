import java.util.Scanner;

class Array
{
    public int iRow;
    public int arr[];

    public Array(int iNo)
    {
        iRow = iNo;
        arr = new int[iRow];
    }
}

class JaggedArray
{
    public int iRow;
    public int iRowSize;
    public int arr[][];

    public JaggedArray(int iNo1, int iNo2)
    {
        iRow = iNo1;
        iRowSize = iNo2;
        arr = new int[iNo1][iNo2];
    }
}

class Assignment25_10
{
    public static void main(String a[])
    {
        Scanner sobj1 = new Scanner(System.in);

        System.out.println("Enter number of rows of jagged array :");
        int iValue = sobj1.nextInt();

        Array aobj = new Array(iValue); 

        int iCnt = 0;
        while(iCnt < iValue)
        {
            System.out.println("Enter size of "+iCnt+" indexed row :");
            aobj.arr[iCnt] = sobj1.nextInt();
            
            JaggedArray jobj = new JaggedArray(iCnt,aobj.arr[iCnt]);
            iCnt++;
        }
    }
}