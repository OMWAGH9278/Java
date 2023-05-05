
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
    public Arithmatic(int iSize)
    {
        super(iSize);
    }

    public float average()
    {
        int iSum = 0;
        for(int iCnt = 0; iCnt < arr.length; iCnt++)
        {
            iSum = iSum + arr[iCnt];
        }

        float fAvg = (float)iSum/(float)arr.length;
        
        return fAvg;
    }
}

class Practice6
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter size of array :");
        int iSize = sobj.nextInt();

        Arithmatic aobj = new Arithmatic(iSize);

        aobj.accept();
        aobj.display();
        float iRet = aobj.average();
        System.out.println("The average of elements of array is : "+iRet);
        
        sobj.close();
    } 
}