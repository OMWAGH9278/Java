/*
    Accept array of characters and return number of vowels

    Input : b   N   e   B   R   b   A   i   G   i
    Output: 4
*/

import java.util.*;

class ArrayX
{
    public char array[];

    public ArrayX(int size)
    {
        array = new char[size];
    }

    public void accept()
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter elements of array:");
        for(int iCnt = 0; iCnt < array.length; ++iCnt)
            array[iCnt] = scan.next().charAt(0);
    }

    public void display()
    {
        System.out.println("Elements of array are:");

        for(int iCnt = 0; iCnt < array.length; ++iCnt)
            System.out.print(array[iCnt]+"\t");
        
        System.out.println();
    }
}

class Arithmetic extends ArrayX
{
    public Arithmetic(int size)
    {
        super(size);
    }

    public int countVowels()
    {
        int iVowelCnt = 0;
        for(int iCnt = 0; iCnt < array.length; ++iCnt)
        {
            if( (array[iCnt] == 'A') || (array[iCnt] == 'E')
                    || (array[iCnt] == 'I') || (array[iCnt] == 'O')
                    || (array[iCnt] == 'U') || (array[iCnt] == 'a')
                    || (array[iCnt] == 'e') || (array[iCnt] == 'i')
                    || (array[iCnt] == 'o') || (array[iCnt] == 'u') )
                iVowelCnt++;
        }
        return (iVowelCnt);
    }
}

class Program44_2
{
    public static void main(String a[])
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int array_size = scan.nextInt();

        Arithmetic myarray = new Arithmetic(array_size);
        myarray.accept();

        int iRet = myarray.countVowels();
        System.out.println(iRet);
    }
}
