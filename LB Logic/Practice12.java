
import java.util.*;

class Arithmatic
{
    public String strcpyToggleX(String str1)
    {
        char crr1[] = str1.toCharArray();
        char crr2[] = new char[str1.length()];

        for(int iCnt = 0; iCnt < crr1.length; iCnt++)
        {
            if((crr1[iCnt] >= 'A') && (crr1[iCnt] <= 'Z'))
            {
                crr2[iCnt] = Character.toLowerCase(crr1[iCnt]);
            }
            else if((crr1[iCnt] >= 'a') && (crr1[iCnt] <= 'z'))
            {
                crr2[iCnt] = Character.toUpperCase(crr1[iCnt]);
            }
            else 
            {
                crr2[iCnt] = crr1[iCnt];
            }
        }

        String str2 = new String(crr2);

        return str2;
    }
}

class Practice12
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string :");
        String str1 = sobj.nextLine();
        sobj.close();

        Arithmatic aobj = new Arithmatic();

        String str2 = aobj.strcpyToggleX(str1);
        
        System.out.println("Toggled string is : "+str2);
    } 
}