
import java.util.*;

class Program20
{
    public static void main(String a[])
    {
        int arr[] = {10,20,30,40,50};
        int iSum = 0;

        for(int i = 0; i < arr.length; i++)
        {
            iSum = iSum + arr[i];
        }

        System.out.println("Addition is : "+iSum);
    }
}