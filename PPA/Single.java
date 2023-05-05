
class Base
{
    public int iA,iB;
    public Base()
    {
        System.out.println("Inside Base constructor");
        this.iA = 10;
        this.iB = 20;
    }
    public void fun()  // Defination
    {
        System.out.println("Inside Base fun");
    }
    public void gun()  // Defination
    {
        System.out.println("Inside Base gun");
    }
    public void fun(int No)  // Overloaded Defination
    {
        System.out.println("Inside Base fun with one integer");
    }
}
class Derived extends Base  // class Derived : public Base
{
    public int iX,iY;
    public Derived()
    {
        System.out.println("Derived constructor");
        this.iX = 30;
        this.iY = 40;
    }
    public void sun()  // Defination
    {
        System.out.println("Inside Derived sun");
    }
    public void gun()  // Overrided Defination
    {
        System.out.println("Inside Derived gun");
    }
}

class Single
{
    public static void main(String arg[])
    {
        // Base bobj1 = new Base();        // No casting
        // Derived dobj1 = new Derived();  // No casting
        Base bobj2 = new Derived();     // Upcasting
        // Derived dobj2 = new Base();  // Downcasting ( Not Allowed)

        bobj2.fun();
        bobj2.fun(11);
        bobj2.gun();
        // bobj2.sun();
    }
}