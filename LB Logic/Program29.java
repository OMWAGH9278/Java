
import java.util.*;

class MarvellousX
{
    public int capitalCount(String s)
    {
        int iCnt = 0;
        for(int i = 0; i < s.length(); i++)
        {
            if(((s.charAt(i)) >= 'A') && (s.charAt(i)) <= 'Z')
            {
                iCnt++;
            }
        }
        return iCnt;
    }
}

class Program29
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter your string :");
        String str = sobj.nextLine();

        MarvellousX mobj = new MarvellousX();
        int iRet = mobj.capitalCount(str);
        System.out.println("Number of capital case letters are : "+iRet);
    }
}