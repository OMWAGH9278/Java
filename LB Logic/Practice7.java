
import java.util.*;

class ArrayX
{
    public int arr[];

    public ArrayX(int iSize)
    {
        arr = new int[iSize];
    }

    public void accept()
    {   Scanner sobj = new Scanner (System.in);
        System.out.println("Enter elements of array :");
        for(int iCnt = 0; iCnt < arr.length; iCnt++)
        {
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

class Arithmatic extends ArrayX
{
    public int iNo;

    public Arithmatic(int iSize, int a)
    {
        super(iSize);
        iNo = a;
    }

    public boolean checkOccurence()
    {
        Scanner sobj = new Scanner(System.in);
        
        int iCnt = 0;
        for(iCnt = 0; iCnt < arr.length; iCnt++)
        {
            if(arr[iCnt] == iNo)
            {
                break;
            }
        }
        if(iCnt != arr.length)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class Practice7
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter size of array :");
        int iSize = sobj.nextInt();

        System.out.println("Enter number to check occurence in array :");
        int iNo = sobj.nextInt();

        Arithmatic aobj = new Arithmatic(iSize,iNo);

        aobj.accept();
        aobj.display();

        boolean bRet = aobj.checkOccurence();
        if(bRet == true)
        {
            System.out.println(iNo+" is present in array");
        }
        else
        {
            System.out.println(iNo+" is not present in array");
        }
        
        sobj.close();
    } 
}