/*
    Accept string and display frequency of each word

    Input : India is Demo India Hello Demo
    Output: India   2
            is      1
            Demo    2
            Hello   1
*/

import java.util.*;

class Arithmetic
{
    public int totalWords(String str)
    {
        int total_words = 1;
        for(int iCnt = 0; iCnt < str.length(); ++iCnt)
        {
            if(str.charAt(iCnt) == ' ')
                total_words++;
        }
        return total_words;
    }

    public char[][] toWordArray(String str, int total_words)
    {
        char word[][] = new char[total_words][10];
        int wordindex = 0;
        int charindex = 0;
        for(int iCnt = 0; iCnt < str.length(); ++iCnt)
        {
            if(str.charAt(iCnt) == ' ')
            {
                wordindex++;
                charindex = 0;
                continue;
            }
            word[wordindex][charindex] = str.charAt(iCnt);
            charindex++;
        }

        return word;
    }

    public int totalOccurence(char ch[][], char word[])
    {
        int iCnt = 0, iOcc = 0;
        int i = 0;
        int j = 0;
        for(i = 0; i < ch.length; ++i)
        {
            if(ch[i].length == word.length)
            {
                for(j = 0; j < word.length; ++j)
                {
                    if(ch[i][j] == word[j])
                        iCnt++;
                }
                if(iCnt == word.length)
                    iOcc++;
                iCnt = 0;
            }
        }
        return (iOcc);
    }

    public String[] charArrayToStringArray(char words[][])
    {
        String string[] = new String[words.length];
        for(int iCnt = 0; iCnt < words.length; ++iCnt)
            string[iCnt] = String.valueOf(words[iCnt]);

        return string;
    }

    public void displayFrequency(String str)
    {
        char words[][] = toWordArray(str, totalWords(str));
        String string[] = charArrayToStringArray(words);
        int i = 0;
        int j = 0;

        for(i = 0; i < words.length; ++i)
        {
            for(j = 0; j < i; ++j)
            {
                if(string[i].equals(string[j]))
                    break;
            }
            if(i == j)
                System.out.println(string[i]+"\t"+totalOccurence(words,words[i]));            
        }
    }
}
                
class Program45_2
{
    public static void main(String a[])
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter string:");
        String str = scan.nextLine();

        Arithmetic aobj = new Arithmetic();

        // char crr[][] = aobj.toWordArray(str, aobj.totalWords(str));
        // int iret = aobj.totalOccurence(crr,crr[0]);
        // System.out.println(iret);

        aobj.displayFrequency(str);
    }
}
