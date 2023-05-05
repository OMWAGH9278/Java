/*
    Accept array of characters and one character
    Return occurence of that character without considering case

    Input : b   N   e   B   R   b   A   i   G   i   B
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

    public int search(char ch)
    {
        int iOccurence = 0;
        for(int iCnt = 0; iCnt < array.length; ++iCnt)
        {
            if( (array[iCnt] == Character.toLowerCase(ch)) || (array[iCnt] == Character.toUpperCase(ch)) )
                iOccurence++;
        }
        return (iOccurence);
    }
}

class Program44_3
{
    public static void main(String a[])
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int array_size = scan.nextInt();

        Arithmetic myarray = new Arithmetic(array_size);
        myarray.accept();

        System.out.println("Enter character to search in array :");
        char ch = scan.next().charAt(0);

        int iRet = myarray.search(ch);
        System.out.println(iRet);
    }
}
