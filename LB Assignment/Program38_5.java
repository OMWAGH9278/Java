/*
    Accept string from user and display below pattern

    Input:  Hello
    Output: H   
            H   e
            H   e   l
            H   e   l   l
            H   e   l   l   o
            H   e   l   l
            H   e   l
            H   e
            H
*/

import java.util.*;

class Pattern
{
    public void pattern(String str)
    {
        int i = 0;
        int j = 0;
        int k = 1;

        for(i = 0; i < (str.length()*2)-1; ++i)
        {
            if(i < str.length())
            {
                for(j = 0; j <= i; ++j)
                {
                    System.out.print(str.charAt(j)+"\t");
                }
            }
            else
            {
                for(j = 0; j < (i - k); ++j)
                {
                    System.out.print(str.charAt(j)+"\t");
                }
                k = k+2;
            }
            System.out.println();
        }
    }
}

class Program38_5
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String: ");
        String str = sobj.nextLine();

        Pattern pobj = new Pattern();
        pobj.pattern(str);
    }
}