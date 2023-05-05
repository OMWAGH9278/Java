
class Wrapper
{
    public static void main(String a[])
    {
        int no = 11;

        Integer iobj = new Integer(no);  // Boxing - Converting primitive to Wrapper

        System.out.println(no);
        System.out.println(iobj);

        int x = iobj;  // Unboxing - Converting Wrapper to primitive
        System.out.println(x);
    }    
}