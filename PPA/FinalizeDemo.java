
class Demo
{
    public int iSize;
    public int arr[];

    public Demo(int iNo)
    {
        System.out.println("Inside constructor method");
        iSize = iNo;
        arr = new int[iSize];
    }

    protected void finalize()
    {
        System.out.println("Inside finalize method");
        arr = null;
    }
}

class FinalizeDemo
{
    public static void main(String a[])
    {
        Demo obj = new Demo(4);
        obj = null;
        System.gc();
    }
};