import java.io.*;

class CreateFile
{
    public static void main(String a[]) throws IOException
    {
        File fobj = new File("Marvellous.txt");

        if(fobj.createNewFile())
        {
            System.out.println("File created Successfully");
        }
        else
        {
            System.out.println("Unable to create the file");
        }
    }
}