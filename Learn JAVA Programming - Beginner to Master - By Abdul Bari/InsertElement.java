import java.util.Scanner;

class InsertElement 
{
    public static void main(String arr[])
    {
        int a[] = {1,2,3,5,8,1,0,0,0,0};
        for(int b : a)
            System.out.print(b);
        System.out.println();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter position to insert data at :");
        int position = in.nextInt();
        System.out.println("Enter data to insert :");
        int data = in.nextInt();
        for(int i = 1; i <= a.length-position; i++)
            a[a.length-i] = a[(a.length-i)-1];
        a[position-1] = data;
        in.close();
        for(int b : a)
            System.out.print(b);
        System.out.println();
    }    
}
