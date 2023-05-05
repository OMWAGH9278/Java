
import java.util.*;

class Arithmatic
{
    public boolean checkCapital(char cValue)
    {
        if((cValue >= 'A') && (cValue <= 'Z'))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class Practice10
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter character :");
        char cChar = sobj.next().charAt(0);
        sobj.close();

        Arithmatic aobj = new Arithmatic();

        boolean bRet = aobj.checkCapital(cChar);
        if(bRet == true)
        {
            System.out.println("The input character is capital alphabet");
        }
        else
        {
            System.out.println("The input character is not capital alphabet");
        }
    } 
}