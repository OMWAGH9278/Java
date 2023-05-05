
import java.util.*;

class Arithmatic
{
    public void display(int iValue)
    {
        char ch = 'A';
        System.out.println("Alphabets are : ");

        for(int iCnt = 1; iCnt <= iValue; iCnt++)
        {
            System.out.print(ch+"\t");
            ch++;
        }
    }
}

class Practice8
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number :");
        int iNo = sobj.nextInt();
        sobj.close();

        Arithmatic aobj = new Arithmatic();

        aobj.display(iNo);
    } 
}