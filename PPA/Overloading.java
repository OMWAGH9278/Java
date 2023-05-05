import java.lang.*;  // Default package in java

class Demo
{
    public void fun()  // fun@0
    {
        System.out.println("fun without parameters");
    }
    public void fun(int i)  // fun@1i
    {
        System.out.println("fun with one integer parameter");
    }
    public void fun( int i, int j)  // fun@2ii
    {
        System.out.println("fun with two parameters");
    }
    public void fun(double i)  // fun@1d
    {
        System.out.println("fun with one double parameter");
    }
}

class Overloading
{
    public static void main(String a[])
    {
        Demo obj = new Demo();

        obj.fun();
        obj.fun(11);
        obj.fun(11,21);
        obj.fun(11.21);
    }
}