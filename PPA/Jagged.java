
class Jagged
{
    public static void main(String arg[])
    {
        int arr[][] = { {10,20},{50,60,70,80},{90,100,110}};        

        System.out.println(arr.length);     // 3
        System.out.println(arr[0].length);  // 2
        System.out.println(arr[1].length);  // 4
        System.out.println(arr[2].length);  // 3
        System.out.println(arr[0][1]);  // 20
        System.out.println(arr[0][0]);  // 10
        System.out.println(arr[2][2]);  // 110
        System.out.println(arr[1][1]);  // 60
        System.out.println(arr[1][3]);  // 80
        System.out.println(arr[1][2]);  // 70
        System.out.println(arr[2][1]);  // 100  
    }
}