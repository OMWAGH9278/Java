import java.io.*;

class ReadFile
{
    public static void main(String a[]) throws IOException
    {
        FileInputStream fobj = new FileInputStream("Marvellous.txt");
        int i = 0;

        while((i = fobj.read()) != -1)
        {
            System.out.print((char)i);
        }
        System.out.println();
        fobj.close();
    }
}