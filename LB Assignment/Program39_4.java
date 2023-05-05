/*
    Accept string from user and display below pattern

    Input:  Hello
    Output: H   e   l   l   o
            H   e   l   l   *
            H   e   l   *   *
            H   e   *   *   *
            H   *   *   *   * 
            H   e   *   *   * 
            H   e   l   *   * 
            H   e   l   l   * 
            H   e   l   l   o
*/

import java.util.*;

class Pattern
{
    public void pattern(String str)
    {
        int i = 0;
        int j = 0;

        for(i = 0; i < (str.length()*2)-1; ++i)
        {
            if(i < str.length())
            {
                for(j = 0; j < str.length(); ++j)
                {
                    if(i+j <= 4)
                        System.out.print(str.charAt(j)+"\t");
                    else
                        System.out.print("*\t");
                }
            }
            else
            {
                for(j = 0; j < str.length(); ++j)
                {
                    if(i-j >= 4)
                        System.out.print(str.charAt(j)+"\t");
                    else
                        System.out.print("*\t");
                }
            }
            System.out.println();
        }
    }
}

class Program39_4
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