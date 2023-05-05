
import java.util.*;

class MarvellousX
{
    public int digitCount(String s)
    {
        int iCnt = 0;
        for(int i = 0; i < s.length(); i++)
        {
            if(((s.charAt(i)) >= '0') && (s.charAt(i)) <= '9')
            {
                iCnt++;
            }
        }
        return iCnt;
    }
}

class Program30
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter your string :");
        String str = sobj.nextLine();

        MarvellousX mobj = new MarvellousX();
        int iRet = mobj.digitCount(str);
        System.out.println("Number of digit letters are : "+iRet);
    }
}