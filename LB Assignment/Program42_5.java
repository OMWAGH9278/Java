/*
    Accept two arrays from user and check whether that array 
    and its elements are palindrome or not

    Input : 11      252     387783      252     11
    Output: TRUE 

    Input : 11      252     387783      77     11
    Output: FALSE

    Input : 11      252     786      252     11
    Output: FALSE

    Input : 11      252     786      253     11
    Output: FALSE     
*/

import java.util.*;

class ArrayX
{
    public int array[];
    public String str;

    public ArrayX(String array_number, int size)
    {
        str = array_number;
        array = new int[size];
    }

    public void accept()
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter elements of "+str+" array:");
        for(int iCnt = 0; iCnt < array.length; ++iCnt)
            array[iCnt] = scan.nextInt();
    }

    public void display()
    {
        System.out.println("Elements of "+str+" array are:");

        for(int iCnt = 0; iCnt < array.length; ++iCnt)
            System.out.print(array[iCnt]+"\t");
        
        System.out.println();
    }
}

class Arithmetic extends ArrayX
{
    public Arithmetic(String array_number, int size)
    {
        super(array_number,size);
    }

    public int[] copyArray()
    {
        int new_array[] = new int[array.length];

        for(int i = 0; i < array.length; ++i)
            new_array[i] = array[i];

        return (new_array);
    }

    public int revElement(int iNo)
    {
        int digit = 0, iCnt = 0, iRev = 0;

        while(iNo != 0)
        {
            digit = iNo % 10;
            iRev = (iRev*10) + digit;
            iNo = iNo / 10;
        }

        return (iRev);
    }

    public boolean checkEachElementPalindrome()
    {
        int digit = 0, iCnt = 0, iRev = 0;
        int arr[] = new int[array.length];
        arr = copyArray();

        for(iCnt = 0; iCnt < arr.length; ++iCnt)
        {
            iRev = revElement(arr[iCnt]);
            if(array[iCnt] != iRev)
                break;
            iRev = 0;                
        }

        if(iCnt == array.length)
            return true;
        else
            return false;
    }

    public int[] reverseArray()
    {
        int rev_array[] = new int[array.length];
        for(int i = 0, j = array.length-1; i < array.length; ++i, --j)
            rev_array[i] = array[j];

        return (rev_array);
    }

    public boolean checkArrayPalindrome()
    {
        int reverse_array[] = reverseArray();
        int iCnt = 0;

        for(iCnt = 0; iCnt < array.length; ++iCnt)
        {
            if(reverse_array[iCnt] != array[iCnt])
                break;
        }
        
        if(iCnt == array.length)
            return true;
        else
            return false;
    }
}

class Program42_5
{
    public static void main(String a[])
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter size of first array:");
        int first_array_size = scan.nextInt();

        Arithmetic first_array = new Arithmetic("FIRST", first_array_size);
        first_array.accept();
        first_array.display();

        if((first_array.checkEachElementPalindrome() == true) && (first_array.checkArrayPalindrome() == true))
            System.out.println("TRUE");
        else
            System.out.println("FALSE");
        
        System.out.println("Enter size of second array:");
        int second_array_size = scan.nextInt();

        Arithmetic second_array = new Arithmetic("SECOND", second_array_size);
        second_array.accept();
        second_array.display();

        if((second_array.checkEachElementPalindrome() == true) && (second_array.checkArrayPalindrome() == true))
            System.out.println("TRUE");
        else
            System.out.println("FALSE");
    }
}