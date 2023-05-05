// Interface is a blueprint of class which contains all abstract 
// methods in it

// Interface class achieves 100% abstraction

interface Circle
{
    float pi = 3.14f;  // public static final float PI = 3.14f;

    float Area(float radius);  // public abstract float Area(float Radius);
    float Circumference(float radius);  // public abstract float Circumference(float Radius);
}

class Marvellous implements Circle
{
    public float Area(float radius)
    {
        return pi * radius * radius;
    }
    public float Circumference(float radius)
    {
        return 2 * pi * radius;
    }
}

class InterfaceDemo
{
    public static void main(String a[])
    {
        System.out.println("Value of pi is : "+Circle.pi);  // To demonstrate public and static
        // Circle.PI = 7.12f;  To demonstrate final
        Circle cobj = new Marvellous();
        float ret = 0.0f;
        ret = cobj.Area(10.5f);
        System.out.println("Area is : "+ret);
        ret = cobj.Circumference(10.5f);
        System.out.println("Circumference is : "+ret);
    }
}