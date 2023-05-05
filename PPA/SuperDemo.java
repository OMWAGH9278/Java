
class Base
{
    public int iA,iB;
    public Base(int iNo1, int iNo2)
    {
        this.iA = iNo1;
        this.iB = iNo2;
    }
    public void fun()
    {
        System.out.println("Inside Base fun");
        System.out.println("Value of A from fun method is : "+this.iA);
    }
}

class Derived extends Base
{
    public int iX,iY;
    public Derived(int i, int j, int k, int l)
    {
        super(k,l);  // 1 usecase
        this.iX = i;
        this.iY = j;
    }
    public void gun()
    {
        System.out.println("Value of A from gun method is : "+super.iA);  // 2 usecase
        super.fun();  // 3 usecase
    }
}

class SuperDemo
{
    public static void main(String a[])
    {
        Derived dobj = new Derived(11,21,51,101);
        dobj.gun();
    } 
}