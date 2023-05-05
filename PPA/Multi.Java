
class Multi
{
    public static void main(String arg[])
    {
        // Arr is 2 Dimensional Array which contains 3 
        // one dimensional array, each one dimensional array  
        // contains 4 elements, each of type integer
        // int Arr[3][4] = { {10,20,30,40},{50,60,70,80},{90,100,110,120}};
        
        // Allowed only in Java
        int arr[][] = { {10,20,30,40},{50,60,70,80},{90,100,110,120}};        

        System.out.println(arr.length);       // 3
        System.out.println(arr[0].length);    // 4
    }
}