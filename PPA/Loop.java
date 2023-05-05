package Marvellous.PPA;  // Nested Package

public class Loop
{
    public void Display()
    {
        int arr[] = new int[4];

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;

        System.out.println("Elements of Array are : ");

        for( int iCnt = 0; iCnt < arr.length; iCnt++)
        {
            System.out.println(arr[iCnt]);
        }
    }
}