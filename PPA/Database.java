
import java.sql.*;

import com.mysql.jdbc.Driver;

class Database
{
    public static void main(String a[]) throws Exception
    {
        String URL = "jdbc:mysql://localhost:3306/ppa41";
        String Username = "root";
        String Password = "";
        String Query = "select * from student";

        Connection cobj = DriverManager.getConnection(URL,Username,Password);

        Statement sobj = cobj.createStatement();

        ResultSet robj = sobj.executeQuery(Query);

        while(robj.next())
        {
            System.out.println("RID : "+robj.getInt("RID"));
            System.out.println("Name : "+robj.getString("Name"));
            System.out.println("City : "+robj.getString("City"));
            System.out.println("Marks : "+robj.getInt("Marks"));
        }
    } 
}
