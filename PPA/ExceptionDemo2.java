import java.util.*;

class ExceptionDemo2
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        int arr[] = {10,20,30,40};

        System.out.println("Enter the index of array");
        int i = sobj.nextInt();

        System.out.println("Data at specified index is : "+arr[i]);
    }
}