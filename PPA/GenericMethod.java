
class GenericMethod
{
    public static <T> void Display(T arr[])
    {
        for(int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }

    public static void main(String a[])
    {
        Integer iArr[] = {10,20,30,40};

        Display(iArr);

        Character cArr[] = {'a','b','c','d'};

        Display(cArr);

        Float fArr[] = {10.50f,20.60f,30.70f,40.80f};

        Display(fArr);
    }
}