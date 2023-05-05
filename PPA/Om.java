
class Om
{
    public static void main(String a[])
    {
        // int arr1[4] = {10,20,30,40};  // Not Allowed in Java

        int arr2[] = {10,20,30,40};  // 1st Way

        int arr3[] = new int[4];  // 2nd Way
        arr3[0] = 10;  // Member by member initialisation
        arr3[1] = 20;
        arr3[2] = 30;
        arr3[3] = 40;

        int arr4[] = new int[] {10,20,30,40}; // 3rd Way  Member Initialization List
    }
}