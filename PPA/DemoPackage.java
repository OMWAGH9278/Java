import java.util.*;            // inbuilt package
import Marvellous.Arithmatic;  // user defined package
import Marvellous.PPA.Loop;    // user defined package

class DemoPackage
{
    public static void main(String arr[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter first number");
        int iNo1 = sobj.nextInt();
        System.out.println("Enter second number");
        int iNo2 = sobj.nextInt();
        Arithmatic aobj = new Arithmatic( iNo1, iNo2);

        int iResult = aobj.Addition();
        System.out.println("Addition is : "+iResult);

        iResult = aobj.Substraction();
        System.out.println("Substraction is : "+iResult);

        Loop lobj = new Loop();
        lobj.Display();
    }
}