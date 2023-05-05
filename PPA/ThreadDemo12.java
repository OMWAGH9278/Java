import java.util.Scanner;

class Data 
{
    public int arr[];

    public Data(int size)
    {
        arr = new int[size];
    }

    protected void finalize()
    {
        arr = null;
    }
    
    public void accept()
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter numbers :");

        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = sobj.nextInt();
        }
    }
}

class DemoEven extends Thread 
{
    public Data dobj;

    public DemoEven(Data obj)
    {
        dobj = obj;
    }

    public void run()
    {
        for(int i = 0; i < dobj.arr.length; i++)
        {
            if(dobj.arr[i] % 2 == 0)
            {
                System .out.println("Even number is : "+dobj.arr[i]);
            }
        }
    }
}

class DemoOdd extends Thread 
{
    public Data dobj;

    public DemoOdd(Data obj)
    {
        dobj = obj;
    }

    public void run()
    {
        for(int i = 0; i < dobj.arr.length; i++)
        {
            if(dobj.arr[i] % 2 != 0)
            {
                System .out.println("Odd number is : "+dobj.arr[i]);
            }
        }
    }
}

class ThreadDemo12
{
    public static void main(String a[]) throws InterruptedException
    {
        Data obj1 = new Data(10);

        obj1.accept();

        DemoEven eobj = new DemoEven(obj1);
        DemoOdd oobj = new DemoOdd(obj1);

        Thread t1 = new Thread(eobj);
        Thread t2 = new Thread(oobj);

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }
}