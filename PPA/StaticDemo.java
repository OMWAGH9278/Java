
class StaticDemo
{
    static
    {
        System.out.println("Inside staic block of StaticDemo class with main");
    }
    public StaticDemo()
    {
        System.out.println("Inside constuctor of StaticDemo");
    }
    public static void main(String arg[])
    {
        System.out.println("Inside main");
        
        System.out.println("Value of static iNo3 : "+Demo.iNo3);  // Demo::iNo3
        System.out.println("Value of static iNo4 : "+Demo.iNo4);  // Demo::iNo4
        Demo.gun();  // Demo::gun();

        Demo obj1 = new Demo();
        Demo obj2 = new Demo();
        obj1.Fun();
    }
}

class Demo
{
    public int iNo1;         // non static characteristics
    public int iNo2;         // non static characteristics
    public static int iNo3;  // static characteristics
    public static int iNo4;  // static characteristics

    static                     // static block
    {
        System.out.println("Inside static block fron Demo class");
        iNo3 = 51;
        iNo4 = 101;
    }
    public Demo()              // constructor
    {
        System.out.println("Inside constructor");
        iNo1 = 11;
        iNo2 = 21;
    }
    public void Fun()          // non static method
    {
        // Non static method can access static as well as non static data
        // We can use this keyword
        System.out.println("Inside non static method Fun");
        System.out.println("Value of iNo1 : "+this.iNo1);
        System.out.println("Value of iNo2 : "+this.iNo2);
        System.out.println("Value of iNo3 : "+this.iNo3);
        System.out.println("Value of iNo4 : "+this.iNo4);
    }
    public static void gun()   // static method
    {
        // static method can access only static data
        // We cant use this keyword
        System.out.println("Inside static method gun");
        // System.out.println("Value of iNo1 : "+iNo1);
        // System.out.println("Value of iNo2 : "+iNo2);
        System.out.println("Value of iNo3 : "+iNo3);
        System.out.println("Value of iNo4 : "+iNo4);
    }
}