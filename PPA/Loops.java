
class Loops
{
    public static void main(String arg[])
    {
        int arr[] = {10,20,30,40};
        int iCnt = 0;

        System.out.println("Traversal of array using for loop");
        for(iCnt = 0; iCnt < arr.length; iCnt++)  // Same in C,C++,Java
        {
            System.out.println(arr[iCnt]);
        }

        System.out.println("Traversal of array using while loop");
        iCnt = 0;
        while(iCnt < arr.length) // Same in C,C++,Java
        {
            System.out.println(arr[iCnt]);
            iCnt++;
        }

        System.out.println("Traversal of array using do while loop");
        iCnt = 0;
        do                       // Same in C,C++,Java
        {
            System.out.println(arr[iCnt]);
            iCnt++;
        }while(iCnt < arr.length); 

        System.out.println("Traversal of array using for-each loop");
        for(int iNo : arr)       // Only in Java 
        {
            System.out.println(iNo);
        }
    }
}