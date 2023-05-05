// SAME as constant characteristics of class from C++

class Demo
{
    public int iNo1;
    public final int iNo2 = 11;  // const int iNo2;
    public final int iNo3;  // const int iNo3;

    public Demo()  // : iNo2(11) , iNo3(21)
    {
        iNo1 = 0;
        iNo3 = 21;  // NA in C++
    }
}
class Final1
{
    public static void main(String a[])
    {
        final int i = 51;  // const int i = 51;
        Demo obj = new Demo();
        obj.iNo1++;
        // obj.iNo2++;
        // obj.iNo3++;
    }
}