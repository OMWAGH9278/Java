public class IncreaseSizeArray 
{
    public static void main(String arr[])
    {
        int a[] = {1,2,3,4,5,6,7};
        for(int c : a)
            System.out.print(c+"    ");
        System.out.println();
        int b[] = new int[2*a.length];
        for(int i = 0; i < a.length; ++i)
            b[i] = a[i];
        a=b;
        for(int c : a)
            System.out.print(c+"    ");
        System.out.println();
    }   
}
