/*
    Accept string from user and display below pattern

    Input:  Hello
    Output: H   e   l   l   o 
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
        for(int i = 0; i < str.length(); ++i)
        {
            for(int j = 0; j < str.length()-i; ++j)
            {
                System.out.print(str.charAt(j)+"\t");
            }
            System.out.println();
        }
    }
}

class Program38_2
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