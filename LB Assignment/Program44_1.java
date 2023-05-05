/*
    Accept array of characters and replace each capital letter 
    with its corresponding small letter

    Input : b   N   j   B   R   b   A   d   G   G
    Output: b   n   j   b   r   b   a   d   g   g
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

    public void capitalReplace()
    {
        for(int iCnt = 0; iCnt < array.length; ++iCnt)
        {
            if((array[iCnt] >= 'A') && (array[iCnt] <= 'Z'))
                array[iCnt] = Character.toLowerCase(array[iCnt]);
        }
    }
}

class Program44_1
{
    public static void main(String a[])
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int array_size = scan.nextInt();

        Arithmetic myarray = new Arithmetic(array_size);
        myarray.accept();
        myarray.display();

        myarray.capitalReplace();
        myarray.display();
    }
}
