
class ArrayDemo
{
    public static void main(String arg[])
    {
        // Ways of creating Single dimensional array

        int arr1[] = {10,20,30,40};
        // int arr2[4] = {10,20,30,40}; Explicite size is not allowed in java

        int arr3[] = new int[4]; // Dynamic memory allocation
        arr3[0] = 10;
        arr3[1] = 20;
        arr3[2] = 30;
        arr3[3] = 40;

        int arr4[] = new int[] {10,20,30,40}; // Dynamic Memory with Initialisation List

    }
}