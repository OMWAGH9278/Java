import java.net.*;
import java.io.*;

public class Client2
{
    public static void main(String a[]) throws Exception
    {
        System.out.println("Client application is running..");

        Socket s = new Socket("localhost",2100);
        System.out.println("Client is waiting for the server to accept the request");

        PrintStream ps= new PrintStream(s.getOutputStream());

        BufferedReader br1 = new BufferedReader(new InputStreamReader(s.getInputStream()));
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));

    }
}