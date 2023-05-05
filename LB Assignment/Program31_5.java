// Accept string from user and display it in reverse

// Input : "MarvellouS"
// Output : SuollevraM

import java.util.*;

class StringDemo
{
    public String reverse(String str1)
    {
        char crr1[] = str1.toCharArray();
        char cTemp;
        int iStart = 0, iEnd = crr1.length-1;

        while(iStart < iEnd)
        {
            cTemp = crr1[iStart];
            crr1[iStart] = crr1[iEnd];
            crr1[iEnd] = cTemp;
            iStart++; 
            iEnd--;
        }
        String str2 = String.valueOf(crr1);
        return str2;
    }
}

class Program31_5

{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        String str1 = sobj.nextLine();

        StringDemo obj = new StringDemo();

        String str2 = obj.reverse(str1);
        System.out.println(str2);
    }
}