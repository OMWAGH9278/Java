
import java.util.*;

class MarvellousX
{
    public int smallCount(String s)
    {
        int iCnt = 0;
        for(int i = 0; i < s.length(); i++)
        {
            if(((s.charAt(i)) >= 'a') && (s.charAt(i)) <= 'z')
            {
                iCnt++;
            }
        }
        return iCnt;
    }
}

class Program28
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter your string :");
        String str = sobj.nextLine();

        MarvellousX mobj = new MarvellousX();
        int iRet = mobj.smallCount(str);
        System.out.println("Number of small case letters are : "+iRet);
    }
}